package cons.company;


import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String name;
    private String surname;
    private transient double salary;
    private int age;
    private String sex;
    private LocalDate dateOfEmployment;


    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }



    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + " " + " " + surname + " " + " " + salary + " " + " " + age + " " + " " + sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.getSalary(), getSalary()) != 0) return false;
        if (getAge() != employee.getAge()) return false;
        if (!getName().equals(employee.getName())) return false;
        if (!getSurname().equals(employee.getSurname())) return false;
        if (!getSex().equals(employee.getSex())) return false;
        return getDateOfEmployment().equals(employee.getDateOfEmployment());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAge();
        result = 31 * result + getSex().hashCode();
        result = 31 * result + getDateOfEmployment().hashCode();
        return result;
    }
}
