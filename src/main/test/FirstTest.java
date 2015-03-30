import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class FirstTest {

    @Test
    public void doSomething() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

}
