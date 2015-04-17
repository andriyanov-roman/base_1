package home_works.university.entity_university;

/**
 * Created by user on 17.04.2015.
 */
public class SubjectWithMarks extends Subject{
    private Double mark;

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return super.toString()+mark;
    }
}
