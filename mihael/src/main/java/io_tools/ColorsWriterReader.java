package io_tools;

import entities.factory.Color;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Администратор on 03.04.2015.
 */
public class ColorsWriterReader extends CommonWriterReader {
    private ArrayList<Color> colors = new ArrayList<>();

    public ColorsWriterReader() {
    }
    public ColorsWriterReader(ArrayList<Color> colors) {
        this.colors = colors;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "ColorsWriterReader{" +
                "colors=" + colors +
                '}';
    }

    @Override
    public  void readFile(String path) throws IOException {


        File file = new File(path);
        FileReader reader= new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line=buffer.readLine())!=null){
            Color color = new Color();
            color.setColorName(line);
            colors.add(color);
        }
    };
    @Override
    public void writeFile (String path) throws IOException{
        File file = new File(path);
        FileWriter writer = new FileWriter(file,super.getAppend());
        for(int i=0; i < colors.size();i++){
            writer.write((String)colors.get(i).getColorName());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    };

}
