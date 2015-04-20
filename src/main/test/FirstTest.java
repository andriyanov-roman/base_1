import entity.Company;
import entity.Employee;
import lesson_3.CommonWriterReader;
import lesson_3.EmployeeWriterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstTest {

    @Test
    public void doSomething() throws Exception {

        ArrayList<Employee> employees = new ArrayList<>();
        CommonWriterReader writerReader = new EmployeeWriterReader(employees);
        writerReader.writerToFile();
    }

    public String getString() {
        return "test";
    }
}
