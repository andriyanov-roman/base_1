package homework.university;

import entity.university.Student;
import modules.consoleApp.university.UnivModule;
import org.junit.Test;

/**
 * Created by R-Tem on 05.04.2015.
 */
public class checkAddStudent {
    @Test
    public void testAddStudent() throws Exception {
        Student student = UnivModule.addStudent();
        System.out.println(student.toString());
    }
}
