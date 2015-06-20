package apps.os_grabber;

import org.apache.commons.io.FilenameUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by mit_OK! on 18.06.2015.
 */
public class FileFinder {
    public static final String DIR_TAG = "dir";
    public static final String DIR_ATTR = "dirName";
    public static final String FILE_TAG = "file";
    public static final String FILES_EXTENSION = "ext";
    public static final String FILES_SIZE = "size";
    public static final String FILES_HIDDEN = "hidden";
    public static final String FILES_NOT_HIDDEN = "notHidden";

    private Document document;
    private Element dir;
    private Element currentDir;
    private HashSet<FileInfo> containerFileInfo;

    public FileFinder() {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        assert documentBuilder != null;
        document = documentBuilder.newDocument();
        dir = document.createElement("files");
        document.appendChild(dir);
        containerFileInfo = new HashSet<>();
        currentDir = document.createElement("begin");
    }

    public void findFiles(File file) {
        if (file.isDirectory()) {
            ArrayList<File> fileArrayList = new ArrayList<>(Arrays.asList(file.listFiles()));
            fileArrayList.sort(Comparator.comparing(File::isDirectory));
            for (File f : fileArrayList) {
                findFiles(f);
            }
        } else {
            String extension = "undefined";
            try {
                extension = FilenameUtils.getExtension(file.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (FileInfo fileInfo : containerFileInfo) {
                if (fileInfo.getExtension().equals(extension)) {
                    fileInfo.plusFile(file);
                    return;
                }
            }
            FileInfo fileInfo = new FileInfo(extension);
            fileInfo.plusFile(file);
            containerFileInfo.add(fileInfo);
            return;
        }
        currentDir = document.createElement(DIR_TAG);
        currentDir.setAttribute(DIR_ATTR, file.getName());
        for (FileInfo fileInfo : containerFileInfo) {
            Element fileTag = generateFileTag(fileInfo);
            currentDir.appendChild(fileTag);
        }
        dir.appendChild(currentDir);
        return;
    }

    private Element generateFileTag(FileInfo fileInfo) {
        Element fileTag = document.createElement(FILE_TAG);
        fileTag.setAttribute(FILES_EXTENSION, fileInfo.getExtension());
        fileTag.setAttribute(FILES_SIZE, fileInfo.getFileSize().toString());
        fileTag.setAttribute(FILES_HIDDEN, fileInfo.getHidden() + "");
        fileTag.setAttribute(FILES_NOT_HIDDEN, fileInfo.getNotHidden() + "");
        fileTag.appendChild(document.createTextNode(fileInfo.getQuantity() + ""));
        containerFileInfo = new HashSet<>();
        return fileTag;
    }

    public void writeXMLfile(String XMLfileName) {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result =
                    new StreamResult(new FileWriter("dmitrii\\src\\main\\resources\\xml\\" + XMLfileName + ".xml"));
            transformer.transform(source, result);
            StreamResult resultStream = new StreamResult(System.out);
            transformer.transform(source, resultStream);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
