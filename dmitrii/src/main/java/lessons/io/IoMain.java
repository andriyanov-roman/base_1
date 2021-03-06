package lessons.io;

import entities.company.Employee;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Programmer on 16.05.2015.
 */
public class IoMain {
    public static void main(String[] args) {
        try {
            InputStream io = new FileInputStream("dmitrii\\src\\main\\resources\\RegExpTest.txt");
            int i;
            while ((i=io.read()) != -1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Employee e = new Employee();
        e.setAge(20);
        e.setSalary(100500);
        e.setName("Ivan");
        e.setSurname("Ivanov");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e);
        try {
            FileOutputStream outStream;
            outStream = new FileOutputStream("test.txt");
            ObjectOutputStream o = new ObjectOutputStream(outStream);
            o.writeObject(employees);

            FileInputStream inStream = new FileInputStream("test.txt");
            ObjectInputStream ois = new ObjectInputStream(inStream);
            ArrayList<Employee> test = (ArrayList)ois.readObject();
            System.out.println(test.toString());
        } catch (IOException e0) {
            e0.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
