package cons.company;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

public class Employee implements Serializable,Comparable<Employee> {
    private String name;
    private String surname;
    private transient double salary;
    private int age;
    private String sex;
    private LocalDate dateOfEmployment;
    private int hashCode = 1000;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (age != employee.age) return false;
        if (!name.equals(employee.name)) return false;
        if (!surname.equals(employee.surname)) return false;
        if (!sex.equals(employee.sex)) return false;
        return dateOfEmployment.equals(employee.dateOfEmployment);

    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }

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
    public int compareTo(Employee o) {
        return 0;
    }
}
