package lesson_3;


import home_tasks_1.Employee.Employee;

public class EmployeesUtil {
    public static Employee[] getEmployee() {
        Employee e1 = new Employee();
        e1.name = "John";
        e1.secondName = "Stockton";
        e1.salary = 5950.50;

        Employee e2 = new Employee();
        e2.name = "Michael";
        e2.secondName = "Jordan";
        e2.salary = 11000.50;
        Employee e3 = new Employee();
        e3.name = "Derrick";
        e3.secondName = "Rose";
        e3.salary = 8000.80;
        Employee e4 = new Employee();
        e4.name = "John";
        e4.secondName = "Stockton";
        e4.salary = 5500.50;
        return new Employee[]{e1, e2, e3, e4};
    }
}
