package Homeworks.homework_1;

import Lessons.LessonTwo.Company;

/**
 * Created by MacBook on 16.03.15.
 */
public class Employee extends Company {
    private String name;
    private String secondName;
    private double salary;
    private String sex;
    private int age;


    public Employee (String a, String b, double c, String d, int e){
        this.name = a ;
        this.secondName = b;
        this.salary = c;
        this.sex = d;
        this.age = e;
    }

    public Employee () {

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
        this.name = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + " " + secondName + " " + " " + salary + " " + " " + age + " " + " " + sex;
    }


}
