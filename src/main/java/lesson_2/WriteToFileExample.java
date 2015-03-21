package lesson_2;


import java.io.*;

public class WriteToFileExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("src/test_write.txt",true);
        writer.write("Ololo");
        writer.flush();
        writer.close();
    }
}
