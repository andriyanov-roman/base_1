package inout;

import entity.university.University;
import modules.consoleApp.university.UnivModule;
import org.junit.Test;

/**
 * Created by R-Tem on 13.04.2015.
 */
public class TestUnivView {
    @Test
    public void testUnivView() throws Exception {
        University univ = UnivModule.getMaxProgressUniv();
        String result = "1" + univ.getTitle();
        char varNum = result.charAt(0);
        switch (varNum){
            case 49: System.out.println("is the university with the most progressive students rating");
        }

    }
}
