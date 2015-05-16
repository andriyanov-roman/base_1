package apps.calendar.task12;

import entities.company.Employee;

import java.time.LocalDate;

/**
 * Created by mit_OK! on 16.05.2015.
 */
public class Worker extends Employee {
    private LocalDate dateOfEmployment;

    public Worker(String name, String surname, Double salary, Boolean gender, int age, LocalDate dateOfEmployment) {
        super(name, surname, salary, gender, age);
        this.dateOfEmployment = dateOfEmployment;
    }

    public Worker() {
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
