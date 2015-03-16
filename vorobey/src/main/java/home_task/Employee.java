package home_task;


import java.util.Scanner;

public class Employee {
    public String name;
    public String secondName;
    public int salary;
    public int age;
    public String sex;

    Employee() {

    }

    Employee(String name, String secondName, int salary, int age) {
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
        this.secondName = sc.next();
        this.salary = sc.nextInt();
        this.age = sc.nextInt();

    }

}
