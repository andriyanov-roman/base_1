package onTheLesson;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Programmer on 09.05.2015.
 */
public class ReadRegEx {
    @Test
    public void readRegExp() throws IOException {
        File file = new File("C:\\Users\\Programmer\\IdeaProjects\\base_1\\artem\\src\\main\\resourses\\test\\text.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String regExp = "\\d{2}\\/\\d{2}\\/\\d{2}";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while ((line = buffer.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()) {
                System.out.println(line);
            }
        }
    }
}
