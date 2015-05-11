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
        String regExp = "[\\w\\d\\S]+";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while (((line = bufferedReader.readLine())) !=null){
            Matcher matcher = pattern.matcher(line);
            System.out.println("\nOLD:\t" + line);
            System.out.print("NEW:\t");
            while (matcher.find()){
                System.out.print(matcher.group() + " ");
            }
            System.out.println();
            for (int i = 0; i < line.length()+8; i++) {
                System.out.print("=");
            }
        }
    }
}
