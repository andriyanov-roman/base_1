package home_task6;


public class Student extends Person{
    public String ObjectsList;

    public Student(String nameUniver, int accreditationLevel, String facultyList, String name, String secondName, String ObjectList) {
        super(nameUniver, accreditationLevel, facultyList, name, secondName);
        this.ObjectsList = ObjectList;

        class StudentObject {
            public String nameObject;
            public double hours;
            public double estimation;

        }

    }
}
