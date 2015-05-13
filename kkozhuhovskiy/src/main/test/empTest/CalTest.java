package empTest;

import homeWork1.Employee;
import org.junit.Test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Programmer on 13.05.2015.
 */
public class CalTest {
@Test
        public void zpTestDate (){
            Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();
    Calendar calendar = Calendar.getInstance();
    Calendar dateOfEmployment = Calendar.getInstance();
    dateOfEmployment.set(2010, Calendar.MAY, 1);

    employee.setDateOfEmploeement(dateOfEmployment);
    employee.setSalary(2123);

    Calendar wperiod = Calendar.getInstance();
   long diff = wperiod.getTimeInMillis() - employee.getDateOfEmploeement().getTimeInMillis();
    diff = diff/1000/60/60/24/30;

    System.out.println(diff);
    int counter = 0;
    for (int i = 0; i < diff; i++) {
        if(counter == 12) {
            System.out.println("old salary" + employee.getSalary());
            double salary = 1.05*employee.getSalary();
            employee.setSalary(salary);
                        counter = 0;
            System.out.println("new salary" + employee.getSalary());
            System.out.println(" ====================== ");
        }
      counter++;



    }
    }
        }