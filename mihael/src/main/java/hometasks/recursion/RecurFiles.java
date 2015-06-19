package hometasks.recursion;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Администратор on 19.06.2015.
 */
public class RecurFiles {
    HashSet<String> directories = new HashSet<>();
    File[] files = new File("D:\\").listFiles();
    Map<String, List<String>> map = new HashMap<>();

    public static void main (String[] args){
        RecurFiles recurFiles = new RecurFiles();
        System.out.println();
        recurFiles.readFileSystem();
    }
    public void readFileSystem() {
        File currentDir = new File("."); // current directory
        displayDirectoryContents(currentDir);
        System.out.println(map.toString());
    }
    public void displayDirectoryContents(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directory:" + file.getCanonicalPath());
                    map.put(file.getName(), new ArrayList<>());
                    displayDirectoryContents(file);
                } else {

                    System.out.println("     file:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
