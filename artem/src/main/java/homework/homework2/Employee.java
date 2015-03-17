package homework.homework2;


public class Employee { // Создаем класс-шаблон ("формочку для печенек")
    private String name;
    private String secondName; // Объявляем еще одно поле класса. Их может быть сколько угодно
    private double salary;
    private String sex;
    private int age;

    public Employee(String name, String secondName, double salary, String sex, int age) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.sex = sex;
        this.age = age;
    }

    public Employee() {
    } // Это конструктор по умолчанию, его нужно объявлять если создан искуственный конструктор
    // Конструктор позволяет прощще заполнять формочку и "выпикать печеньку"
    //null это дефолтное знач для всех объектов ссылочного типа

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}