package entity;

import ua.IComparableTwo;

/**
 * Created by Администратор on 14.03.2015.
 */
public class Employee implements IComparableTwo<Employee>, Comparable<Employee> {
    private String name;
    private String secondName;
    private double salary;
    private String address;

    @Override
    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee() {

    }

    public Employee(String name, String secondName, double salary) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
    }

    @Override
    public void sortTwo(Employee employee) {

    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.getSalary()) return -1;
        if (this.salary < o.getSalary()) return 1;
        return 0;
    }
}
