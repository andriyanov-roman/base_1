package home_task2;


public class Programmer {
    private String name;
    private String secondName;
    private String sex;
    private String language;
    private int age;
    private double salary;


    public Programmer() {

    }

    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", sex=" + sex +
                ", age=" + age + '\'' + ", salary=" + salary + ", language=" + language +
                '}';
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Programmer(String name, String secondName, String sex, int age, double salary, String language) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.language = language;
    }
}
