package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class EmployeeUser {
    /*METHODS *************************/
    private String name;
    private String secondName;
    private int salary;
    private String gender;
    private int age;

    public EmployeeUser(){

    }
    public EmployeeUser(String name, String secondName, int salary, String gender, int age) {
        this.name =  name;
        this.secondName = secondName;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    /*GETTERS************************/
    public String getName() {return name;}
    public String getSecondName() {return secondName;}
    public int getSalary() {return salary;}
    public String getGender() {return gender;}
    public int getAge() {return age;}


    /*SET**********************************************************/
    public void setName(String name) {this.name = name;}
    public void setSecondName(String secondName) {this.secondName = secondName;}
    public void setSalary(int salary) {this.salary = salary;}
    public void setGender(String gender) {this.gender = gender;}
    public void setAge(int age) {this.age = age;}



    /*CONSTRUCTOR*/

}