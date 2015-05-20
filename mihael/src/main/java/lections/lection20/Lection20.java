package lections.lection20;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 * Created by Programmer on 20.05.2015.
 */
public class Lection20 {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    private static LocalDate localDate = LocalDate.now();

    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());
       // date = (sdf).parse("20101010");
        System.out.println(localDate);
        localDate = LocalDate.of(2012,12,12);
        System.out.println(localDate);
        localDate.toEpochDay();
        Random random = new Random();
        int day = random.nextInt(28);
        int month = random.nextInt(12);

    }

}
