package University.hardCore;

import University.entity.Department;
import University.inputOutput.CommonReader;
import University.inputOutput.readerHeirs.LecturersReader;
import University.inputOutput.readerHeirs.StudentsReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 03.04.2015.
 */
public class Start {
    public static void start () throws IOException{

    }

    public static ArrayList<Department> depIni () throws IOException{
        ArrayList<Department> departments = new ArrayList<>();
        File f = new File("src/main/java/University/additionalFiles/departments");
        String[] deps = f.list();
        for (int i = 0; i < deps.length; i++) {
            Department d = new Department();
            d.setTitle(String.valueOf(deps[i]));
            CommonReader lr = new LecturersReader("src/main/java/University/additionalFiles/departments/"+String.valueOf(deps[i]), ":");
            d.setLecturers(lr.readFromFile());
            CommonReader sr = new StudentsReader("src/main/java/University/additionalFiles/departments/"+String.valueOf(deps[i]), ":");
            d.setStudents(sr.readFromFile());
            departments.add(d);
        }
        return departments;
    }
    public static Department getMaxProgressDep() throws IOException{
        Department maxProgressDep = new Department();
        ArrayList<Department> departments = depIni();
//        ArrayList<ArrayList> eachDepStudents = new ArrayList<>();
        ArrayList<Double> eachDepAverage = new ArrayList<>();

        for (int i = 0; i < departments.size(); i++) {
            String[] s = new String[departments.size()];
            s[i] = departments.get(i).getTitle();
//            ArrayList<Integer> allMarks = new ArrayList<>();
//            ArrayList<ArrayList> eachStudentMarks = new ArrayList<>();
            ArrayList<Double> eachStudentAverage = new ArrayList<>();
            for (int j = 0; j < departments.get(i).getStudents().size(); j++) {
                ArrayList<Integer> marks = new ArrayList<>();
                for (int k = 0; k < departments.get(i).getStudents().get(j).getCourses().size(); k++) {
//                    allMarks.add(departments.get(i).getStudents().get(j).getCourses().get(k).getMark());
                    marks.add(departments.get(i).getStudents().get(j).getCourses().get(k).getMark());
                }
//                eachStudentMarks.add(marks);
                int m = marks.get(0);
                for (int a = 1; a < marks.size(); a++) { m = +marks.get(a); }
                double average = m/marks.size();
                eachStudentAverage.add(average);
            }
//            eachDepStudents.add(eachStudentMarks);
            double d = eachStudentAverage.get(0);
            for (int b = 1; b < eachStudentAverage.size(); b++) {d = +eachStudentAverage.get(b); }
            double average1 = d/eachStudentAverage.size();
            eachDepAverage.add(average1);
        }
        ArrayList<Double> tmp = eachDepAverage;
        for (int i = tmp.size()-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(tmp.get(i)>tmp.get(i+1)){

                }
            }
        }

        /*for(int l = employees.size()-1 ; l > 0 ; l--){
            for(int k = 0 ; k < l ; k++){
//                      Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if( employees.get(k).getSalary() > employees.get(k+1).getSalary() ){
                    Employee tmp = employees.get(k);
                    employees.set(k, employees.get(k+1));
                    employees.set(k+1, tmp);
                }
            }
        }*/


        return maxProgressDep;
    }
}
