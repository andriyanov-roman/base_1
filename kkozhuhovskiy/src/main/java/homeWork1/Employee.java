package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class Employee {

    private String name;
    private String secondName;
    private double salary;
    private String gender;
    private int age;

    public Employee(){

    }
    public Employee(String name, String secondName, int salary, String gender, int age) {
        this.name =  name;
        this.secondName = secondName;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {return name;}
    public String getSecondName() {return secondName;}
    public double getSalary() {return salary;}
    public String getGender() {return gender;}
    public int getAge() {return age;}


    public void setName(String name) {this.name = name;}
    public void setSecondName(String secondName) {this.secondName = secondName;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setGender(String gender) {this.gender = gender;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}