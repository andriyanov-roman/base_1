package lections.lection19;

import java.util.Scanner;

/**
 * Created by Programmer on 18.05.2015.
 */
public class DictionaryTest
{
    public static void main(String [] args ){
        Dictionary dictionary = new Dictionary();
        dictionary.setEnWord("book");
        dictionary.setUaWord("knyga");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            if(scanner.next().equals(dictionary.getEnWord())){
                System.out.println(dictionary.getUaWord());
            }
        }
    }
}
