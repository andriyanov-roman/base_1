package homeWork1;

/**
 * Created by Kirill on 28.03.2015.
 */
public class Manager extends Employee {

    public Manager(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    private String nameOfProject;


}


