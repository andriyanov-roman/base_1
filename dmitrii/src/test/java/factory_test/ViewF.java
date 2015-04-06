package factory_test;

import entities.factory.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by mit_OK! on 03.04.2015.
 */
public class ViewF {
    public static Scanner scanner = new Scanner(System.in);
    public String next(){
        return scanner.next();
    }
    public Boolean hasNext(){
        return scanner.hasNext();
    }
    public void toPrintLN(String txt) {
        System.out.println(txt);
    }
    public void toPrint(String txt) {
        System.out.print(txt);
    }
    public void welcome() {

    }
    @Test
    public void showCars() {
        ArrayList<Car> cars = new ArrayList<>();
    }
    @Test
    public void showBuffer() {
        String txt = "";
    }
    @Test
    public void showDialogCar() {
        //требования - имя заказчика, желаемый цвет, желаемый тип, желаемый номер
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
        c[7] = "best car description";
        c[8] = "7000";
        Date now = new Date();
        c[9] = now.toString();
        toPrintLN(c.toString());
    }
    @Test
    public void testDate (){
        Calendar calendar = Calendar.getInstance();
        System.out.println("DATE: " + calendar.getTime());
        System.out.println("ERA: " + calendar.get(Calendar.ERA));
        System.out.println("DATE2: " + calendar.get(Calendar.DATE));
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
    }
}
