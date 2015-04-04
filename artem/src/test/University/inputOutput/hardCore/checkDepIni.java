package University.inputOutput.hardCore;

import University.entity.Department;
import University.hardCore.Start;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;


/**
 * Created by R-Tem on 03.04.2015.
 */
public class checkDepIni {
    @Test
    public void testDepIni() throws Exception {
        ArrayList<Department> departments = Start.depIni();
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).toString());
        }
    }
}
