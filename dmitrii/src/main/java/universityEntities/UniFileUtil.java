package universityEntities;

import entities.ComFileUtil;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class UniFileUtil extends ComFileUtil {
    public University readUniFile() {
        University uni = new University();
        ArrayList<Subject> subs = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        /*    ---- End of University states --- */
        File file = new File(this.getPath());
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
            ss.setMark(Integer.valueOf(subParts[2]));
            subjectsW.add(ss);
        }
        return subjectsW;
    }
}
