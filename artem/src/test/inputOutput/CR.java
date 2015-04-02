package inputOutput;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class CR {
    protected String path;
    protected String regExp;

    public CR(String path, String regExp) {
        this.path = path;
        this.regExp = regExp;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getRegExp() {
        return regExp;
    }
    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

    public ArrayList<String[]> readFromFile() throws IOException {
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
    public void writeToFile () throws IOException{
        FileWriter writer = new FileWriter(path);
        writer.flush(); // Метод flush вызывает принудительный сброс буфера вывода.
        //flush не очищает буфер, а убеждается, что все данные, которые в него должны быть записаны, уже записались.
        writer.close();
    }
}
