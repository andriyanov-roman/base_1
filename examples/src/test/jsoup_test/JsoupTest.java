package jsoup_test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * Created by user on 6/2/2015.
 */
public class JsoupTest {

    @Test
    public void testJsoup() throws Exception {
        Document doc = Jsoup.connect("http://www.ex.ua/17703522").get();
        String title = doc.title();
        System.out.println("title : " + title);
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            // get the value from href attribute
            System.out.println("\nlink : " + link.attr("href"));
            System.out.println("text : " + link.text());
        }

    }
}
