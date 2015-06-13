package xml.stax;

import java.text.ParseException;

/**
 * Created by user on 6/13/2015.
 */
public class RunStudentsStax {
    public static void main(String[] args) throws ParseException {
        StudentsStAXBuilder staxBuilder = new StudentsStAXBuilder();
        staxBuilder.buildSetStudents("examples\\src\\main\\resources\\student.xml");
        System.out.println(staxBuilder.getStudents());
    }
}
