import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 09.05.2015.
 */
public class JavaUtilTest {
    public static void main(String[] args)  throws IOException {
        File f = new File("alisa\\src\\test\\java\\Text.txt");
        FileReader reader = new FileReader(f);
        BufferedReader bufferReader = new BufferedReader(reader);
        String regExp = "[a-z]";
        Pattern pattern = Pattern. compile(regExp);
        String line;
        while ((line = bufferReader.readLine()) != null){
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()){
                System.out.println(matcher.group(0));
            }
        }
    }

    }

