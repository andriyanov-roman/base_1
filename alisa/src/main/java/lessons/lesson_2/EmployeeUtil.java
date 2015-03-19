package lessons.lesson_2;



/**
 * Created by PC XP on 29.01.15.
 */
public class EmployeeUtil {
  public static Employee[] getEmployees() {
      Employee e1 = new Employee ("Vasya", "Ivanow", 3000.00, 40, "m");
      Employee e2 = new Employee ("Vasya", "Petrov", 5000.00, 39, "m");
      Employee e3 = new Employee("Sergey", "Sidorov", 7000.00, 23,"m" );
      Employee e4 = new Employee("Caley", "Ivanowa", 13000.00, 25, "f");
      Employee e5 = new Employee ("Zhora", "Simonov", 33000.00, 56, "m");
      Employee e6 = new Employee ("Jack", "Woker", 28000.00, 87, "m");
      Employee e7 = new Employee ("Lora", "Smith", 75000.00, 100, "f");
      Employee e8 = new Employee("Sioma", "James", 300000.00, 74, "m");
      Employee e9 = new Employee ("Marco", "Pantani", 5673000.00, 98, "m");
        return new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9};




    }
}