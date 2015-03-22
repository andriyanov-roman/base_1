package homework.hw_2;


import lessons.lesson_2.Employee;

/**
 * Created by PC XP on 29.01.15.
 */
public class EmployeeUtil {
  public static homework.hw_2.Employee[] getEmployees() {
      homework.hw_2.Employee e1 = new homework.hw_2.Employee("Vasya", "Ivanow", 3000.00, 40, "m");
      homework.hw_2.Employee e2 = new homework.hw_2.Employee("Vasya", "Petrov", 5000.00, 39, "m");
      homework.hw_2.Employee e3 = new homework.hw_2.Employee("Sergey", "Sidorov", 7000.00, 23,"m" );

      homework.hw_2.Employee e4 = new homework.hw_2.Employee("Caley", "Ivanowa", 13000.00, 25, "f");
      homework.hw_2.Employee e5 = new homework.hw_2.Employee("Zhora", "Simonov", 33000.00, 56, "m");
      homework.hw_2.Employee e6 = new homework.hw_2.Employee("Jack", "Woker", 28000.00, 87, "m");

      homework.hw_2.Employee e7 = new homework.hw_2.Employee("Lora", "Smith", 75000.00, 100, "f");
      homework.hw_2.Employee e8 = new homework.hw_2.Employee("Sioma", "James", 300000.00, 74, "m");
      homework.hw_2.Employee e9 = new homework.hw_2.Employee("Marco", "Pantani", 5673000.00, 98, "m");
      return new homework.hw_2.Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9};
    }
}