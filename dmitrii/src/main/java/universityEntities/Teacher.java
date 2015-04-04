package universityEntities;

/**
 * Created by mit_OK! on 04.04.2015.
 */
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
