package universityEntities;

public class Teacher extends Human {
    private Subject discipline;

    public Subject getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Subject discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "discipline=" + discipline +
                '}';
    }
}
