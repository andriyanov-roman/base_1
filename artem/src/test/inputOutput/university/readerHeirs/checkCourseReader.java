package inputOutput.university.readerHeirs;

import entity.university.Course;
import inputOutput.university.CommonReader;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class checkCourseReader {
    @Test
    public void testCourseReader() throws Exception {
        CommonReader cr = new CourseReader("src/main/java/homework.universities/filesPackage/departments/biology", ":");
        ArrayList<Course> courses = cr.readFromFile();
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).toString());
        }
    }
}
