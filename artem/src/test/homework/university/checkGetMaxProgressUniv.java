package homework.university;

import entity.university.University;
import modules.university.Body;
import org.junit.Test;

/**
 * Created by R-Tem on 05.04.2015.
 */
public class checkGetMaxProgressUniv {
    @Test
    public void testGetMaxProgressUniv() throws Exception {
        University maxProgressUniv = Body.getMaxProgressUniv();
        System.out.println("University " + maxProgressUniv.getTitle() + " has the maximal average rating: " + maxProgressUniv.getProgressAverage());
    }
}
