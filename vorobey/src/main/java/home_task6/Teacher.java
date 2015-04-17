package home_task6;


public class Teacher extends Person{
    private double salary;
    public String teacherObject;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String nameUniver, int accreditationLevel, String facultyList, String name, String secondName, double salary, String teacherObject) {
        super(nameUniver, accreditationLevel, facultyList, name, secondName);
        this.salary = salary;
        this.teacherObject = teacherObject;
    }
}
