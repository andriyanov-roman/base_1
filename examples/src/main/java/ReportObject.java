import cons.company.Employee;

import java.time.LocalDate;

/**
 * Created by Programmer on 20.05.2015.
 */
public class ReportObject {
    private Double salary;
    private LocalDate date;
    private Integer percentage;

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
