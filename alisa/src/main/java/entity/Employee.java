package entity;

import java.util.Calendar;

/**
 * Created by admin on 16.03.15.
 */
public class Employee {

    private String name;
    private String surname;
    private double salary;
    private int age;
    private String sex;
    private Calendar dateOfEmployment;

    public Employee(String name, String surname, double salary, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public Calendar getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Calendar dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                '}';
    }
}
