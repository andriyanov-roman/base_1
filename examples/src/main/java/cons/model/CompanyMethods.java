package cons.model;

import cons.company.Employee;
import cons.txt.EmployeeWriterReader;

/**
 * Created by user on 4/5/2015.
 */
public class CompanyMethods {
    private EmployeeWriterReader writerReader = new EmployeeWriterReader();


    public void writeEmployee(Employee e, String company) {
        writerReader.setPath("resources\\files\\company\\employee.txt");
        writerReader.writeEmployeeToFile(e,company);
        System.out.println("Wrote to file");
    }
}
