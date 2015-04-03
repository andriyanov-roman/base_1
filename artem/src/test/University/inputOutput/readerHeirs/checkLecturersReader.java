package University.inputOutput.readerHeirs;

import University.entity.Lecturer;
import University.inputOutput.CommonReader;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class checkLecturersReader {
    @Test
    public void testLecturerReader() throws Exception {
        CommonReader lecR = new LecturersReader("src/main/java/University/additionalFiles/departments/biology", ":");
        ArrayList<Lecturer> lecturers = lecR.readFromFile();
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println(lecturers.get(i).toString());
        }
    }
}