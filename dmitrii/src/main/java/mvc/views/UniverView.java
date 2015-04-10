package mvc.views;

import entities.university.*;
import valid.UniverValidator;
import valid.Validator;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class UniverView extends CommonView {

    @Override
    public void showMainMenu() {
        alert("\n0. Show university INFO\n" +
                "1. Show best university\n" +
                "2. Add student\n" +
                "\t(Если в списке предметов студента указан предмет которого нет в списке предметов университета, то студента не добовлять)\n" +
                "3. Show students with average mark in RANGE\n" +
                "4. For best teacher increase salary for 10%\n"+
                "e. (or \'exit\') Save and Exit");
        alertInline("Ваш выбор: ");
    }

    public int DialogChooseUniver(ArrayList<University> univers) {
        alert("Choose number of University or type 's' to input name manually: ");
        for (int i = 0; i < univers.size(); i++) {
            alert((i+1)+". "+univers.get(i).getUniName());
        }
        alertInline("Your choice: ");
        String input = next();
        if (input.isEmpty()) {// Если введено пустое значение
            alert("[field not set]");
            return DialogChooseUniver(univers);
        }
        if ("s".equals(input)){ // Вводим название универа вручную
            alertInline("Type name of University: ");
            input = next();
            for (int i = 0; i < univers.size(); i++) {
                if (input.equals(univers.get(i).getUniName())){
                    return i;
                }
            }
            alert("\tUNIVERSITY WITH NAME \'"+input+"\' NOT FOUND");
            return DialogChooseUniver(univers);
        }
        if (validator.canBeInt(input)) { // Водим название универа цифрой
            if (validator.canBeInPositiveRange(Integer.valueOf(input), univers.size())) {
                return Integer.valueOf(input)-1;
            } else {
                alert("\tTHERE ARE ONLY "+univers.size()+" UNIVERSITIES AVAILABLE!");
                return DialogChooseUniver(univers);
            }
        }
        alert("\tNO SUCH CASE");
        return DialogChooseUniver(univers);
    }

    public Student DialogAddStudent() {
        alert("\t*** ADDING STUDENT ***");
        Student s = new Student();
        s.setName(fillInLetterField("Name: "));
        s.setSurname(fillInLetterField("Surname: "));
        s.setSubjectList(addSubjectsWithMark());
        return s;
    }

    private ArrayList<SubjectWithMark> addSubjectsWithMark() {
        alert("\t -ADDING SUBJECT-");
        ArrayList<SubjectWithMark> subWithMarkslist = new ArrayList<>();
        Boolean goOn = true;
        while (goOn) {
            subWithMarkslist.add(addSbj());
            alertInline("Add another subject? (y/n): ");
            if (next().equals("y")) {goOn = true;}
            else {goOn = false;}
        }
        return subWithMarkslist;
    }
    private SubjectWithMark addSbj (){
        SubjectWithMark subject = new SubjectWithMark();
        subject.setSubName(fillInLetterField("Name of Subject: "));
        subject.setHours(fillInDoublePosField("Academical hours (max 100): ", 100.0));
        subject.setMark(0.0);
        return subject;
    }


    public void MsgAddStudent(Student student, String studSbjName, String uniName, Boolean error) {
        alert("\t" + student.getName() + " " + student.getSurname() + " can not be added," +
                " because university \'" + uniName + "\' " +
                "\n\tdoesn\'t have subject \'" + studSbjName + "\'");
    }

    public void MsgAddStudent(Student student, String uniName) {
        alert("\tStudent " + student.getName() + " " + student.getSurname() +
                " was added SUCCESSFULLY to \'" + uniName + "\'");
    }

    public Double[] DialogAddRange(Double maxValueOfMark) {
        Double [] rangeMark = new Double[2];
        alert("\tInput range: ");
        rangeMark[0] = fillInDoublePosField("Lower bound: ", maxValueOfMark);
        rangeMark[1] = fillInDoublePosField("Upper bound: ", maxValueOfMark);
        return rangeMark;
    }
    public void showUniverTable (University u){
        String [] titles = {"Name", "Surname","Subject ", "Other"};
        Table table = new Table("University \'"+u.getUniName()+"\'",titles,24);
        table.renderTableHead();
        table.toFullWidthRowLeft("SUBJECTS:" + u.getSubjects().toString());
        table.toPlusDash();
        table.toFullWidthRowLeft("TEACHERS:");
        table.toPlusDash();
        table.toCenterTitles();
        table.toPlusDash();
        for (int i = 0; i < u.getTeachers().size(); i++) {
            Teacher t = u.getTeachers().get(i);
            String [] cells = {t.getName(),t.getSurname(),t.getSubject().toString(),t.getSalary()+"$"};
            table.toRow(cells);
        }
        table.toPlusDash();
        table.toFullWidthRowLeft("STUDENTS:");
        table.toPlusDash();
        table.toCenterTitles();
        for (int i = 0; i < u.getStudents().size(); i++) {
            Student s = u.getStudents().get(i);
            for (int j = 0; j < s.getSubjectList().size(); j++) {
                SubjectWithMark sub = s.getSubjectList().get(j);
                if (j==0) {
                    table.renderTableEnd();
                    String [] cells = {s.getName(),s.getSurname(),sub.getSubName()+
                            " ("+sub.getHours()+"h)","Mark: "+sub.getMark()};
                    table.toRow(cells);
                } else {
                    String [] cells = {" " , " ",sub.getSubName()+
                            " ("+sub.getHours()+"h)","Mark: "+sub.getMark()};
                    table.toRow(cells);
                }

            }
        }
        table.renderTableEnd();
    }
}
