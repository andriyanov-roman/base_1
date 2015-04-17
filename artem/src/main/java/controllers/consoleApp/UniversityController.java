package controllers.consoleApp;

import entity.university.Student;
import entity.university.University;
import modules.consoleApp.university.UnivModule;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by R-Tem on 13.04.2015.
 */
public class UniversityController {
    protected Scanner scanner;
    private String toDo;

    public UniversityController(Scanner scanner, String toDo) {
        this.scanner = scanner;
        this.toDo = toDo;
    }

    public String toDO() throws IOException{
        String result;
        switch (toDo){
            case "getMaxProgressUniv":
                University univ = UnivModule.getMaxProgressUniv();
                return result = "1 " + univ.getTitle();
            case "addStudent":
                Student student = UnivModule.addStudent(scanner);
                return result = "2";
            case "getStudentsGPA":
                return result = "3";
            case "raiseSalary":
                return result = "4";
            case "return": return "return";
        }
        return null;
    }
}
