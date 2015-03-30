package Lessons.LessonTwo.lesson_3;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Programmer extends Employee {
     private String language;



    public Programmer(String name, String secondName, double salary, String sex, int age, String language) {
        super(name, secondName,salary, sex, age);
        this.language = language;

    }

    public Programmer() {

    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}