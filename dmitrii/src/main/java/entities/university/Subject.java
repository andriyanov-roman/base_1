package entities.university;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class Subject {
    private String subName;
    private Double hours;


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

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", hours=" + hours +
                '}';
    }
}
