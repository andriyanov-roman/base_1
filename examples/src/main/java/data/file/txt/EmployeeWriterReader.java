package data.file.txt;

import entities.company.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Администратор on 30.03.2015.
 */
public class EmployeeWriterReader extends CommonWriterReader {

    public void writeEmployeeToFile(Employee e, String companyName)  {
        try {
            FileWriter writer = new FileWriter(getPath(), true);
            writer.write(companyName + ":" + e.getName() + ":"
                    + e.getSurname() + ":" + e.getSalary() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
