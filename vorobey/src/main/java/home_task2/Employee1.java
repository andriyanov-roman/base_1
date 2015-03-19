package home_task2;


public class Employee1 {
    public String name;
    public String secondName;
    public double salary;
    public int age;
    public String sex;

    Employee1() {

    }

    @Override
    public String toString() {
        return name + " " + " " + secondName +
                ", salary=" + salary
                ;

    }

    public Employee1(String name, String secondName, int salary, int age, String sex) {

        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.age = age;

    }
}
