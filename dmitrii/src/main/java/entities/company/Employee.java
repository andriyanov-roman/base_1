package entities.company;

import java.util.Comparator;

/**
 * Created by user on 14.03.2015.
 */
public class Employee {
    private String name;
    private String surname;
    private Double salary;
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

    public Double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public Boolean getGender() {return gender;}
    public void setGender(Boolean gender) {this.gender = gender;}

    public String getGenderName (){
        if (gender){return "male";}
        if (!gender){return "female";}
        return "[gender not set]";
    }
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+separator+
                name+separator+
                surname+separator+
                salary+separator+
                gender+separator+
                age;
    }

   public class CompareBySalary implements Comparator<Employee>{
       @Override
       public int compare(Employee e1, Employee e2) {
           return  Double.compare(e1.getSalary(), e2.getSalary());
       }
   }
    public class CompareByAge implements Comparator<Employee>{
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getAge(), e2.getAge());
        }
    }
    public class CompareBySurnameLength implements Comparator<Employee>{
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getSurname().length(),e2.getSurname().length());
        }
    }
}

