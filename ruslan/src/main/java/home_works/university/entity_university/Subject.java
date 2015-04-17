package home_works.university.entity_university;

/**
 * Created by user on 17.04.2015.
 */
public class Subject {
    private String subjectName;
    private Double hours;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return subjectName + hours;
    }
}
