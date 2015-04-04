package company;

/**
 * Created by admin on 16.03.15.
 */
public class Employee {

    private String name;
    private String surname;
    private double salary;
    private int age;
    private String sex;

    public Employee(String name, String surname, double salary, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.sex = sex;

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
}
