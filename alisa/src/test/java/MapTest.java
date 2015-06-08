import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 06.06.2015.
 */
public class MapTest {
    @Test
    public void test() throws IOException {
        File f = new File("alisa\\src\\test\\java\\Text.txt");
        FileReader reader = new FileReader(f);
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
        while ((str = bufferedReader.readLine()) != null)

        {
            String[] pool = str.split("\\W");
            for (int i = 0; i < pool.length; i++) {
                if (!map.containsKey(pool[i])) {
                    map.put(pool[i], 1);
                } else {
                    int counter = map.get(pool[i]);
                    counter++;
                    map.put(pool[i], counter);
                }

            }
        }

        System.out.println(map.toString());
    }
}



