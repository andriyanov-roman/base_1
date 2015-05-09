package lessons.util09052015;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Programmer on 09.05.2015.
 */
public class RegExpTest {
    public static void main(String[] args) throws IOException {
        File f = new File("dmitrii\\src\\main\\resources\\RegExpTest.txt");
        FileReader reader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String regExp = "Python|SQL|Ruby";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while (((line = bufferedReader.readLine())) !=null){
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()){
                System.out.println(line);
            }
        }
    }
}
