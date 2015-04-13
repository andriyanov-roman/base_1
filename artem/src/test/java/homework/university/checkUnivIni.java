package homework.university;

import entity.university.University;
import modules.consoleApp.university.UnivModule;
import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by R-Tem on 03.04.2015.
 */
public class checkUnivIni {
    @Test
    public void testDepIni() throws Exception {
        ArrayList<University> universities = UnivModule.univIni();
        for (int i = 0; i < universities.size(); i++) {
            System.out.println(universities.get(i).toString());
        }
    }
}
