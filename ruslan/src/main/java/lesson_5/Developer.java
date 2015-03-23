package lesson_5;


public class Developer {
    public String name;
    public String secondName;
    public double salary;
    public String language;

    public Developer(String name, String secondName, double salary, String language) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.language = language;
    }

    @Override
    public String toString() {
        return name + secondName + salary + language;
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
}
