package entity;


import home_works.Employee.Employee;

public class Developer extends Employee {


    public Developer(String name, String secondName, double salary, String platform, String language) {
        super(name, secondName, salary, platform);
        this.language = language;
    }

    public String language;



    @Override
    public String toString() {
        return language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
