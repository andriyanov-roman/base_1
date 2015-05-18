package lessons.l18042015;

/**
 * Created by user on 14.03.2015.
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private String surname;
    private double salary;
    private Boolean gender;
    private int age;
    private static String separator = ":"; // "separator", �� ���� �����������

    public Employee(String name, String surname, Double salary, Boolean gender, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public Employee() {
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public static String getSeparator() {return separator;}

    public String getName (){return name;}
    public void setName (String name) {this.name = name;}

    public String getSurname (){return surname;}
    public  void setSurname (String surname) {this.surname = surname;}

    public double getSalary() {return salary;}
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

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.getSalary()) return -1;
        if (this.salary > o.getSalary()) return 1;
        return 0;
    }
}

