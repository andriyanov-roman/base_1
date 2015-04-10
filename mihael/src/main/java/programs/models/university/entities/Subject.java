package programs.models.university.entities;

/**
 * Created by Администратор on 10.04.2015.
 */
public class Subject {
    private String SubjectName;
    private Integer SubjectHours;
    private Double SubjectAssessment;

    public Subject(){}
    public Subject(String subjectName, Integer subjectHours, Double subjectAssessment) {
        SubjectName = subjectName;
        SubjectHours = subjectHours;
        SubjectAssessment = subjectAssessment;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public Integer getSubjectHours() {
        return SubjectHours;
    }

    public void setSubjectHours(Integer subjectHours) {
        SubjectHours = subjectHours;
    }

    public Double getSubjectAssessment() {
        return SubjectAssessment;
    }

    public void setSubjectAssessment(Double subjectAssessment) {
        SubjectAssessment = subjectAssessment;
    }

    @Override
    public String toString() {
        String string;
        String regExp = ":";
        string =  SubjectName +regExp + SubjectHours +regExp + SubjectAssessment;
        return string;
    }
}
