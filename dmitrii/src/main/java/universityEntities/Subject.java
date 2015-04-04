package universityEntities;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class Subject {
    private String subName;
    private Double hours;
    private int mark;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", hours=" + hours +
                ", mark=" + mark +
                '}';
    }
}
