package apps.universityMatveu;

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
        System.out.println("");


        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    addProfessor();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    break;

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
        ArrayList<Student> students=new ArrayList<>();
        Student student=new Student();
        System.out.println("Введите имя студента");
        student.setName(scanner.next());
        System.out.println("Введите фамилию студента");
        student.setSecondName(scanner.next());
        student.setSubjects(MethodsUniver.getSubjects());
        student.setSubjects(MethodsUniver.getSubjects());
        student.setSubjects(MethodsUniver.getSubjects());
        students.add(student);
        WriterReadingStudents.writerToFile(student);
    }
    public static ArrayList<Subject> getSubjects() throws IOException {
        ArrayList<Subject>subjects=new ArrayList<>();
            Subject subject = new Subject();
            int count = 0;
            //do {
            System.out.println("Введите название предмета");
            subject.setNameSubject(scanner.next());
            System.out.println("Введите количество часов (максимально 100)");
            subject.setNumberOfHours(scanner.nextInt());
            System.out.println("Введите оценку по предмету( 12-ти бальная система )");
            subject.setMark(scanner.nextInt());
            subjects.add(subject);
            WriterReadingSubjects.writerToFile(subject);
            count++;
           // }while (count!=3);
            return subjects;
    }

}
