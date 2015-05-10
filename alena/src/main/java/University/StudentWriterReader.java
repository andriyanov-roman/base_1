package University;

import entity.Employee;

import java.util.ArrayList;

/**
 * Created by Администратор on 30.03.2015.
 */
public class StudentWriterReader extends CommonWriterReader {
    private ArrayList<Employee> employees;


    public StudentWriterReader(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void writerToFile() {

    }


}
