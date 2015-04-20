package apps.employees;


public class Admin extends Employee {
    public String workingPlatform;

    public Admin(){

    }
    public String toString() {
        return getName() + " " + " " + getSecondName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() + '\'' + ", salary=" + getSalary() + ", workingPlatform=" + getWorkingPlatform() +
                '}';
    }

    public String getWorkingPlatform() {
        return workingPlatform;
    }
    public void setWorkingPlatform(String workingPlatform) {
        this.workingPlatform = workingPlatform;
    }

    public Admin(String name, String secondName,String sex,int age, double salary, String workingPlatform) {
      super(name,secondName,sex,age,salary); // создание конструктора
        this.workingPlatform=workingPlatform;
    }
}
