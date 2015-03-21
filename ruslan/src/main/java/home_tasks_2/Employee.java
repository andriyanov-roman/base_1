package home_tasks_2;

/**
 * Created by user on 19.03.2015.
 */
public class Employee extends Company {
    public String name;
    public String secondName;
    public String gender;
    public int age;
    public double salary;

    public Employee() {

    }

    @Override
    public String toString() {
        return name + " " + " " + secondName +  " " + " " + age +  " " + " " + gender +  " " + " " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public Employee(String name, String secondName, int age, String gender, double salary) {
    }


}


