package homework;


import entity.university.Student;
import homework.CommonMethods;
import homework.university.Body;

import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
//        CommonMethods.start();
        Student student = Body.addStudent();
        System.out.println(student.toString());

    }
}
