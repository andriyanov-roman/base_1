package apps.universityMatveu;

import java.io.*;
import java.util.ArrayList;

public class WriterReadingStudents {
    public static void writerToFile(Student student) throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\apps\\appsFiles\\university\\Students.txt", true);
        writer.write(student.getName() + ":" + student.getSecondName() + ":" + student.getSubjects() + ":" + "\n");
        writer.flush();
        writer.close();
    }
    public static void readingFromStudents() throws IOException {
        File file = new File("matveu\\src\\main\\java\\apps\\appsFiles\\university\\Students.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Person> persons = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Person student = new Student();
            student.setName(pool[0]);
            student.setSecondName(pool[1]);
            persons.add(student);
        }
    }
}
