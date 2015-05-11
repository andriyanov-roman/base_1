import java.util.Calendar;

/**
 * Created by User on 11.05.2015.
 */
public class Employee {
    private double salary;
    private Calendar DateOfEmpl;

    public Employee(Calendar dateOfEmpl, double salary) {
        DateOfEmpl = dateOfEmpl;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getDateOfEmpl() {
        return DateOfEmpl;
    }

    public void setDateOfEmpl(Calendar dateOfEmpl) {
        DateOfEmpl = dateOfEmpl;
    }
}
