package io_tools;

import entities.figures.Figure;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 05.04.2015.
 */
public class FigureWriteReader extends CommonWriterReader{

    public void FigureWriteReader(String path, String delimiter){
        super.setPath(path);
        super.setDelimiter(delimiter);
    }
    public void FigureWriteReader(){
        super.setPath("mihael/src/main/java/data/figures/figures.txt");
        super.setDelimiter(":");
    }

    @Override
    public void setObjects(Object[] objects) {
        ArrayList<String[]> strings = new ArrayList<>();

        //this.objects = objects;
    }

    @Override
    public  ArrayList<String[]> read(String path,String regEx) throws IOException {
        ArrayList<String[]> strings = super.read(super.getPath(), super.getDelimiter());
        return strings;
    }
    @Override
    public  ArrayList<String[]> read() throws IOException {
        ArrayList<String[]> strings = super.read(super.getPath(),super.getDelimiter());
        return strings;
    }
    private ArrayList<Figure> figures;
    public ArrayList<Figure> getFigures() {
        return this.figures;
    }
    public void setFigures(ArrayList<Figure> figures){
        this.figures = figures;
    }


}
