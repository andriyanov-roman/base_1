package University.inputOutput;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class checkCommonRW {
    @Test
    public void checkCommonRW() throws IOException{
        CommonReader cr = new CommonReader("src/main/java/University/additionalFiles/departments/biology/courses.txt", ":");
        ArrayList strings = cr.readFromFile();
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        CommonWriter cw = new CommonWriter("src\\main\\java\\University\\additionalFiles\\test.txt");
        cw.writeToFile();
    }
}
