package home_works.сompany.entities.company;

import entity.Human;

/**
 * Created by user on 17.04.2015.
 */
public class Employee extends Human {
    private Double salary;
    private String gender;

    public Employee(Double salary, String gender) {
        this.salary = salary;
        this.gender = gender;
    }

    public Employee() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getName() + " " + " " + getSecondName() + " " + " " + salary + " " + " " + getAge() + " " + " " + gender;
    }
}
