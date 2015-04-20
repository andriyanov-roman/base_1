package apps.employees;


public class Programmer extends Employee{
    public String programmingLanguage;

    public Programmer(){

    }
    public String toString() {
        return getName() + " " + " " + getSecondName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() + '\'' + ", salary=" + getSalary() + ", programmingLanguage=" + getProgrammingLanguage() +
                '}';
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public Programmer(String name, String secondName,String sex,int age, double salary, String programmingLanguage) {
        super(name,secondName,sex,age,salary); // создание конструктора

        this.programmingLanguage=programmingLanguage;
    }
}
