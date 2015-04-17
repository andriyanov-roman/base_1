package universityMatveu;

import java.io.*;
import java.util.ArrayList;

public class WriterReadingProfessors {
    public static void writerToFile(Professor professor) throws IOException {
        FileWriter writer = new FileWriter("matveu\\src\\main\\java\\universityMatveu\\Professors.txt", true);
        writer.write(professor.getName() + ":" + professor.getSecondName() + ":" + professor.getSalary() + ":" + professor.getSubjectName() + "\n");
        writer.flush();
        writer.close();
    }
    public static void readingFromProfessors() throws IOException {
        File file = new File("matveu\\src\\main\\java\\universityMatveu\\Professors.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Person> persons = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Professor professor = new Professor();
            professor.setName(pool[0]);
            professor.setSecondName(pool[1]);
            professor.setSalary(Integer.valueOf(pool[2]));
            professor.setSubjectName(pool[3]);
            persons.add(professor);
        }
    }
}
