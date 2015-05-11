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
        String regExp = "(([a-zA-Z0-9]){1,}([\\s]){0,})*";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher("yghtrhr34535      jdbfhwWREFWE324324   434343 hbhbhHVYGCFY");
        boolean result = matcher.matches();
        System.out.println("result " + result);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher1 = pattern.matcher(line);
            boolean result1 = matcher.matches();
            if (matcher.find()) {
                System.out.println(line);
                System.out.println("result " + result1);
            }
        }
    }
}
