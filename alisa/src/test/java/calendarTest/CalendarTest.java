package calendarTest;

import entity.Employee;
import org.junit.Test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by User on 13.05.2015.
 */
public class CalendarTest {

    @Test
    public void testDateEmpl (){
        Scanner scanner = new Scanner(System.in);
        Calendar dateofEmployment = Calendar.getInstance();
        dateofEmployment.set(2010, Calendar.NOVEMBER, 1);
        Employee e = new Employee();
        e.setDateOfEmployment(dateofEmployment);
        e.setSalary(1000);

        Calendar workEnd =  Calendar.getInstance();
        long diff = workEnd.getTimeInMillis() - e.getDateOfEmployment().getTimeInMillis();
        diff = diff/1000/60/60/24/30;
        System.out.println(diff);
        int counter = 0;
        for (int i = 0; i < diff; i++) {
           if(counter == 12){
               System.out.println("old  salary" + e.getSalary());
               double tempSalary = 1.05*e.getSalary();
               e.setSalary(tempSalary);
               counter =0;
               System.out.println("new salary" + e.getSalary());
               System.out.println("=====================================");
           }
            counter++;
        }
    }
}
