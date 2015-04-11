package entities.university;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class UniversityWithAverageMark extends University {
    private Double averageMark;
    private University university;

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public UniversityWithAverageMark(University u) {
        this.averageMark = calculateAverMark(u);
        this.university = u;
    }
    private Double calculateAverMark (University u) {
        Double sumStudentMarks = 0.0;
        int sumSubjects = 0;
        for (int j = 0; j < u.getStudents().size(); j++) {
            for (int k = 0; k < u.getStudents().get(j).getSubjectList().size(); k++) {
                sumStudentMarks += u.getStudents().get(j).getSubjectList().get(k).getMark();
            }
            sumSubjects += u.getStudents().get(j).getSubjectList().size();
        }
        return sumStudentMarks / sumSubjects;
    }
    @Override
    public String toString() {
        return this.university.toString()+"\n Average mark: "+averageMark;
    }
}
