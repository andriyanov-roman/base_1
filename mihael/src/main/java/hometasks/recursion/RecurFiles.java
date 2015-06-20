package hometasks.recursion;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 19.06.2015.
 */
public class RecurFiles {
    //HashSet<String> directories = new HashSet<>();
    //File[] files = new File("D:\\").listFiles();
    Map<String, List<String>> map = new HashMap<>();

    public static void main (String[] args){
        RecurFiles recurFiles = new RecurFiles();
        recurFiles.readFileSystem();
        recurFiles.countWords();
    }
    public void readFileSystem() {
        File currentDir = new File("D:\\test"); // current directory
        //displayDirectoryContents(currentDir);
        displayDirectoryContentsList(currentDir);
        System.out.println(map.toString());
    }

    public void countWords() {
        //File f = new File("mihael/src/main/java/factory/test_cars.txt");
        File f = new File ("C:\\Users\\Programmer\\IdeaProjects\\base_1\\mihael\\src\\main\\java\\factory\\test_cars.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map.toString());

    }
    public List<String> displayDirectoryContentsList(File dir) {
        try {

            if (dir.isDirectory()){

                System.out.println(dir);
                File[] files = dir.listFiles();
                System.out.println(files);
                List<String> curList = new ArrayList<>();
                for (File file : files) {
                    if (file.isDirectory()&&!(file.getCanonicalPath().contains("$RECYCLE.BIN"))&&!(file.getCanonicalPath().contains("D:\\System Volume Information"))) {
                        //System.out.println("directory:" + file.getCanonicalPath());



                        List<String> list =displayDirectoryContentsList(file);
                        map.put(file.getName(),list);
                    } else  if (!(file.getCanonicalPath().contains("$RECYCLE.BIN"))&&!(file.getCanonicalPath().contains("D:\\System Volume Information"))){
                        curList.add(file.getCanonicalPath());
                        extension(file.getCanonicalPath());
                        //System.out.println("     file:" + file.getCanonicalPath());
                    }
                }

                return curList;
            } else System.out.println();


        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }


    public String  extension (String fileName){
        String regExp = "[\\w,-]+\\.(\\w+)";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(fileName);
        if(matcher.find()) {
            String ext =matcher.group(1);
            System.out.println(ext);
            //System.out.println(matcher.matches());
            System.out.println(fileName);
            return matcher.group(1);
        } else return null;
    }


    public void displayDirectoryContents(File dir) {
        try {

            if (dir.isDirectory()){

                System.out.println(dir);
                File[] files = dir.listFiles();
                System.out.println(files);
                List<String> curList = new ArrayList<>();
                for (File file : files) {
                    if (file.isDirectory()&&!(file.getCanonicalPath().contains("$RECYCLE.BIN"))&&!(file.getCanonicalPath().contains("D:\\System Volume Information"))) {
                        //System.out.println("directory:" + file.getCanonicalPath());

                        curList.add(file.getCanonicalPath());
                        map.put(file.getName(), new ArrayList<>());
                        displayDirectoryContents(file);
                    } else  if (!(file.getCanonicalPath().contains("$RECYCLE.BIN"))&&!(file.getCanonicalPath().contains("D:\\System Volume Information"))){

                        //System.out.println("     file:" + file.getCanonicalPath());
                    }
                }
            } else System.out.println();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
