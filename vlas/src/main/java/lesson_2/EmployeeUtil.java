package lesson_2;


public class EmployeeUtil {
    public static Employee[] getEmployees() {
    Employee e1 = new Employee ("Vasya", "Ivanow", 3000.00);
    Employee e2 = new Employee ("Vasya", "Petrov", 5000.00);
    Employee e3 = new Employee ("Sergey", "Sidorov", 7000.00);
    Employee e4 = new Employee ("Caley", "Ivanowa", 13000.00);
    Employee e5 = new Employee ("Zhora", "Simonov", 33000.00);
    Employee e6 = new Employee ("Jack", "Woker", 28000.00);
    Employee e7 = new Employee ("Lora", "Smith", 75000.00);
    Employee e8 = new Employee ("Sioma", "James", 300000.00);
    Employee e9 = new Employee ("Marco", "Pantani", 5673000.00);
        return new Employee [] {e1,e2,e3,e4,e5,e6,e7,e8,e9};

    }
}
