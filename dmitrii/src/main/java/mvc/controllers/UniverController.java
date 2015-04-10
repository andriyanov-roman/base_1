package mvc.controllers;

import entities.university.*;
import mvc.models.UniverModel;
import mvc.views.UniverView;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class UniverController extends CommonController{
    private UniverModel model;
    private UniverView view;
    private Double maxMark = 100.0;

    public UniverController(UniverModel model, UniverView view) {
        super(view);
        this.model = model;
        this.view = view;
    }


    @Override
    public Boolean executeTasks() {
        switch (view.next()) {
            case "0":
                showUniver();
                break;
            case "1":
                findBestUniver();
                break;
            case "2":
                addStudent();
                break;
            case "3":
                showAverageStudent();
                break;
            case "4":
                increaseTeacherSalary();
                break;
            case "exit":
            case "Exit":
            case "e":
            case "E":
                model.saveToFile();
                return false;
            default:
                view.alert("No such case");
        }
        return true;
    }

    private void showUniver() {
        view.showUniverTable(chooseUniversity());
    }

    private void findBestUniver() {
        ArrayList<UniversityWithAverageMark> univers = new ArrayList<>();
        for (int i = 0; i < model.getUnivers().size(); i++) {
            University currUniver = model.getUnivers().get(i);
            UniversityWithAverageMark u = new UniversityWithAverageMark(currUniver);
            univers.add(u);
        }
        UniversityWithAverageMark bestUniver = univers.get(0);
        for (int i = 0; i < univers.size(); i++) {
            if (univers.get(i).getAverageMark()>bestUniver.getAverageMark()){
                bestUniver = univers.get(i);
            }
        }
        view.showUniverTable(bestUniver.getUniversity());
        view.alert("\n\t    Average mark: "+bestUniver.getAverageMark());
    }

    private void addStudent() {
        Boolean tryAgain = true;
        University univer = new University();
        int n = -1;
        Student student = null;
        while (tryAgain) {
            n = view.DialogChooseUniver(model.getUnivers());
            univer = model.getUnivers().get(n);
            if (student==null) {student = view.DialogAddStudent();}
            if (!compareSubjects(student, univer)) {
                tryAgain = view.DialogYesNo("Try another university?");
             } else {
                tryAgain = false;
            }
        }
        model.getUnivers().get(n).getStudents().add(student);
        view.MsgAddStudent(student, univer.getUniName());
    }
    private Boolean compareSubjects (Student student, University univer){
        for (int i = 0; i < student.getSubjectList().size(); i++) {
            Boolean subIsFind = false;
            String  sbj = student.getSubjectList().get(i).getSubName();
            for (int j = 0; j < univer.getSubjects().size(); j++) {
                String uSbj = univer.getSubjects().get(j).getSubName();
                if (sbj.equals(uSbj)) {
                    subIsFind = true;
                    break;
                }
            }
            if (subIsFind == false) {
                view.MsgAddStudent(student, sbj, univer.getUniName(), true);
                return false;
            }
        }
        return true;
    }

    private void showAverageStudent() {
        University univer = chooseUniversity();
        Double [] rangeMarks = view.DialogAddRange(maxMark);
        for (int i = 0; i < univer.getStudents().size(); i++) {
            Student student = univer.getStudents().get(i);
            Double averMark = calcStudentAverMark(student);
            if (averMark >= rangeMarks[0] && averMark <= rangeMarks[1]) {
                view.alert(student.toString() + ". Average mark: " + averMark);
            }
        }
    }

    private Double calcStudentAverMark(Student s) {
        Double averMark = 0.0;
        for (int i = 0; i < s.getSubjectList().size(); i++) {
            averMark += s.getSubjectList().get(i).getMark();
        }
        return averMark/s.getSubjectList().size();
    }

    private University chooseUniversity () {
        int n = view.DialogChooseUniver(model.getUnivers());
        return model.getUnivers().get(n);
    }
    private void increaseTeacherSalary() {
        ArrayList<SubjectWithMark> sbjWm = new ArrayList<>();
        University univer = chooseUniversity();
        SubjectWithMark bestSbj = getSbjWithMark(univer.getSubjects().get(0).getSubName(), univer);
        for (int i = 0; i < univer.getSubjects().size(); i++) {
            String sbjName = univer.getSubjects().get(i).getSubName();
            SubjectWithMark currSbj = getSbjWithMark(sbjName,univer);
            if (currSbj.getMark()>bestSbj.getMark()){
                bestSbj = currSbj;
            }
        }
        for (int i = 0; i < univer.getTeachers().size(); i++) {
            Teacher t = univer.getTeachers().get(i);
            if (t.getSubject().getSubName().equals(bestSbj.getSubName())){
                Double salary = t.getSalary();
                view.alert("Best teacher: "+t.getName()+" "+t.getSurname());
                view.alert("Subject: "+t.getSubject().getSubName());
                view.alert("Old salary: "+salary+"$");
                salary = salary*1.10;
                t.setSalary(salary);
                view.alert("New salary (+10%): "+Math.round(t.getSalary())+"$");
                break;
            }
        }
        model.updateUnivers(univer);
    }

    private SubjectWithMark getSbjWithMark(String subName, University univer) {
        Double averMark = 0.0;
        for (int i = 0; i < univer.getStudents().size(); i++) {
            Student student = univer.getStudents().get(i);
            for (int j = 0; j < student.getSubjectList().size(); j++) {
                if (subName.equals(student.getSubjectList().get(j).getSubName())){
                    averMark += student.getSubjectList().get(j).getMark();
                }
            }
        }
        SubjectWithMark s = new SubjectWithMark();
        s.setSubName(subName);
        s.setMark(averMark / univer.getStudents().size());
        return s;
    }
}
