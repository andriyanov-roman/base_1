package lessons.l06062015;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Programmer on 06.06.2015.
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http").get();
        String title = doc.title();
        System.out.println(title);
        Elements links = doc.select("a[href]");
    }
}
