package controllers.consoleApp;

/**
 * Created by R-Tem on 13.04.2015.
 */
public class UniversityController {
    private String toDo;

    public UniversityController(String toDo) {
        this.toDo = toDo;
    }

    public String toDO(){
        String result;
        switch (toDo){
            case "getMaxProgressUniv":
                break;
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
