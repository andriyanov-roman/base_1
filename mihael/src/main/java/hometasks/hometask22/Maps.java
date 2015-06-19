package hometasks.hometask22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 06.06.2015.
 */
public class Maps {
    public static void  main(String[] args){

        Map treeMap = new TreeMap<>();
        Map <String, Integer> hashMap = new HashMap<>();
        Set<String> stringSet = loadUrls();
        System.out.println(stringSet);
        ArrayList<String>  stringArrayList = loadPage();
        System.out.println(stringArrayList);


    }

    public static Set<String> loadUrls() {
        Set<String> urls = new HashSet<>();
        try {
            URL url = new URL("http://www.ex.ua/82091884");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            Pattern pattern = Pattern.compile("href='([^']+)");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    if (matcher.group(1).contains("/get/")) {
                        urls.add("http://www.ex.ua" + matcher.group(1));
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls;
    }

    public static ArrayList<String> loadPage(){
        ArrayList<String> page = new ArrayList<>();
        try {
            URL url = new URL("http://www.ex.ua/82091884");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            Pattern pattern = Pattern.compile("href='([^']+)");
            while ((line = reader.readLine()) != null) {
                page.add(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return page;
    }
}
