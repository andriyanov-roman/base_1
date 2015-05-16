package lesson;

import entity.company.Employee;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Programmer on 16.05.2015.
 */
public class IoMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(34);
        e.setName("Art");
        try{
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Programmer\\IdeaProjects\\base_1\\artem\\src\\main\\resourses\\test\\test.dat");
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(e);

            FileInputStream inputStream = new FileInputStream("C:\\Users\\Programmer\\IdeaProjects\\base_1\\artem\\src\\main\\resourses\\test\\test.dat");
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            ArrayList<Employee> test = (ArrayList)ois.readObject();
            System.out.println();
        } catch (IOException e1){
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
