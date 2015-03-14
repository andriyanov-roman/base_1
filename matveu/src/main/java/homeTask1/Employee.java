package homeTask1;

public class Employee {
    public String name;
    public String secondName;
    public double salary;


    public Employee(String name, String secondName, double salary ) {  // создание конструктора
        this.name=name;
        this.secondName=secondName;
        this.salary=salary;

    }
    public void setName (String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
