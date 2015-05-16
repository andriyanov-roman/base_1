package apps.calendar.task12;

import java.time.LocalDate;

/**
 * Created by mit_OK! on 16.05.2015.
 */
public class WorkerPremium {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        LocalDate dateOfEmployment = LocalDate.of(2010,5,5);
        LocalDate endOfPeriod = LocalDate.of(2015, 5, 1);
        Worker w = new Worker("Ivan","Ivanov",1000.0,true,20,dateOfEmployment);
        Long periodInDays = endOfPeriod.toEpochDay() - w.getDateOfEmployment().toEpochDay();
        Long periodInMonths = getMonthQuantity(periodInDays,w.getDateOfEmployment());
        LocalDate timeToPay = w.getDateOfEmployment();
        int counter = 0;
        for (int i = 0; i < periodInMonths; i++) {
            if(counter == 12){
                double tempSalary = 1.05*w.getSalary();
                w.setSalary(tempSalary);
                counter =0;
                System.out.println("Salary grow up!");
            }
            System.out.println(w.getSalary()+" in "+timeToPay.getMonth()+" "+timeToPay.getYear());
            timeToPay = timeToPay.plusMonths(1L);
            counter++;
        }
    }

    private static Long getMonthQuantity(Long periodInDays, LocalDate dateOfEmployment) {
        LocalDate dayOfSalary = LocalDate.of(dateOfEmployment.getYear(),dateOfEmployment.getMonth(),1);
        Long monthQuantity = 0L;
        byte counter = 0;
        for (int i = 0; i < periodInDays; i++) {
            if (counter == dayOfSalary.lengthOfMonth()){
                monthQuantity++;
                dayOfSalary = dayOfSalary.plusMonths(1);
                counter = 0;
            }
            counter++;
        }
        return monthQuantity+2;
    }
}
