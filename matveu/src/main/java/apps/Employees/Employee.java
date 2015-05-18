package apps.Employees;

import java.util.Date;

public class Employee {
    private String name;
    private String secondName;
    private String sex;
    private int age;
    private double salary;
    private Date DateToWork;

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", DateToWork=" + DateToWork +
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public Date getDateToWork() {
        return DateToWork;
    }

    public void setDateToWork(Date dateToWork) {
        DateToWork = dateToWork;
    }

    public Employee(String name, String secondName, String sex, int age, double salary) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
       // this.DateToWork = dateToWork;
    }
}
