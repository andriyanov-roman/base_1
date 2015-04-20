package apps.universityMatveu;

public class Professor extends Person {
    private Integer Salary;
    private String subjectName;

    public Professor(){

    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Professor(String name, String secondName, Integer salary, String subjectName) {
        this.Salary = salary;
        this.subjectName = subjectName;
    }
}
