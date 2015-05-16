package apps.calendar.task12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by mit_OK! on 16.05.2015.
 */
public class WorkPlan {
    public static final int CURRENT_YEAR = 2015;
    public static ArrayList<LocalDate> holidays;
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            holidays = loadHolidays();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<LocalDate> [] months = new ArrayList[12];
        for (int i = 0; i < months.length; i++) {
            months[i] = new ArrayList<>();
        }
        for (int j = 0; j < months.length; j++) {
            int monthLength = LocalDate.of(CURRENT_YEAR,j+1,1).lengthOfMonth();
            for (int k = 1; k < monthLength+1; k++) {
                LocalDate date = LocalDate.of(CURRENT_YEAR,j+1,k);
                if (!(date.getDayOfWeek().equals(DayOfWeek.SATURDAY) | (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)))){
                    if (!isHoliday(date)){
                        months[j].add(date);
                    }
                }
            }
        }
        printResult(months);
    }

    private static void printResult(ArrayList<LocalDate>[] months) {
        for (int i = 0; i < months.length; i++) {
            System.out.println(LocalDate.of(CURRENT_YEAR,i+1,1).getMonth().toString());
            for (int j = 0; j < months[i].size(); j++) {
                System.out.println(months[i].get(j)+" "+months[i].get(j).getDayOfWeek());
            }
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
    private static ArrayList<LocalDate> loadHolidays() throws IOException {
        holidays = new ArrayList<>();
        File f = new File("dmitrii\\src\\main\\resources\\holidays.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while ((line = buffer.readLine())!=null){
            String stDate = line.split(" - ")[0];
            holidays.add(LocalDate.parse(stDate,formatter));
        }
        holidays.addAll(getTransferDates(holidays));
        holidays.sort(Comparator.<LocalDate>naturalOrder());
        return holidays;
    }
    private static  ArrayList<LocalDate> getTransferDates(ArrayList<LocalDate> days){
        ArrayList<LocalDate> transferDates = new ArrayList<>();
        for (LocalDate d : days){
            if (d.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
                transferDates.add(d.plusDays(2));
            }
            if (d.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                transferDates.add(d.plusDays(1));
            }
        }
        return transferDates;
    }
}
