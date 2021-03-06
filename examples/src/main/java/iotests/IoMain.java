package iotests;

import cons.company.Employee;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 16.05.2015.
 */
public class IoMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(20);
        e.setSalary(100500);
        e.setName("Ivan");
        e.setSurname("Ivanov");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e);
        try {
            FileOutputStream outStream = new FileOutputStream("test.txt");
            ObjectOutputStream o = new ObjectOutputStream(outStream);
            o.writeObject(employees);

            FileInputStream inStream = new FileInputStream("test.txt");
            ObjectInputStream ois = new ObjectInputStream(inStream);
            ArrayList<Employee> test = (ArrayList)ois.readObject();
            System.out.println(test.toString());
        } catch (IOException e1) {

        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
