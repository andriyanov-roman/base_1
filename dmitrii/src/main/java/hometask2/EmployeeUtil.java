package hometask2;

/**
 * Created by Dmitriy Lisunov on 14.03.2015.
 */
public class EmployeeUtil {
    public static Employee[] getEmployees () {
        Employee e1 = new Employee("John", "Lennon", 9_993_205.55, true, 27);
        Employee e2 = new Employee("Bill", "Gates", 80_000.01, true, 65);
        Employee e3 = new Employee("Steve", "Jobs", 15_000.24, true, 60);
        Employee e4 = new Employee("Linus","Torvalds", 50.00, true, 47);
        Employee e5 = new Employee("Marry", "Madison", 12_500.00, false, 53);
        Employee e6 = new Employee("Neil","Armstrong",89_999.01, true, 43 );
        Employee e7 = new Employee("Helen", "Perry", 57.00, false, 28);
        Employee e8 = new Employee("Martin", "Laurens", 90_000.0, true, 39);
        Employee e9 = new Employee("Clint", "Eastwood", 99_999.0, true, 44);
        Employee e10 = new Employee("Artemiy","Lebedev", 4800.00, true, 35);
        Employee e11 = new Employee("Artur","Lebedev", 8000.00, true, 14);
        return new Employee[] {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11};
    }
}
