package University;

import entity.Employee;

import java.util.ArrayList;

/**
 * Created by Администратор on 30.03.2015.
 */
public class EmployeeWriterReader extends CommonWriterReader {
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public EmployeeWriterReader(ArrayList<Employee> employees) {
        this.employees = employees;
        writerToFile();
    }

    private ArrayList<Employee> employees;


    @Override
    public void writerToFile() {
    }


}
