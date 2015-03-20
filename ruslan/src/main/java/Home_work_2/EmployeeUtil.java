package home_work_2;


public class EmployeeUtil {
    public static Employee[] getEmployees() {
        Employee e1 = new Employee();
        e1.name = "John";
        e1.secondName = "Stockton";
        e1.salary = 5950.50;
        e1.age = 25;
        e1.gender = "Male";
        Employee e2 = new Employee();
        e2.name = "Michael";
        e2.secondName = "Jordan";
        e2.salary = 11000.50;
        e2.age = 57;
        e2.gender = "Male";
        Employee e3 = new Employee();
        e3.name = "Derrick";
        e3.secondName = "Rose";
        e3.salary = 8000.80;
        e3.age = 35;
        e3.gender = "Male";
        Employee e4 = new Employee();
        e4.name = "John";
        e4.secondName = "Stockton";
        e4.salary = 5500.50;
        e4.age = 27;
        e4.gender = "Male";
        Employee e5 = new Employee();
        e5.name = "Julia";
        e5.secondName = "Corn";
        e5.salary = 5570.50;
        e5.age = 21;
        e5.gender = "Female";
        return new Employee[]{e1, e2, e3, e4, e5};
    }
}

