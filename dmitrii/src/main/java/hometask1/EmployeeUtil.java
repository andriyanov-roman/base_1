package hometask1;

import entities.Employee;
/**
 * Created by mit_OK! on 14.03.2015.
 */
public class EmployeeUtil {
    public static Employee[] getEmployees () {
        Employee e1 = new Employee();
        e1.setName("John");
        e1.setSurname("Lennon");
        e1.setSalary(3205.55);
        
        Employee e2 = new Employee();
        e2.setName("Bill");
        e2.setSurname("Gates");
        e2.setSalary(80_000.01);
        
        Employee e3 = new Employee();
        e3.setName("Steve");
        e3.setSurname("Jobs");
        e3.setSalary(15_000.24);
        
        Employee e4 = new Employee();
        e4.setName("Linus");
        e4.setSurname("Torvalds");
        e4.setSalary(50);
        
        Employee e5 = new Employee();
        e5.setName("Artemiy");
        e5.setSurname("Lebedev");
        e5.setSalary(4800);

        Employee e6 = new Employee();
        e6.setName("Bill");
        e6.setSurname("Gates");
        e6.setSalary(89_999.01);

        Employee e7 = new Employee();
        e7.setName("Linus");
        e7.setSurname("Torvalds");
        e7.setSalary(51.5);

        Employee e8 = new Employee();
        e8.setName("Bill");
        e8.setSurname("Gates");
        e8.setSalary(90_000);

        Employee e9 = new Employee();
        e9.setName("Bill");
        e9.setSurname("Gates");
        e9.setSalary(99_999);
        
        return new Employee[] {e1,e2,e3,e4,e5,e6,e7,e8,e9};
    }
}
