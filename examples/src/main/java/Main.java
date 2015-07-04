import cons.company.Employee;
import xml.stax.StudentsStAXBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws ParseException {
        float f = 0.324F;
        double d = 0.324;
        System.out.println(f == d);
        double a = 3.14E-03;
        System.out.println(a);
        System.out.println(0.0 / 0);
        System.out.println(1.0 / 0);
        System.out.println(-1.0 / 0);
        System.out.println(Float.NaN == Double.NaN);
        System.out.println(Double.MIN_VALUE);
        System.out.println(4.9E-324 == Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE == Double.POSITIVE_INFINITY);
        float x = 1.0F;
        int numFloats = 0;
//        while (x <= 2.0) {
//            numFloats++;
//            System.out.println(x);
//            x = Math.nextUp(x);
//        }
        try { FileReader fr1 = new FileReader("test1.txt");
            try {	 FileReader fr2 = new FileReader("test2.txt");
            } catch (IOException e) {
                System.out.print("test2");
            }
            System.out.print("+");
        } catch (FileNotFoundException e) {
            System.out.print("test1");
        }
        System.out.print("+");



    }

    public static strictfp double doSomething() {
        return 1 / 3;
    }
}
