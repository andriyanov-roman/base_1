package homework_1;

import Lessons.LessonTwo.Methods;
import entity.Company;
import entity.Employee;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 30.03.2015.
 */
public class Main {

    @Test
    public void sortBySalary() throws Exception {
        for (int i = 0; i < Company.getEmployees().size(); i++) {
            for (int j = 1; j < Company.getEmployees().size(); j++)
                if (Company.getEmployees().get(j).getSalary() < Company.getEmployees().get(j - 1).getSalary()) {
                    Employee temp = Company.getEmployees().get(j);
                    Company.getEmployees().set(j, Company.getEmployees().get(j - 1));
                    Company.getEmployees().set((j - 1), temp);
                }
        }
        for (int i = 0; i < Company.getEmployees().size(); i++) {
            System.out.println(Company.getEmployees().get(i).getName() + " " + Company.getEmployees().get(i).getSecondName() + "" +
                    " "+ Company.getEmployees().get(i).getSalary());

        }
    }

    @Test
    public void getEmployees () throws IOException {
        Company company = new Company();
        for (int i = 0; i < Company.getEmployees().size(); i++) {
                for (int j = 0; j < Company.getEmployees().size() - 1; j++) {
                    if (Company.getEmployees().get(j).getSalary() < Company.getEmployees().get(j + 1).getSalary()) {
                        Employee temp = Company.getEmployees().get(j);
                        Company.getEmployees().set(j, Company.getEmployees().get(j + 1));
                        Company.getEmployees().set((j + 1), temp);
                    }

                }
            }
            System.out.println(Company.getCompanyName());
            for (int j = 0; j < Company.getEmployees().size(); j++) {
                System.out.println(Company.getEmployees().get(j).getName() + " "
                        + Company.getEmployees().get(j).getSecondName() + " "
                        + Company.getEmployees().get(j).getSalary());
            }


    }

}
