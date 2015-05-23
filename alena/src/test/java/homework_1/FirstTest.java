package homework_1;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Администратор on 06.03.2015.
 */
public class FirstTest {
    @Test
    public void DoSomething() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }

    @Test
    public double test(double [] allTemp) throws IOException{
        if (allTemp.length == 0){
            System.out.println(0);

        }

        return 0;
    }

}
