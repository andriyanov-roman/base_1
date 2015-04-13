package inout;

import entity.university.Course;
import entity.university.University;
import inputOutput.university.CommonReader;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TestCourseReader {
    private static final int UNIV_TITLE = 0;
    private static final int COURSE_NAME = 1;
    private static final int HOURS_NUMB = 2;
    private static final int MAX_MARK = 3;

    @Test
    public void readFromFile() throws IOException{
        File file = new File("E:\\2_Programing\\IdeaProjects\\base_1\\artem\\src\\main\\java\\data\\university\\courses.txt"); // создаем объект класса File; path это путь к зачитываемому файлу который
        // передается как аргумент при создании объекта класса CommonReader
        FileReader reader = new FileReader(file);// создаем объект класса FileReader и зачитываем file
        BufferedReader buffer = new BufferedReader(reader);// создаем объект класса BufferedReader и обвалакиваем им reader
        String line;
        ArrayList<String[]> strings = new ArrayList<>();// создаем коллекцию маленьких массивчиков типа String
        while ((line = buffer.readLine()) != null){// пока в буфере есть строки для чтения
            String[] pool = line.split(":");// массив pool заполняется значениями разделенными regExp
            strings.add(pool);// добавляем в коллекцию полученный массив
        }

        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Course c = new Course();
            c.setCourseTitle(strings.get(i)[COURSE_NAME]);
            c.setCreditHours(Integer.valueOf(strings.get(i)[HOURS_NUMB]));
            c.setMark(Integer.valueOf(strings.get(i)[MAX_MARK]));
            c.setUnivTitle(strings.get(i)[UNIV_TITLE]);
            courses.add(c);
        }
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).getUnivTitle() + courses.get(i).getCourseTitle());
        }
    }

}
