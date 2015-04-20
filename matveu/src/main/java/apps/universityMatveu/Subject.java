package apps.universityMatveu;

public class Subject {
    private String nameSubject;
    private Integer numberOfHours;
    private Integer mark;

    public Subject(){

    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Integer getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(Integer numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Subject(String nameSubject, Integer numberOfHours, Integer mark) {
        this.nameSubject = nameSubject;
        this.numberOfHours = numberOfHours;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return  nameSubject + ":" + numberOfHours +
                ":" + mark;
    }
}
