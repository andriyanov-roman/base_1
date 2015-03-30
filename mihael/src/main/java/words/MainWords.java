package words;

import hometask3.CompanyUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Администратор on 26.03.2015.
 */
public class MainWords {

    /**
     *
     С консоли вводятся слова.
     Как только ввелось слова SAVE все предидущие слова сохраняются в файл.
     Если ввелось слово LOAD, то все слова загружаются в консоль из файла.
     */


        private static ArrayList<String> words = new ArrayList<>();



        public static void  main (String [] args)throws IOException {
            startWords();
        }
        public static void startWords()throws IOException{

            System.out.println("Input words by one");
            System.out.println("input SAVE to save words");
            System.out.println("input LOAD to load words in console");
            System.out.println("input SHOW to show words in console");
            Boolean cont = true;
            Scanner scanner = CompanyUtil.scanner;
            while(cont){
                String input = scanner.next();
                switch (input){

                    case "SAVE":
                        saveWordsToFile("mihael/src/main/java/words/words.txt", true, words);
                        break;
                    case "LOAD":
                        words = loadWordsFromFile("mihael/src/main/java/words/words.txt");
                        //showArrayListString(words);
                        //break;
                    case "SHOW":
                        showArrayListString(words);
                        break;
                    default:
                        words.add(input);
                        break;
                }

            }
        }

        public static void saveWordsToFile(String path, Boolean append, ArrayList<String> words) throws IOException{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,append);
            for(int i=0; i<words.size();i++){
                fileWriter.write(words.get(i));
                fileWriter.write("\n");
            }
            fileWriter.flush();
            fileWriter.close();

        }

        public static ArrayList<String> loadWordsFromFile(String path)throws IOException{

            File file = new File(path);
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            ArrayList<String> words = new ArrayList<>();
            String word;
            while ((word = buffer.readLine()) != null){
                words.add(word);
            }
            return words;
        }

        public static void showArrayListString(ArrayList<String> strings ){
            for (int i=0;i<strings.size();i++){
                System.out.println(strings.get(i));
            }
        }

}
