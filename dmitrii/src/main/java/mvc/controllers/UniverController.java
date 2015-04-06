package mvc.controllers;

import entities.university.Student;
import entities.university.University;
import entities.university.UniversityWithAverageMark;
import mvc.models.UniverModel;
import mvc.views.UniverView;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class UniverController extends CommonController{
    private UniverModel model;
    private UniverView view;

    public UniverController(UniverModel model, UniverView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void run() {
        isRun = true;
        while (isRun) {
            view.showMainMenu();
            isRun = executeTasks();
        }
        System.exit(0);
    }

    @Override
    public Boolean executeTasks() {
        switch (UniverView.next()) {
            case "0":
                //showUnis();
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
                return false;
            default:
                view.alert("No such case");
        }
        return true;
    }

    private void findBestUniver() {
        ArrayList<UniversityWithAverageMark> univers = new ArrayList<>();
        Double univerAverageMark = 0.0;
        for (int i = 0; i < model.getUnivers().size(); i++) {
            University u = model.getUnivers().get(i);
            for (int j = 0; j < u.getStudents().size(); j++) {
                Double studAverageMark=0.0;
                Student s = u.getStudents().get(j);
                for (int k = 0; k < s.getSubjectList().size(); k++) {
                    studAverageMark+=s.getSubjectList().get(k).getMark();
                }
                studAverageMark = studAverageMark / s.getSubjectList().size();
                univerAverageMark = univerAverageMark + studAverageMark;
            }
            univerAverageMark = univerAverageMark / u.getStudents().size();
            UniversityWithAverageMark tempU = new UniversityWithAverageMark();
            univers.add(tempU);
            univers.get(i).setUniversity(u);
            univers.get(i).setAverageMark(univerAverageMark);
            univerAverageMark = 0.0;
        }
        UniversityWithAverageMark bestUniver = univers.get(0);
        for (int i = 0; i < univers.size(); i++) {
            if (univers.get(i).getAverageMark()>bestUniver.getAverageMark()){
                bestUniver = univers.get(i);
            }
        }
        view.alert(bestUniver.toString());
    }

    private void addStudent() {
    }

    private void showAverageStudent() {
    }

    private void increaseTeacherSalary() {
    }
}
