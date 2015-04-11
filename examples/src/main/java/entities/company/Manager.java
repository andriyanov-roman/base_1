package entities.company;

/**
 * Created by Администратор on 11.04.2015.
 */
public class Manager extends Employee {
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
