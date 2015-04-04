package factory;

import entities.Color;
import hometask3.CompanyUtil;
import io_tools.ColorsWriterReader;
import io_tools.IOTools;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Администратор on 03.04.2015.
 */
public class ColorUtils {
    public static void  main (String [] args)throws IOException {
        colorsMenu();
    }
    public static String path = "mihael/src/main/java/data/colors.txt";
    private static ArrayList<Color> colors = new ArrayList<>();
    public static void colorsMenu()throws IOException {

        System.out.println("To add colors input one by one");
        System.out.println("input SAVE to save colors");
        System.out.println("input LOAD to load colors in console");
        System.out.println("input SHOW to show colors in console");
        System.out.println("input EXIT to exit");
        Boolean cont = true;
        Scanner scanner = IOTools.scanner;
        while(cont){
            String input = scanner.next();
            Color color = new Color();
            switch (input){

                case "SAVE":
                    saveColorsToFile(colors);
                    break;
                case "LOAD":
                    colors = loadColorsFromFile();
                    //showArrayListString(words);
                    //break;
                case "SHOW":
                    showColors(colors);
                    break;

                case "EXIT":
                    cont = false;
                    break;
                default:
                    color.setColorName(input);
                    colors.add(color);
                    break;

            }

        }
    }

    public static void saveColorsToFile(String path, ArrayList<Color> colors) throws IOException{
        ColorsWriterReader cwr = new ColorsWriterReader();
        cwr.setColors(colors);
        cwr.writeFile(path);
    }
    public static void saveColorsToFile( ArrayList<Color> colors) throws IOException{
        ColorsWriterReader cwr = new ColorsWriterReader();
        cwr.setColors(colors);
        cwr.writeFile(path);
    }
    public static ArrayList<Color> loadColorsFromFile(String path)throws IOException{
        ColorsWriterReader cwr = new ColorsWriterReader();
        cwr.readFile(path);
        return cwr.getColors();
    }
    public static ArrayList<Color> loadColorsFromFile()throws IOException{
        ColorsWriterReader cwr = new ColorsWriterReader();
        cwr.readFile(path);
        return cwr.getColors();
    }

    public static void showColors(ArrayList<Color> colors ){
        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}
