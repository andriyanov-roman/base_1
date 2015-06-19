package lections.lesson18.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Администратор on 18.05.2015.
 */
public class FileIO02 {
    public static void main (String[] args) {
        File file = new File("mihael/src/main/java/lections/lesson18/io/FileIO02.txt");
        //Write your name and age to the file

        /*
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Mike Fudge");
            output.println(43);
            output.close();
        }catch (IOException ex){
            System.out.printf("ERROR: %s\n,",ex);
        }
        */

        //Read from the file
        try{
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.printf("Name: %s Age %d\n",name,age);
        }catch (FileNotFoundException ex){
            System.out.printf("ERROR: %s\n",ex);
        }

    }
}
