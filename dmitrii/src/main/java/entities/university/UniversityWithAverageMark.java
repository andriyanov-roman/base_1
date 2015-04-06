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

    @Override
    public String toString() {
        return this.university.toString()+"\n Average mark: "+averageMark;
    }
}
