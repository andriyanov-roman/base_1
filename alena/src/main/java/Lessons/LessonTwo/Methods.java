package Lessons.LessonTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MacBook on 26.03.15.
 */
public class Methods {

    public static String ReadFromFile(String FileURL) throws IOException {
        File file = new File(FileURL);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        String FileStrings="";
        while( (line=buffer.readLine()) !=null) {
            FileStrings = FileStrings + line+"\n";
        } System.out.println(FileStrings.toString());
        return FileStrings;
    }
    public static void WriteToFile (String txt, String FileURL, Boolean AddToEnd) throws IOException {
        FileWriter writer = new FileWriter(FileURL, AddToEnd);
        writer.write(txt);
        writer.flush();
        writer.close();
    }

//    public static void addNewEmployee () throws IOException {
//
//        ArrayList<Company> employees = Company.getEmployees();
//        Employee1 employee1 = new Employee1();
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Введите Имя сотрудника: ");
//            employee1.setName(sc.next());
//            System.out.println("Введите Фамилию сотрудника: ");
//            employee1.setSecondName(sc.next());
//            System.out.println("Введите Пол сотрудника: ");
//            employee1.setSex(sc.next());
//            System.out.println("Введите возраст сотрудника: ");
//            employee1.setAge(sc.nextInt());
//            System.out.println("Введите предпологаемую ЗП сотрудника: ");
//            employee1.setSalary(sc.nextInt());
//            employee1s.add(employee1);
//            FileWriter writer = new FileWriter("vorobey/src/FirstCompany.txt", true);
//            writer.write(employee1.getName() + ":" + employee1.getSecondName() + ":" + employee1.getSex() + ":" + employee1.getAge() + ":" + employee1.getSalary() + "\n");
//            writer.flush();
//            writer.close();
//
//
//        }
//    }


}
