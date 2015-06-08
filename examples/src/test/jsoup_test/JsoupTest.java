package jsoup_test;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


import org.junit.Test;
import org.w3c.dom.Document;

/**
 * Created by user on 6/2/2015.
 */
public class JsoupTest {

//    @Test
//    public void testJsoup() throws Exception {
//        Document doc = Jsoup.connect("http://www.ex.ua/17703522").get();
//        String title = doc.title();
//        System.out.println("title : " + title);
//        Elements links = doc.select("a[href]");
//        Map<String, String> map = new LinkedHashMap<>();
//        for (Element link : links) {
//            if(link.text().contains(".mp3")) {
//                map.put(link.attr("href"), link.text());
//            }
//            // get the value from href attribute
//            //System.out.println("\nlink : " + link.attr("href"));
//            //System.out.println("text : " + link.text());
//        }
//        System.out.println(map.toString());
//
//    }

    @Test
    public void countWords() throws Exception{
        File f = new File("D:\\base_1\\test2.txt");
        FileReader reader = new FileReader(f);
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
        while((str = bufferedReader.readLine()) != null) {
            String[] pool = str.split("\\W");
            for (int i = 0; i < pool.length; i++) {
                if(!map.containsKey(pool[i])) {
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
