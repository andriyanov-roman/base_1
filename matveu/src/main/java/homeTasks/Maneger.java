package homeTasks;


public class Maneger {
    public String name;
    public String secondName;
    public String sex;
    public int age;
    public double salary;
    public String nameOfProject;

    public Maneger() {

    }
    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", sex=" + sex +
                ", age=" + age + '\'' + ", salary=" + salary + ", projectName=" + nameOfProject +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
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

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSecondName() {

        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public Maneger(String name, String secondName,String sex,int age, double salary, String nameOfProject) {  // создание конструктора
        this.name=name;
        this.secondName=secondName;
        this.sex=sex;
        this.age=age;
        this.salary=salary;
        this.nameOfProject=nameOfProject;
    }
}