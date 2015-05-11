import fx.SimpleMenu;
import fx.SimpleMenuBar;
import pattern.MyInstance;
import sun.util.resources.LocaleData;
import utils.A;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.spi.CalendarDataProvider;

/**
 * Created by Администратор on 25.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(System.currentTimeMillis());
        Calendar dateOfEmployment = Calendar.getInstance();
        dateOfEmployment.set(2010, Calendar.JANUARY, 1, 9, 10);
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR) - dateOfEmployment.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(dateOfEmployment.getTime());
        LocalDate lc = LocalDate.now();
        SimpleDateFormat sdf = new SimpleDateFormat("");
        System.out.println(lc);
        MyInstance instance = MyInstance.getInstance();
        System.out.println(instance.getName());
    }
}
