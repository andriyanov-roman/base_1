package lections.lesson16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Programmer on 09.05.2015.
 */
public class RunRegExpTest {
    public static void main(String[] args) throws IOException {
        File f = new File("mihael/src/main/java/data/lections/testregexp.txt");
        FileReader reader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(reader);
        //String regExp = "\\d{3}\\-\\d{3}\\-\\d{4}";
        String regExp = "\\d{2}";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()) {
                System.out.println(matcher.group(0));
                //System.out.println(matcher.matches());
                System.out.println(line);
            }
        }
    }
}
