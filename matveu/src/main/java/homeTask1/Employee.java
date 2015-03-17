package homeTask1;

public class Employee {
    public String name;
    public String secondName;
    public String sex;
    public int age;
    public double salary;

    @Override
    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", salary=" + salary +
                ", age='" + age + '\'' + sex+
                '}';
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public Employee() {

    }

    public Employee(String name, String secondName,String sex,int age, double salary ) {  // создание конструктора
        this.name=name;
        this.secondName=secondName;
        this.sex=sex;
        this.age=age;
        this.salary=salary;
    }
}
