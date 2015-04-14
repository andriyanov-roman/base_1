package apps.factory;

import entities.factory.Car;
import tools.Table;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class FactoryView {
    public static Scanner scanner = new Scanner(System.in);
    public static String buffer = "";

    public static String getBuffer() {
        return buffer;
    }

    public static String next(){
        String scan = scanner.next();
        buffer+= scan+"\n";
        return scan;
    }
    public static Boolean hasNext(){
        return scanner.hasNext();
    }
    public static void toPrintLN(String txt) {
        System.out.println(txt);
    }
    public static void toPrint(String txt) {
        System.out.print(txt);
    }
    public static void welcome() {
        toPrintLN("\n1. To order a car\n" +
                "2. Load Cars from File\n"+
                "3. Show cars in period\n"+
                "4. Find most expensive Car\n"+
                "5. Find Cars with the same color\n"+
                "SAVE. Save data to file\n"+
                "LOAD. Load data from file\n"+
                "E/e or Exit - end program");
        toPrint("Your choice: ");
    }

    public static void showCars(ArrayList<Car> cars, String ... tableName) {
        if (tableName.length==0){
            tableName = new String[1];
            tableName[0]="Available Cars";
        }
        int colWidth = 14;
        int totalColumns = 10;
        int fullWidth = colWidth * totalColumns;
        String templ = "Model:Type:Car Owner:Reg. Number:Body color:Factory:"+
                "Order status:Description:Price:Date";
        String[] titles = templ.split(":");
        Table.toDash(fullWidth);
        Table.toHeader(fullWidth, tableName[0]);
        Table.toPlusDash(colWidth, totalColumns);
        Table.toRowCenter(colWidth, titles);
        Table.toPlusDash(colWidth, totalColumns);
        for (int i = 0; i < cars.size(); i++) {
            String[] cells = cars.get(i).toString().split(Car.getRegExp());
            if (Boolean.valueOf(cells[6])){cells[6] = "Done";}
            else cells[6] = "Waiting";
            cells[8]+=" $";
            cells[9] = formatDate(cells[9].split("\n")[0]);
            Table.toRow(colWidth,cells);
        }
        Table.toDash(fullWidth);
        toPrintLN("");
    }
    public static String formatDate (String d){
        Date date = new Date(Long.valueOf(d));
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String eventTime = formatter.format(date);
        return eventTime;
    }

    public static String[] showDialogCar() {
        //требования - имя заказчика, желаемый цвет, желаемый тип, желаемый номер
        scanner.useDelimiter("\n");
        String [] c = new String[10];
        toPrintLN("*** Car Order ***");
        c[0] = "new model";
        toPrint("Car Type: ");
        c[1] = next();
        toPrint("Car owner: ");
        c[2] = next();
        toPrint("Registration number: ");
        c[3] = next();
        toPrint("Color: ");
        c[4] = next();
        c[5] = "Subaru";
        c[6] = "false";
        c[7] = "new car desc.";
        c[8] = "7000";
        Date now = new Date();
        c[9] = String.valueOf(now.getTime());
        for (int i = 0; i < c.length; i++) {
            if (c[i].length()==0) {c[i] = "[not set]";}
        }
        return c;
    }

    public static Date [] periodDialog() {
        Date [] perOfDays = new Date[2];
        Calendar c = Calendar.getInstance();
        int dd = c.get(Calendar.DATE);
        int mm = c.get(Calendar.MONTH);
        int yyyy = c.get(Calendar.YEAR);
        Calendar[] period = {c.getInstance(),c.getInstance()};
        toPrintLN("Input period (today,week,month,year) or Interval in format \'01:04:1999-08:07:2014\'");
        toPrint("Period: ");
        String input = next();
        switch (input){
            case "today":
                period[0].set(yyyy,mm,dd,0,0,1);
                perOfDays[0]=period[0].getTime();
                perOfDays[1]=period[1].getTime();
                break;
            case "week":
                int dayWeek = Calendar.DAY_OF_WEEK;
                period[0].set(yyyy,mm,dd-dayWeek+2,0,0,1);
                perOfDays[0]=period[0].getTime();
                perOfDays[1]=period[1].getTime();
                break;
            case "month":
                period[0].set(yyyy,mm,1,0,0,1);
                perOfDays[0]=period[0].getTime();
                perOfDays[1]=period[1].getTime();
                break;
            case "year":
                period[0].set(yyyy-1,mm,dd,0,0,1);
                perOfDays[0]=period[0].getTime();
                perOfDays[1]=period[1].getTime();
                break;
            default:
                String[] temp = input.split("-");
                String[] begin = temp[0].split(":");
                String[] end = temp[1].split(":");
                try {
                    dd = Integer.valueOf(begin[0]);
                    mm = Integer.valueOf(begin[1])-1;
                    yyyy = Integer.valueOf(begin[2]);
                    period[0].set(yyyy,mm,dd,0,0,0);
                    dd = Integer.valueOf(end[0]);
                    mm = Integer.valueOf(end[1])-1;
                    yyyy = Integer.valueOf(end[2]);
                    period[1].set(yyyy, mm, dd, 0, 0, 0);
                    perOfDays[0]=period[0].getTime();
                    perOfDays[1]=period[1].getTime();
                } catch (Exception e){
                    toPrintLN("Mismatch format");
                    perOfDays=periodDialog();
                }
        }
        return perOfDays;
    }

}
