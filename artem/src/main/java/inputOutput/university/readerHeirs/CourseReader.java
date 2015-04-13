package inputOutput.university.readerHeirs;

import entity.university.Course;
import inputOutput.university.CommonReader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class CourseReader extends CommonReader {
    private static final int UNIV_TITLE = 0;
    private static final int COURSE_TITLE = 1;
    private static final int HOURS_NUMB = 2;
    private static final int MAX_MARK = 3;

    public CourseReader(String path, String regExp) {
        super(path, regExp);
    }

    @Override
    public ArrayList<Course> readFromFile() throws IOException {
        ArrayList<String[]> strings = super.readFromFile();
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Course c = new Course();
            c.setCourseTitle(strings.get(i)[COURSE_TITLE]);
            c.setCreditHours(Integer.valueOf(strings.get(i)[HOURS_NUMB]));
            c.setMark(Integer.valueOf(strings.get(i)[MAX_MARK]));
            c.setUnivTitle(strings.get(i)[UNIV_TITLE]);
            courses.add(c);
        }
        return courses;
    }
}
