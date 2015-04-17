package home_works.university.entity_university;

import entity.Human;

/**
 * Created by user on 17.04.2015.
 */
public class Teacher extends Human {
    private String subject;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private Double salary;

    @Override
    public String toString() {
        return subject + salary;
    }
}
