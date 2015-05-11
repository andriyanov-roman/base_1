package lessons.lesson1105205;

import entities.company.Employee;

import java.util.Calendar;

/**
 * Created by Programmer on 11.05.2015.
 */
public class DataTest {
    public static void main(String[] args) {
        Calendar startCarier = Calendar.getInstance();
        Employee e = new Employee("Ivan", "Karmanov",1000.0,true,20);
        //Employee e = new Employee(){};
        startCarier.set(2014,Calendar.JANUARY,1);
        int endYear = Calendar.getInstance().get(Calendar.YEAR);
        Double newSalary = e.getSalary();
        for (int i = 0; i < endYear-startCarier.get(Calendar.YEAR); i++) {
            newSalary = newSalary*1.10;
            System.out.println(newSalary);
        }

        //System.out.println(newSalary);
    }
}
