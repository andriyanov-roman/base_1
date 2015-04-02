package University.inputOutput.readerHeirs;

import University.entity.Course;
import University.entity.Student;
import University.inputOutput.CommonReader;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class checkStudentReader {
    @Test
    public void testStudentsReader() throws Exception {
        CommonReader st = new StudentsReader("src/main/java/University/additionalFiles/departments/biology", ":");
        ArrayList<Student> students = st.readFromFile();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}