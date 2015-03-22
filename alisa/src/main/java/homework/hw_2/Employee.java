package homework.hw_2;

/**
 * Created by admin on 16.03.15.
 */
public class Employee {

    private String name;
    private String surname;
    private double salary;
    private int age;
    private String sex;

    public Employee(String name, String surname, double salary,int age, String sex ){
        this.name = name ;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.sex = sex;

    }

    public String getName (){
        return name;
    }
    public void setName (){
        this.name = name;
    }
    public String getSurname(){
    return surname;
}
    public void setSurname(){
        this.surname = surname;
    }
    public double getSalary(){
        return salary;
    }
    public void  setSalary(){
        this.salary = salary;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(){
        this.sex = sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge (){
        this.age = age;
    }
    }
