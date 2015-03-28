package Lessons.LessonTwo;

import Homeworks.homework_1.Employee;
import Lessons.LessonTwo.lesson_3.Admin;
import Lessons.LessonTwo.lesson_3.Manager;
import Lessons.LessonTwo.lesson_3.Programmer;

import java.util.ArrayList;

/**
 * Created by user on 16.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return companyName + " " + " " + employees;
    }
}
