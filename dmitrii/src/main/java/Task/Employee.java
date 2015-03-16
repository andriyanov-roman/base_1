package Task;

/**
 * Created by user on 14.03.2015.
 */
public class Employee {
    private String name;
    private String surname;
    private double salary;
    private Boolean gender;
    private int age;

    public Employee() {

    }

    public Employee(String name, String surname, Double salary, Boolean gender, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public void showEmployee () {
        System.out.println("\nName: "+getName()+
        "\nSurname: "+getSurname()+
        "\nSalary: "+getSalary()+"$"+
        "\nGender: "+getGender()+
        "\nAge: "+getAge());
    }
    // SETTERS ::::::::::::::
    public void setName (String name) {this.name = name;}
    public  void setSurname (String surname) {this.surname = surname;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setGender(Boolean gender) {this.gender = gender;}
    public void setAge(int age) {this.age = age;}
    public int getAge(int age) {return age;}

    // GETTERS :::::::::::::
    public String getName (){return name;}
    public String getSurname (){return surname;}
    public double getSalary() {return salary;}
    public String getGender() {
        if (gender == true) {return "male";};
        if (gender == false) {return "female";};
        return "[Not Set!!!]";
    }
    public int getAge() {return age;}
}

