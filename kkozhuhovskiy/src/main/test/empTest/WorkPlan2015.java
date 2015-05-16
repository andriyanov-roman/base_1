package empTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programmer on 15.05.2015.
 */
public class WorkPlan2015 {

    static ArrayList<LocalDate> holidays = new ArrayList<>();
    public static final int TOTAL_MONTH_IN_YEAR = 12;

    public static void main(String[] args) {
        holidays = new ArrayList<>();
        holidays.add(LocalDate.of(2015, 1, 1));
        holidays.add(LocalDate.of(2015, 1, 2));
        holidays.add(LocalDate.of(2015, 1, 7));


        ArrayList<ArrayList<LocalDate>> workdays = new ArrayList<>(); // Создаем два массива
        ArrayList<LocalDate> currentMonth = new ArrayList<>();/*workdays.get(0);*/

        for (int i = 0; i<TOTAL_MONTH_IN_YEAR; i++ ){
            workdays.add(new ArrayList<>());


        }



        for (int i=0; i < workdays.size(); i++) {

            currentMonth = workdays.get(i).
        }
        LocalDate test = LocalDate.of(2015, 1, 1);

        test.lengthOfMonth();



        for (int i = 1; i < test.lengthOfMonth(); i++) {
            LocalDate currentDate = LocalDate.of(2015, , i);
            if (!(currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) | currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY))) {
                for (int j = 0; i < holidays.size(); j++) {
                    if (!(currentDate.equals(holidays.get(j)))) {
                        currentMonth.add(currentDate);
                    }

                }

            }
            //currentMonth.forEach(System.out::println);

         /*ArrayList<List<LocalDate>> workdays2 = new ArrayList<>();*/

        }
        for (int i = 0; i < currentMonth.size(); i++) {
            System.out.println(currentMonth.get(i).toString() + " " + currentMonth.get(i).getDayOfWeek());

        }
    }

    public boolean isHoliday(LocalDate currentDay) {

        for (int i = 0; i < holidays.size(); i++) {
            if (currentDay.equals(holidays.get(i))) ;
            return true;
        }

        return false;
    }

}
