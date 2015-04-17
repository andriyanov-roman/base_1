package universityMatveu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodsUniver extends Person {
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<Person> persons=new ArrayList<>();

    public static void start() throws IOException {
        System.out.println("Выберите действие!");
        System.out.println("1. Добавить препода в универ");
        System.out.println("2. Добавить студента в универ");
        System.out.println("3. Вывести на экран все фигуры хранящиеся в контейнере");
        System.out.println("4. Узнать свободную площадь контейнера");
        System.out.println("5. Вывести на экран фигуру с наибольшим периметром");
        System.out.println("6. Вывести на экран фигуру с наибольшей площадью");

        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    addProfessor();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":

            }
        }
    }
    public static void addProfessor() throws IOException {
        Professor professor=new Professor();
        System.out.println("Введите имя препода");
        professor.setName(scanner.next());
        System.out.println("Введите фамилию препода");
        professor.setSecondName(scanner.next());
        System.out.println("Введите зп препода");
        professor.setSalary(scanner.nextInt());
        System.out.println("Введите предмет препода");
        professor.setSubjectName(scanner.next());
        persons.add(professor);
        WriterReadingProfessors.writerToFile(professor);
    }
    public static void addStudent() throws IOException{
        Student student=new Student();
        System.out.println("Введите имя студента");
        student.setName(scanner.next());
        System.out.println("Введите фамилию студента");
        student.setSecondName(scanner.next());
        System.out.println("Введите название предмета");
        ArrayList<Subject> subjects=new ArrayList<>();
        Subject subject=new Subject();
        subject.setNameSubject(scanner.next());
        System.out.println("Введите количество часов");
        subject.setNumberOfHours(scanner.nextInt());
        System.out.println("Введите оценку по предмету");
        subject.setMark(scanner.nextInt());
        subjects.add(subject);
        student.setSubjects(subjects);
        persons.add(student);
        WriterReadingStudents.writerToFile(student);
    }

}
