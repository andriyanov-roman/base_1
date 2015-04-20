package apps.universityMatveu;

import java.io.*;
import java.util.ArrayList;

public class WriterReadingSubjects {
    public static void writerToFile(Subject subject) throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\apps\\appsFiles\\university\\Subjects.txt", true);
        writer.write(subject.getNameSubject() + ":" + subject.getNumberOfHours() + ":" + subject.getMark() + "\n");
        writer.flush();
        writer.close();
    }
    public static void ReadingFromSubjects() throws IOException {
        File file = new File("matveu\\src\\main\\java\\apps\\appsFiles\\university\\Subjects.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Subject> subjects = MethodsUniver.getSubjects();
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] pool = line.split(":");
                Subject subject = new Subject();
                subject.setNameSubject(pool[0]);
                subject.setNumberOfHours(Integer.valueOf(pool[1]));
                subject.setMark(Integer.valueOf(pool[2]));
                subjects.add(subject);
            }
    }
}
