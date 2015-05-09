package regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 09.05.2015.
 */
public class JavaUtilsTest {
    public static void main(String[] args) throws IOException{
      File f = new File("test.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffeeReader = new BufferedReader(reader);
        String regex = "\\d{3}\\-\\d{3}\\-\\d{4}";
        Pattern pettrn = Pattern.compile(regex);
        String line;
        while ((line = buffeeReader.readLine())!= null) {
            Matcher matcher = pettrn.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group(0));
            }
        }
    }
}
