package lesson_5;


public class System_Adm {
    public String name;
    public String secondName;

    public System_Adm(String name, String secondName, double salary, String platform) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return name + secondName + salary + platform;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double salary;
    public String platform;
}
