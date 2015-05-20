package entity.company;


import sun.util.resources.LocaleData;

import java.util.Date;

public class Employee { // Создаем класс-шаблон ("формочку для печенек")
    private Date dateOfEmp;
    private LocaleData dateOfFire;
    protected String name;
    protected String secondName; // Объявляем еще одно поле класса. Их может быть сколько угодно
    protected double salary;
    protected String sex;
    protected int age;

    public Employee(String name, String secondName, double salary, String sex, int age){ // Это ЗАДАННЫЙ конструктор
        this.name =name;
        this.secondName = secondName;
        this.salary = salary;
        this.sex = sex;
        this.age = age;
    }

    public Employee(){} // Это конструктор ПО УМОЛЧАНИЮ, его нужно объявлять если создан искуственный конструктор

    public Date getDateOfEmp() {
        return dateOfEmp;
    }

    public void setDateOfEmp(Date dateOfEmp) {
        this.dateOfEmp = dateOfEmp;
    }

    public LocaleData getDateOfFire() {
        return dateOfFire;
    }

    public void setDateOfFire(LocaleData dateOfFire) {
        this.dateOfFire = dateOfFire;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setSecondName(String secondName) { this.secondName = secondName; }
    public String getSecondName() { return secondName; }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }

    public void setSex(String sex) { this.sex = sex; }
    public String getSex() { return sex; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return  name +" "+ secondName +" "+salary+" "+sex+" "+ age;
    }
}