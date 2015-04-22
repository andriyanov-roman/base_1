import org.junit.Test;
import org.junit.Assert;

/**
 * Created by user on 20.04.2015.
 */
public class TemperatureTest {

    double[] testArray = {1.3, 6.0, 9.0, -1.2, 0.4, 580, -0.3, 0.2};
    @Test
    public void testIfIsEmpty () throws Exception {
    /* TemperatureImpl  search = new TemperatureImpl();
      double result = search.closestToZero(testArray);
       Assert.assertNotEquals(0, result);*/

        System.out.println(new TemperatureImpl().closestToZero(testArray));
    }
}
