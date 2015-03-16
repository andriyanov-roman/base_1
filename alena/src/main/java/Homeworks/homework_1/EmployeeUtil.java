package Homeworks.homework_1;

import java.util.ArrayList;

/**
 * Created by MacBook on 16.03.15.
 */
public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee ("Vitaly", "Klichko", 300000.00, "male", 39));
        employees.add( new Employee ("Piter", "Poroshenko", 500000.00, "male", 55));
        employees.add( new Employee ("Boris", "Filatov", 5000.00, "male", 37));
        employees.add( new Employee ("Julia", "Timochenko", 15000.00, "female", 60));
        employees.add( new Employee ("Arsenii", "Levochkin", 100000.00, "male", 44));
        employees.add( new Employee ("Igor", "Kolomoiskiy", 150000.00, "male", 45));
        employees.add( new Employee ("Volodymyr", "Parasiyk", 3000.00, "male", 26));
        employees.add( new Employee ("Borislav", "Beresa", 4000.00, "male", 42));
        employees.add(new Employee ("Arsenii", "Yatseniyk", 40000.00, "male", 37));
        return employees;

    }
}
