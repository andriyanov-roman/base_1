package lesson_today;


import home_task.Employee;
import home_task2.Employee1;

import java.util.Calendar;
import java.util.Date;

public class ClassEmployyeDate {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Valera", "Gromov", 2400, 26, "male");
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, Calendar.JANUARY, 1, 9, 10);
        System.out.println(calendar.getTime());
        employee1.setDateOfEmployye(new Date());
       // System.out.println(employee1.getDateOfEmployye());





    }
}
