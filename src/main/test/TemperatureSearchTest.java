import epam.TemperatureSearchImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Администратор on 20.04.2015.
 */
public class TemperatureSearchTest {
    double[] testArray = {1.3, 6.0, 9.0, -1.2, 0.4, 580};

    @Test
    public void testIfIsEmpty() throws Exception {
        TemperatureSearchImpl search = new TemperatureSearchImpl();
        double result = search.closestToZero(null);
        Assert.assertNotEquals(0, result);
    }
}
