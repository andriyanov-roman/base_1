package hometask3;

/**
 * Created by user on 14.03.2015.
 */
public class Employee {
    private String name;
    private String secondName;
    private double salary;
    private String address;
    //public enum sex{FEMININE ,MASCULINE}
    private String sex;
    private int age;
    public Employee(){
    }
    public Employee(String name, String secondName,double salary,String sex, int age ){
        this.name = name;
        this.secondName=secondName;
        this.salary=salary;
        this.sex = sex;
        this.age = age;
    }
    public Employee(String name, String secondName,double salary){
        this.name = name;
        this.secondName=secondName;
        this.salary=salary;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public String getSecondName (){
        return secondName;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        String employeeToString =   name + ":" +
                secondName + ":" +
                salary + ":" +
                sex + ":" +
                age+ "\n";

        return employeeToString;
    }
}
