package modules.consoleApp.university;

import entity.university.University;

import java.io.IOException;

/**
 * Created by R-Tem on 05.04.2015.
 */
public class View {
    public static void menu() {
        System.out.println(" Welcome to University util! Select an option, please:" +
                "\n1 to get university with the best academic performance of students" +
                "\n2 to add student" +
                "\n3 to get students whose GPA (grade point average) falls within a given range" +
                "\n4 to raise salary for teacher at 10%");
    }
    public static void getMaxProgressUniv() throws IOException{
        University maxProgressUniv = Body.getMaxProgressUniv();
        System.out.println("University " + maxProgressUniv.getTitle() + " has the maximal average rating: " + maxProgressUniv.getProgressAverage());
    }
}
