

import java.util.Calendar;

/**
 * Created by user on 20.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Calendar dateofEmpl = Calendar.getInstance();
        dateofEmpl.set(2010, Calendar.JANUARY, 1);
        Employee e = new Employee(dateofEmpl, 7000);



        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR) - dateofEmpl.get(Calendar.YEAR);


    }
}