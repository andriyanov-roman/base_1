import entities.Admin;
import entities.Company;
import entities.Employee;
import homeproject.ModelE;
import entities.Manager;
import entities.Programmer;
import org.junit.Assert;
import org.junit.Test;
import tools.FileUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Администратор on 06.03.2015.
 */
public class FirstTest {
    @Test
    public void doSomething() throws Exception {
        Employee e = null;
        Assert.assertNotNull(e);

    }

    @Test
    public void getMaxSalaryInComp() throws Exception {
        ModelE model = new ModelE();
        Company com = model.CompanyParse("src\\main\\resources\\companies\\Polaris.txt");
        //ArrayList<Company> comps = model.getCompanies();
        //Company com = comps.get(0);
        Employee eWithMaxSalary = (Employee) ((ArrayList) com.getStuff().get(0)).get(0);

        ArrayList maxStuff = new ArrayList(10);
        maxStuff.add(eWithMaxSalary);
        maxStuff.add(eWithMaxSalary);
        maxStuff.add(eWithMaxSalary);
        maxStuff.add(eWithMaxSalary);
        for (int i = 0; i < com.getStuff().size(); i++) {
            ArrayList division = (ArrayList) com.getStuff().get(i);
            for (int j = 0; j < division.size(); j++) {
                Employee eNext = (Employee) division.get(j);
                if (eNext.getSalary() > eWithMaxSalary.getSalary()) {
                    eWithMaxSalary = eNext;
                    if (division.get(i).getClass().isInstance(Admin.class)) {
                        System.out.print("Ok");
                    }

                    /*if (division.get(i) instanceof Admin){
                        maxStuff.set(1,division.get(i));
                    }
                    if (division.get(i) instanceof Manager){maxStuff.set(2,division.get(i));}
                    if (division.get(i) instanceof Programmer){maxStuff.set(3,division.get(i));}
                    if (division.get(i) instanceof Employee){maxStuff.set(0,division.get(i));}*/
                }
            }
        }


    }
}
