package entity;


import home_works.Employee.Employee;

public class SystemAdm extends Employee{


    public SystemAdm(String name, String secondName, double salary, String platform) {
        super(name, secondName, salary, platform);
        this.platform = platform;
    }



    @Override
    public String toString() {
       return getName() + getSecondName() + getSalary() + getPlatform();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }


    public String platform;
}
