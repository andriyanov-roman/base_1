package inputOutput;

import java.io.*;
import java.util.ArrayList;


public class ReadWrite {
    public static ArrayList<String[]> readFromFile (String path, String regExp) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null){
            String[] pool = line.split(regExp);
            strings.add(pool);
        }
        return strings;
    }
    public static void writeToFile (String path, ArrayList arrayList, boolean check) throws IOException{
        FileWriter writer = new FileWriter(path, check);
//        StringBuffer buffer = new StringBuffer();
//        buffer.append(String.valueOf(arrayList + "\n"));

        writer.write(String.valueOf(arrayList));
        writer.flush();
        writer.close();
    }
}