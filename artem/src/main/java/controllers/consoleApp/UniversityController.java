package controllers.consoleApp;

import entity.university.University;
import modules.consoleApp.university.UnivModule;

import java.io.IOException;

/**
 * Created by R-Tem on 13.04.2015.
 */
public class UniversityController {
    private String toDo;

    public UniversityController(String toDo) {
        this.toDo = toDo;
    }

    public String toDO() throws IOException{
        String result;
        switch (toDo){
            case "getMaxProgressUniv":
                University univ = UnivModule.getMaxProgressUniv();
                return result = "1 " + univ.getTitle();
            case "addStudent":
                break;
            case "getStudentsGPA":
                break;
            case "raiseSalary":
                break;
            case "return": return "return";
        }
        return null;
    }
}
