package entities.file_tools;

import entities.university.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class UniverFileTool extends ComFileTool {
    public UniverFileTool(String filePath) {
        super.setPath(filePath);
    }

    public UniverFileTool() {
    }

    public University readUniverFile(File file) {
        University uni = new University();
        ArrayList<Subject> subs = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        /*    ---- End of University states --- */
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String line;
            String[] arrLine;
            while( (line=buffer.readLine()) !=null) {
                arrLine = line.split("<U>");
                switch (arrLine[0]){
                    case "uniName":
                        uni.setUniName(arrLine[1]);
                        break;
                    case "subjects":
                        String [] subDump = arrLine[1].split(";");
                        for (int i = 0; i < subDump.length; i++) {
                            subs.add(parseSubject(subDump[i],":"));
                        }
                        break;
                    case "teachers":
                        String [] teachDump = arrLine[1].split(";");
                        for (int j = 0; j < teachDump.length; j++) {
                            String [] teach = teachDump[j].split(":");
                            Teacher t = new Teacher();
                            t.setName(teach[0]);
                            t.setSurname(teach[1]);
                            t.setSubject(parseSubject(teach[2],"<s>"));
                            t.setSalary(Double.valueOf(teach[3]));
                            teachers.add(t);
                        }
                        break;
                    case "students":
                        String [] studentDump = arrLine[1].split(";");
                        for (int k = 0; k < studentDump.length; k++) {
                            String [] stud = studentDump[k].split(":");
                            Student s = new Student();
                            s.setName(stud[0]);
                            s.setSurname(stud[1]);
                            s.setSubjectList(parseSubWithMark(stud[2]));
                            students.add(s);
                        }
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        uni.setSubjects(subs);
        uni.setTeachers(teachers);
        uni.setStudents(students);
        return uni;
    }

    private static Subject parseSubject (String str, String regEx){
        String [] sub = str.split(regEx);
        Subject s = new Subject();
        s.setSubName(sub[0]);
        s.setHours(Double.valueOf(sub[1]));
        return s;
    }
    private ArrayList<SubjectWithMark> parseSubWithMark(String str) {
        ArrayList<SubjectWithMark> subjectsW = new ArrayList<>();
        String [] subsArr = str.split("<P>");
        for (int i = 0; i < subsArr.length; i++) {
            String [] subParts = subsArr[i].split("<s>");
            SubjectWithMark ss = new SubjectWithMark();
            ss.setSubName(subParts[0]);
            ss.setHours(Double.valueOf(subParts[1]));
            ss.setMark(Double.valueOf(subParts[2]));
            subjectsW.add(ss);
        }
        return subjectsW;
    }
    public void writeUniverToFile (University u) {
        String txt = "uniName<U>"+u.getUniName()+"\n";
        txt += "subjects<U>";
        for (int i = 0; i < u.getSubjects().size(); i++) {
            txt += u.getSubjects().get(i).getSubName()+":"+u.getSubjects().get(i).getHours()+";";
        }
        txt = txt.substring(0,txt.length()-1);
        txt += "\nteachers<U>";
        for (int i = 0; i < u.getTeachers().size(); i++) {
            Teacher t = u.getTeachers().get(i);
            txt += t.getName()+":"+ t.getSurname()+ ":"+t.getSubject().getSubName()+"<s>"+t.getSubject().getHours()+":"+
                    t.getSalary()+";";
        }
        txt = txt.substring(0,txt.length()-1);
        txt += "\nstudents<U>";
        for (int i = 0; i < u.getStudents().size(); i++) {
            Student s = u.getStudents().get(i);
            txt += s.getName()+":"+s.getSurname()+":";
            for (int j = 0; j < s.getSubjectList().size(); j++) {
                SubjectWithMark sub = s.getSubjectList().get(j);
                txt += sub.getSubName()+"<s>"+sub.getHours()+"<s>"+sub.getMark()+"<P>";
            }
            txt += ";";
        }
        txt = txt.substring(0,txt.length()-4);
        writeToFile(txt, false);
    }
}
