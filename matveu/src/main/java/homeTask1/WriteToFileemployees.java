package homeTask1;

import entity.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class WriteToFileemployees {
    public static void main(String [] args) throws IOException {
        FileWriter writer=new FileWriter("matveu/src/testing_writeFile.txt",true);
        writer.write("");
        writer.flush();
        writer.close();
    }

}
