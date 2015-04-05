package inputOutput.university.readerHeirs;

import entity.university.Lecturer;
import inputOutput.university.CommonReader;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class checkLecturersReader {
    @Test
    public void testLecturerReader() throws Exception {
        CommonReader lecR = new LecturersReader("src/main/java/homework.universities/filesPackage/departments/biology", ":");
        ArrayList<Lecturer> lecturers = lecR.readFromFile();
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println(lecturers.get(i).toString());
        }
    }
}