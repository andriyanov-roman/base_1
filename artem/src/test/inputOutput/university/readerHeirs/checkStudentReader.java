package inputOutput.university.readerHeirs;

import entity.university.Student;
import inputOutput.university.CommonReader;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class checkStudentReader {
    @Test
    public void testStudentsReader() throws Exception {
        CommonReader st = new StudentsReader("src/main/java/homework.universities/filesPackage/departments/biology", ":");
        ArrayList<Student> students = st.readFromFile();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}