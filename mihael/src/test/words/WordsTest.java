import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 30.03.2015.
 */
public class WordsTest {
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
}
