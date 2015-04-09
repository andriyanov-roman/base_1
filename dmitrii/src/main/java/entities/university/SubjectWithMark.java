package entities.university;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class SubjectWithMark extends Subject {
    private Double mark;

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return super.toString()+ "| mark: " + mark;
    }
}
