package lesson4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

    @Override
    public String toString() {
        return "\n"+getName()+" "+getSurname()+" ("+getSalary()+")$"+", "+getGender()+", "+getAge()+" years";
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


    public static ArrayList<Employee> getEmployees () throws IOException {
        ArrayList<Employee> empl = new ArrayList<>();
        File file = new File("D:\\testDir\\test.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

        String line;
        while( (line=buffer.readLine()) !=null){
            String[] pool = line.split("\n");
            for (int i = 0; i < pool.length; i++) {
                String[] workers = pool[i].split(":");
                Employee e = new Employee();
                e.setName(workers[0]);
                e.setSurname(workers[1]);
                e.setSalary(Double.valueOf(workers[2]));
                e.setGender(Boolean.valueOf(workers[3]));
                e.setAge(Integer.valueOf(workers[4]));
                empl.add(e);
            }
        }
        return empl;
    }

}

