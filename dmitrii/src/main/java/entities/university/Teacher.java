package entities.university;

import entities.Human;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class Teacher extends Human {
    private Subject subject;
    private Double salary;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n * "+super.toString()+", Salary: " + salary +"$"+
                ", Subjects: " + subject ;
    }
}
