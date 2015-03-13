package Lessons;

/**
 * Created by user on 22.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harry";
        s1.secondName = "Potter";
        s1.marks = new int[]{5, 4, 5, 3, 4};

        Student s2 = new Student();
        s2.name = "Henry";
        s2.secondName = "Putter";
        s2.marks = new int[]{5, 3, 3, 3, 4};

        Student s3 = new Student();
        s3.name = "Hermy";
        s3.secondName = "Grow";
        s3.marks = new int[]{4, 4, 4, 3};

        Student s4 = new Student();
        s4.name = "Ron";
        s4.secondName = "Wisly";
        s4.marks = new int[]{2, 3, 5, 3, 3};

        Student s5 = new Student();
        s5.name = "Luna";
        s5.secondName = "Lawgud";
        s5.marks = new int[]{2, 4, 2, 2, 4};

        Student[] students = {s1, s2, s3, s4, s5};
        getMaxMarks(students);

    }

    public static void getMaxMarks(Student[] students) {
        int sum = 0;
        int indexSum = 0;
        Student maxStudent = students[0];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].marks.length; j++) {
                sum = students[i].marks[j] + sum;
            }
            if(sum > indexSum) {
                indexSum = sum;
                maxStudent = students[i];
            }
            sum = 0;
        }
        System.out.println(maxStudent.name + " " + maxStudent.secondName);
    }
}
