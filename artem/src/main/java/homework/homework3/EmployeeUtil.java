package homework.homework3;


import java.util.ArrayList;

public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees() {
        Employee e1 = new Employee("Vasya", "Ivanow", 3000.13, "male", 32); // создаем объект класса Employee (випекаем печеньку)

        ArrayList<Employee> employees = new ArrayList<>(); // Объявляем новую параметризированную (<Employee>) коллекцию
        employees.add(e1); // можно добавлять уже созданный объект
        employees.add(1, new Employee("Vasya", "Petrov", 5000.00, "male", 18)); // а можно и сразу создавать объект
        employees.add(2, new Employee("Sergey", "Antany", 87000.75, "male", 23)); // "2" это индекс ячейки
        employees.add(3, new Employee("Caley", "Ivanowa", 13000.00, "female", 20)); // но "дырки" в коллекции оставлять нельзя
        employees.add(4, new Employee("Zhora", "Dum", 33000.00, "male", 21));
        employees.add(5, new Employee("Jack", "Woker", 287000.83, "male", 44));
        employees.add(new Employee("Lora", "Compy", 75000.00, "female", 22)); // эти объекты он добавляет в конец коллекции
        employees.add(new Employee("Jack", "Woker", 301000.91, "male", 28));
        employees.add(new Employee("Marco", "Bory", 5673000.00, "female", 20));

        return employees;
    }
}
