package homework.hw_1;

/**
 * Created by PC XP on 29.01.15.
 */
public class Employee {
    public String name;
    public String surname;
    public double salary;



    public Employee(String a, String b, double c){
       name = a ;
       surname = b;
        salary = c;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }








}


