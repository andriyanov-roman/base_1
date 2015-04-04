import hometask3.CompanyUtil;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 30.03.2015.
 */
public class WordsTest {
    public static Scanner scanner = new Scanner(System.in);
    @Test
    public void loadWordsFromFile()throws Exception{
        String path = "src/main/java/words/words.txt";

        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        ArrayList<String> words = new ArrayList<>();
        String word;
        while ((word = buffer.readLine()) != null){
            words.add(word);
        }

        for(int i = 0; i<words.size();i++){
            words.get(i);
        }

    }

    @Test
    public void saveWordsToFile() throws Exception {
        //Arguments
        String path = "src/main/java/words/words.txt";;
        Boolean append = false;
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        //words.add("four");

        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file,append);
        for(int i=0; i<words.size();i++){
            fileWriter.write(words.get(i));
            fileWriter.write("\n");
        }
        fileWriter.flush();
        fileWriter.close();

    }

    @Test
    public void startWords()throws IOException{

        System.out.println("Input words by one");
        System.out.println("input SAVE to save words");
        System.out.println("input LOAD to load words in console");
        System.out.println("input SHOW to show words in console");
        Boolean cont = true;

        while(cont){
            String input = scanner.next();
            switch (input){

                case "SAVE":
                   /// saveWordsToFile("mihael/src/main/java/words/words.txt", true, words);
                    break;
                case "LOAD":
                   // words = loadWordsFromFile("mihael/src/main/java/words/words.txt");
                    //showArrayListString(words);
                    //break;
                case "SHOW":
                    //showArrayListString(words);
                    break;
                default:
                    //words.add(input);
                    break;
            }

        }
    }

}
