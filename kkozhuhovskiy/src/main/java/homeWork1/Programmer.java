package homeWork1;

/**
 * Created by Kirill on 25.03.2015.
 */
public class Programmer {
    private String name;
    private String secondName;
    private double salary;
    private String gender;
    private int age;
    private String programmingLanguage;


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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }



    public Programmer(String name, String secondName, String gender, double salary, int age, String programmingLanguage) {
        this.name = name;
        this.secondName = secondName;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
        this.programmingLanguage = programmingLanguage;
    }
}
