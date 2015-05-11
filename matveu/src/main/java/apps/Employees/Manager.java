package apps.Employees;


public class Manager extends Employee{
    public String nameOfProject;

    public Manager() {

    }
    public String toString() {
        return getName() + " " + " " + getSecondName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() + '\'' + ", salary=" + getSalary() + ", projectName=" + getNameOfProject() +
                '}';
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }


    public Manager(String name, String secondName, String sex, int age, double salary, String nameOfProject) {
        super(name,secondName,sex,age,salary); // создание конструктора

        this.nameOfProject=nameOfProject;
    }
}