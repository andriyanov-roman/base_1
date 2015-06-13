package lessons.col_map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Programmer on 06.06.2015.
 */
public class MapWordFinder {
    public static void main(String[] args) throws IOException {
        wordCount();
    }

    private static void wordCount() throws IOException {
        File f = new File("dmitrii\\src\\main\\resources\\MapTestText.txt");
        FileReader reader = new FileReader(f);
        Map<String,Integer> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
        while ((str=bufferedReader.readLine())!=null){
            String[] pool = str.split("\\W");
            for (int i = 0; i < pool.length; i++) {
                if (!map.containsKey(pool[i])){
                    map.put(pool[i],1);
                } else {
                    map.put(pool[i],map.get(pool[i])+1);
                }
            }
        }
        System.out.println(map.toString());
    }
}
