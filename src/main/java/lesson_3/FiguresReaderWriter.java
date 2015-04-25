package lesson_3;

import entity.figures.Figure;
import entity.figures.Triangle;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 04.04.2015.
 */
public class FiguresReaderWriter extends CommonWriterReader {
    private String path = "matveu\\src\\main\\java\\shapes";

    public ArrayList<Figure> getFigures() throws IOException{
        ArrayList<String[]> strings = readFromFile(path, ":");
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if("Triangle".equals(strings.get(i)[0])) {
                Triangle t = new Triangle();
                t.setHeight(Double.valueOf(strings.get(i)[1]));
                t.setSide(2);
                figures.add(t);
            }
        }
        return null;
    }

    public ArrayList<Figure> getFigures(String name) {
        File f = new File(path);
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(name.contains(FilenameUtils.removeExtension(files[i].getName()))) {

            }
        }
        return null;
    }



    @Override
    public Figure getEntity(String name) throws IOException{
        ArrayList<Figure> figures = getFigures();
        for (int i = 0; i < figures.size(); i++) {
            if(name.equals(figures.get(i).getName())) {
               return figures.get(i);
            }
        }
        return null;
    }
}
