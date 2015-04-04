package entities;

/**
 * Created by user on 14.03.2015.
 */
public class Employee {
    private String name;
    private String surname;
    private double salary;
    private Boolean gender;
    private int age;
    private static String separator = ":"; // "separator", то есть разделитель

    public Employee(String name, String surname, Double salary, Boolean gender, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public Employee() {
    }

    public static String getSeparator() {return separator;}

    public String getName (){return name;}
    public void setName (String name) {this.name = name;}

    public String getSurname (){return surname;}
    public  void setSurname (String surname) {this.surname = surname;}

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public String getGender() {
        if (gender == true) {return "male";};
        if (gender == false) {return "female";};
        return "[Not Set!!!]";
    }
    public void setGender(Boolean gender) {this.gender = gender;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+separator+
                getName()+separator+
                getSurname()+separator+
                getSalary()+separator+
                gender+separator+
                getAge();
    }

}

