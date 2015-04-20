package apps.universityMatveu;

public class Person {
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

   public Person(){

   }

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
}
