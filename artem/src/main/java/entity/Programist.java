package entity;

/**
 * Created by user on 23.03.2015.
 */
public class Programist {
    private String name;
    private String secondName; // Объявляем еще одно поле класса. Их может быть сколько угодно
    private double salary;
    private String progLang;


    public Programist(String name, String secondName, double salary, String progLang) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.progLang = progLang;
    }

    public Programist(){}

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setSecondName(String secondName) { this.secondName = secondName; }
    public String getSecondName() { return secondName; }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }

    public String getProgLang() { return progLang; }
    public void setProgLang(String progLang) { this.progLang = progLang; }

    @Override
    public String toString() { return name +secondName + salary + progLang ; }


}
