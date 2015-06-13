import cons.company.Employee;
import xml.stax.StudentsStAXBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by Администратор on 25.04.2015.
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        StudentsStAXBuilder staxBuilder = new StudentsStAXBuilder();
        staxBuilder.buildSetStudents("examples\\src\\main\\resources\\student.xml");
        System.out.println(staxBuilder.getStudents());
    }

}
