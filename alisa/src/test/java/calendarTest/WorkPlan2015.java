package calendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by User on 15.05.2015.
 */
public class WorkPlan2015 {
    static ArrayList<LocalDate> holidays;
public static final int YEAR_MONTH_NUMBER = 12;
    public static void main(String[] args) {
        holidays = new ArrayList<>();
        holidays.add(LocalDate.of(2015, 1, 1));
        holidays.add(LocalDate.of(2015, 1, 2));
        holidays.add(LocalDate.of(2015, 1, 7));

        ArrayList<ArrayList<LocalDate>> workingDays = new ArrayList<>();
        ArrayList<LocalDate> month = new ArrayList<>();// = workingDays.get(0);
        for (int i = 0; i <YEAR_MONTH_NUMBER; i++) {
            workingDays.add(new ArrayList<>());
        }


        for (int i = 0; i <workingDays.size() ; i++) {

         month = workingDays.get(i);

            for (int j = 1; j < LocalDate.of(2015, i + 1, 1).lengthOfMonth(); j++) {
                LocalDate currentDate = LocalDate.of(2015, i+1, j);
                if (!(currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) | (currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)))) {
                    if(!( isHoliday(currentDate))){
                        month.add(currentDate);
                    }
                }
            }
        }

        //january.forEach(System.out::println);
        for (int i = 0; i < workingDays.size(); i++) {
            ArrayList<LocalDate> testmonth = workingDays.get(i);
            for (int j = 0; j <testmonth.size() ; j++) {

                System.out.println(testmonth.get(j).toString() + " " + testmonth.get(j).getDayOfWeek());
            }
            System.out.println("++++++++++");
        }
    }

    public static boolean isHoliday(LocalDate currentDay){
        for (int i = 0; i < holidays.size() ; i++) {
            if(currentDay.equals(holidays.get(i))){
                return true;
            }
        }
           return false;
        }

    }

