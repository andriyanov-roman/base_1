package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Programmer on 09.05.2015.
 */
public class UtilTest {
    public static void main(String[] args) throws IOException {

        File f = new File("kkozhuhovskiy\\test");
        FileReader reader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String regExp = "[a-z]";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group(0));
            }

        }
    }
}