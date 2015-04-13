package inputOutput.university.readerHeirs;

import entity.university.Lecturer;
import inputOutput.university.CommonReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class LecturersReader extends CommonReader {
    private static final int UNIV_TITLE = 0;
    private static final int LECTURER_NAME = 1;
    private static final int LECTURER_SURNAME = 2;
    private static final int COURSE_TITLE = 3;
    private static final int SALARY = 4;

    public LecturersReader(String path, String regExp) {
        super(path, regExp);
    }

    @Override
    public ArrayList readFromFile() throws IOException {
        ArrayList<String[]> strings = super.readFromFile();
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Lecturer lec = new Lecturer();
            lec.setName(strings.get(i)[LECTURER_NAME]);
            lec.setSurname(strings.get(i)[LECTURER_SURNAME]);
            lec.setCourse(strings.get(i)[COURSE_TITLE]);
            lec.setSalary(Double.valueOf(strings.get(i)[SALARY]));
            lec.setUnivTitle(strings.get(i)[UNIV_TITLE]);
            lecturers.add(lec);
        }
        return lecturers;
    }
}
