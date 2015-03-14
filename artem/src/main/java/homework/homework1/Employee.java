package homework.homework1;


public class Employee {
    public String name;
    public String secondName;
    public double salary;

    public Employee(){ // Это конструктор по умолчанию,
    }

    public Employee(String name, String secondName, double salary){
        this.name =name;
        this.secondName = secondName;
        this.salary = salary;
        //конструктор это --
        // this.name = name;
        //null это дефолтное знач для всех объектов ссылочного типа
    }
}