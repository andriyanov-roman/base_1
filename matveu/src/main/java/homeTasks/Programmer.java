package homeTasks;


public class Programmer {
    public String name;
    public String secondName;
    public String sex;
    public int age;
    public double salary;
    public String programmingLanguage;

    public Programmer(){

    }
    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", sex=" + sex +
                ", age=" + age + '\'' + ", salary=" + salary + ", programmingLanguage=" + programmingLanguage +
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public Programmer(String name, String secondName,String sex,int age, double salary, String programmingLanguage) {  // создание конструктора
        this.name=name;
        this.secondName=secondName;
        this.sex=sex;
        this.age=age;
        this.salary=salary;
        this.programmingLanguage=programmingLanguage;
    }
}
