package Homeworks.homework_1;

/**
 * Created by MacBook on 16.03.15.
 */
public class EmployeeUtil {
    public static Employee[] getEmployees() {
        Employee e1 = new Employee ("Vitaly", "Klichko", 300000.00, "male", 39);
        Employee e2 = new Employee ("Piter", "Poroshenko", 500000.00, "male", 55);
        Employee e3 = new Employee ("Boris", "Filatov", 5000.00, "male", 37);
        Employee e4 = new Employee ("Julia", "Timochenko", 15000.00, "female", 60);
        Employee e5 = new Employee ("Arsenii", "Levochkin", 100000.00, "male", 44);
        Employee e6 = new Employee ("Igor", "Kolomoiskiy", 150000.00, "male", 45);
        Employee e7 = new Employee ("Volodymyr", "Parasiyk", 3000.00, "male", 26);
        Employee e8 = new Employee ("Borislav", "Beresa", 4000.00, "male", 42);
        Employee e9 = new Employee ("Arsenii", "Yatseniyk", 40000.00, "male", 37);
        return new Employee [] {e1,e2,e3,e4,e5,e6,e7,e8,e9};

    }
}
