package view.consoleApp;

import validate.UniversityDataValidator;

import java.util.Scanner;

/**
 * Created by R-Tem on 13.04.2015.
 */
public class UniversityView {
    protected Scanner scanner;
    private UniversityDataValidator validator;

    public UniversityView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String menu(){
        String s = "\n '1' to get university with the best academic performance of students" +
                "\n '2' to add student" +
                "\n '3' to get students whose GPA (grade point average) falls within a given range" +
                "\n '4' to raise salary for teacher at 10%" +
                "\n 'r' to return" +
                "\n 'e' to Exit program";
        System.out.println(" Welcome to University util! Select an option, please:" + s);
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1": return "getMaxProgressUniv";
                case "2": return "addStudent";
                case "3": return "getStudentsGPA";
                case "4": return "raiseSalary";
                case "r": return "return";
                case "e": System.exit(0);
                default:System.out.println("No such case! Try again:" + s);
            }
        }
        return null;
    }
    public String showResult(String s){
        String result = s;
        switch (s){

        }

        return result;
    }
}
