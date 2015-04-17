package home_task6;


public class Person extends University{
    private String name;
    private String secondName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Person(String nameUniver, int accreditationLevel, String facultyList, String name, String secondName) {
        super(nameUniver, accreditationLevel, facultyList);
        this.name = name;
        this.secondName = secondName;
    }
}
