package hometasks.hometask1;

/**
 * Created by Администратор on 12.03.2015.
 */
public class EmployeeUtil {
    public static Employee[] getEmployees(){


        Employee employee5 = new Employee();
        employee5.id = 15L;
        employee5.firstName = "Artem";
        employee5.lastName = "ArtemF";
        employee5.salary = 1500;

        Employee employee1 = new Employee();
        employee1.id = 14L;
        employee1.firstName = "Dmitrii2";
        employee1.lastName = "DmitriiF2";
        employee1.salary = 1100;


        Employee employee3 = new Employee();
        employee3.id = 3L;
        employee3.firstName = "Matveu";
        employee3.lastName = "MatveuF";
        employee3.salary = 2200;




        Employee employee6 = new Employee();
        employee6.id = 6L;
        employee6.firstName = "Matveu";
        employee6.lastName = "MatveuF";
        employee6.salary = 6000;

        Employee employee4 = new Employee();
        employee4.id = 24L;
        employee4.firstName = "Dmitrii";
        employee4.lastName = "Dmitrii";
        employee4.salary = 2100;

        Employee employee7 = new Employee();
        employee7.id = 37L;
        employee7.firstName = "Matveu";
        employee7.lastName = "MatveuF";
        employee7.salary = 1700;

        Employee employee8 = new Employee();
        employee8.id = 8L;
        employee8.firstName = "Dmitrii";
        employee8.lastName = "Dmitrii";
        employee8.salary = 400;

        Employee employee9 = new Employee();
        employee9.id = 19L;
        employee9.firstName = "Dmitrii";
        employee9.lastName = "Dmitrii";
        employee9.salary = 1900;

        Employee employee10 = new Employee();
        employee10.id = 10L;
        employee10.firstName = "Dmitrii";
        employee10.lastName = "Dmitrii";
        employee10.salary = 2000;

        Employee employee2 = new Employee();
        employee2.id = 2L;
        employee2.firstName = "Artem";
        employee2.lastName = "ArtemF";
        employee2.salary = 1200;

        return new Employee[]{
                employee1,
                employee2,
                employee3,
                employee4,
                employee5,
                employee6,
                employee7,
                employee8,
                employee9,
                employee10
        };

    }
}
