package utils;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 09.05.2015.
 */
public class JavaUtilsTest {

    public static void main(String[] args) throws IOException {
        A a = new A();
        File f = new File("test.txt");
        FileReader reader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //"\\d{3}\\-\\d{3}\\-\\d{4}"
        String regExp = "(.*)(\\d+)(.*)";

        Pattern pattern = Pattern.compile(regExp);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()) {
                //System.out.println(matcher.group(0));
                System.out.println(matcher.group(1));
                //System.out.println(matcher.group(2));
            }
        }
    }
}
