package homework.university;

import entity.university.University;
import modules.consoleApp.university.UnivModule;
import org.junit.Test;

/**
 * Created by R-Tem on 05.04.2015.
 */
public class checkGetMaxProgressUniv {
    @Test
    public void testGetMaxProgressUniv() throws Exception {
        University maxProgressUniv = UnivModule.getMaxProgressUniv();
        System.out.println("University " + maxProgressUniv.getTitle() + " has the maximal average rating: " + maxProgressUniv.getProgressAverage());
    }
}
