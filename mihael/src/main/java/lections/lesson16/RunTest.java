package lections.lesson16;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Programmer on 09.05.2015.
 */
public class RunTest {


    public static void main (String[] args){



        BigDecimal bd = new BigDecimal("2123");
        BigDecimal d2 = new BigDecimal("123");
        BigDecimal result = bd.multiply(new BigDecimal("40"));
        result = bd.divide(d2,20, RoundingMode.DOWN);
        //System.out.println(result);



        File file = new File("mihael/src/main/java/data/lections/testregexp.txt");
        FileReader reader= null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Pattern pattern = Pattern.compile(regExp);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        try {
            while ((line=buffer.readLine())!=null){
                //String[] splitedLine =  line.split(this.delimiter);
                //strings.add(splitedLine);
               // Matcher matcher = pattern.matcher(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String regExp ="[0-9]";

        //Matcher matcher = new Matcher();




    }

}
