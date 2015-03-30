package home_works.developers;


import home_works.Employee.Employee;

public class Developer extends Employee {




    public Developer(String name, String secondName, String gender, int age, double salary, String language) {
        super(name, secondName, gender, age, salary);
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
