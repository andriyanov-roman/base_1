package hometask1;

/**
 * Created by mit_OK! on 14.03.2015.
 */
public class EmployeeUtil {
    public static Employee[] getEmployees () {
        Employee e1 = new Employee();
        e1.name = "John";
        e1.surname="Lennon";
        e1.salary = 3205.55;
        
        Employee e2 = new Employee();
        e2.name = "Bill";
        e2.surname="Gates";
        e2.salary = 80_000.01;
        
        Employee e3 = new Employee();
        e3.name = "Steve";
        e3.surname="Jobs";
        e3.salary = 15_000.24;
        
        Employee e4 = new Employee();
        e4.name = "Linus";
        e4.surname="Torvalds";
        e4.salary = 50;
        
        Employee e5 = new Employee();
        e5.name = "Artemiy";
        e5.surname="Lebedev";
        e5.salary = 4800;

        Employee e6 = new Employee();
        e6.name = "Bill";
        e6.surname="Gates";
        e6.salary = 89_999.01;

        Employee e7 = new Employee();
        e7.name = "Linus";
        e7.surname="Torvalds";
        e7.salary = 51.5;

        Employee e8 = new Employee();
        e8.name = "Bill";
        e8.surname="Gates";
        e8.salary = 90_000;

        Employee e9 = new Employee();
        e9.name = "Bill";
        e9.surname="Gates";
        e9.salary = 99_999;
        
        return new Employee[] {e1,e2,e3,e4,e5,e6,e7,e8,e9};
    }
}
