/**
 * Created by user on 25.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ruslan";
        s1.secondName = "Ivanov";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Oleg";
        s2.secondName = "Iven";
        s2.age = 23;

        Student s3 = new Student();
        s3.name = "Henry";
        s3.secondName = "Stays";
        s3.age = 18;

        Student s4 = new Student();
        s4.name = "Olha";
        s4.secondName = "Ivanova";
        s4.age = 19;

        Student s5 = new Student();
        s5.name = "Ivan";
        s5.secondName = "Semenov";
        s5.age = 21;

        Student[] students = {s1, s2, s3, s4, s5};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].secondName + " " + students[i].age);

        }
        getAgeMinIndexStudent(students);
        getAgeMaxIndexStudent(students);
        changeMinMax(students);


    }
    public static Student getAgeMinIndexStudent (Student[] students ) {
        Student studentMax = students[0];
        int indexMax = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].age > studentMax.age) {
                studentMax = students[i];
                indexMax = i;
            }
        }
        System.out.println(studentMax.name + " is the oldest student among others");
    return studentMax;
    }

    public static Student getAgeMaxIndexStudent(Student[] students) {
        Student studentMin = students[0];
        int indexMin = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].age < studentMin.age) {
                studentMin = students[i];
                indexMin = i;
            }
        }
        System.out.println(studentMin.name + " is the youngest student among others");
        return studentMin;
    }

    public static void changeMinMax ( Student[] students) {
        Student maxStudent = getAgeMaxIndexStudent(students);

    }
}
