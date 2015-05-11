package lections.lesson17;

import entities.company.Employee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Programmer on 11.05.2015.
 */
public class less17 {

    public class EmployeeCalendar {
        Calendar dataPriema = Calendar.getInstance();
        public EmployeeCalendar(){
            dataPriema.set(2010, Calendar.JANUARY, 1,9,10);
            startSalary = 1000D;
        }
        Double startSalary = new Double(1000);
        public Double getSalary(){
            Calendar dateNow = Calendar.getInstance();
            Double salaryNow;

            salaryNow = startSalary;
            return  salaryNow;
        }
    }

    public static void main(String[] args){
        Date date = new Date();
        //System.out.println(date);
        //System.out.println(System.currentTimeMillis());

        Calendar calendar = Calendar.getInstance();
        //calendar.set(10, 10, 10);

        //calendar.add(Calendar.DATE, 50);
        //calendar.set(2015, 12, 50);
        //calendar.set(2010, Calendar.JANUARY, 1,9,10);
        //System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());
        LocalDate lc = LocalDate.now();
        //SimpleDateFormat sdf = new SimpleDateFormat("");
        //System.out.println(lc);



    }

}
