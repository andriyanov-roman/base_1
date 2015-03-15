package homeTask1;

public class Employee {
    public String name;
    public String secondName;
    public String sex;
    public int age;
    public double salary;


    public Employee(String name, String secondName,String sex,int age, double salary ) {  // создание конструктора
        this.name=name;
        this.secondName=secondName;
        this.sex=sex;
        this.age=age;
        this.salary=salary;

    }
    public void setName (String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
