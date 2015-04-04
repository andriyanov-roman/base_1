package universityEntities;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class SubjectWithMark extends Subject {
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "SubjectWithMark{" +
                "mark=" + mark +
                '}';
    }
}
