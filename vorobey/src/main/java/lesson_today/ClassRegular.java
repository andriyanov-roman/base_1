package lesson_today;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegular {
    public static void main(String[] args) throws IOException {
        File file = new File("vorobey\\src\\main\\java\\test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String regExp = "(\\W+([\\s]){1,})*";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            boolean result = matcher.matches();
            if (matcher.find()) {
                //System.out.println(line);
                System.out.println("результат " + result);
            }
        }
    }
}
