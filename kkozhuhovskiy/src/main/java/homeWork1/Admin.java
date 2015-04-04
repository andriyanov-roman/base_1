package homeWork1;

/**
 * Created by Kirill on 25.03.2015.
 */
public class Admin extends Employee{
    public String getWorkingPlatform() {
        return workingPlatform;
    }

    public void setWorkingPlatform(String workingPlatform) {
        this.workingPlatform = workingPlatform;
    }

    private String workingPlatform;

}
