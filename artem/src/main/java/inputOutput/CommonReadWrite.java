package inputOutput;

import java.io.*;
import java.util.ArrayList;


public class CommonReadWrite {
    protected String path;
    protected String regExp;

    public CommonReadWrite(String path, String regExp) {
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
//        StringBuffer buffer = new StringBuffer();
//        buffer.append(String.valueOf(arrayList + "\n"));
        /*for (int i = 0; i < arrayList.size(); i++) {
            writer.write(arrayList.get(i)+"\n");
        }*/
        writer.flush();
        writer.close();
    }
}