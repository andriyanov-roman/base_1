package ua;

import entity.Employee;

import java.util.Comparator;

/**
 * Created by Администратор on 18.04.2015.
 */
public class CompareByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().length() > o2.getName().length()) return 1;
        if(o1.getName().length() < o2.getName().length()) return -1;
        return 0;
    }
}
