package University.inputOutput.readerHeirs;

import University.entity.Lecturer;
import University.inputOutput.CommonReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 02.04.2015.
 */
public class LecturersReader extends CommonReader {

    public LecturersReader(String path, String regExp) {
        super(path + "/lecturers.txt", regExp);
    }

    @Override
    public ArrayList readFromFile() throws IOException {
        ArrayList<String[]> strings = super.readFromFile();
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Lecturer lec = new Lecturer();
            lec.setName(strings.get(i)[0]);
            lec.setSurname(strings.get(i)[1]);
            lec.setCourse(strings.get(i)[2]);
            lec.setSalary(Double.valueOf(strings.get(i)[3]));
            lecturers.add(lec);
        }
        return lecturers;
    }
}
