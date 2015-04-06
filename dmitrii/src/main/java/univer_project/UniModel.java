package univer_project;

import entities.university.UniFileTool;
import entities.university.University;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class UniModel {
    public static ArrayList<University> getUni(){
        ArrayList<University> uniS = new ArrayList<>();
        //
        UniFileTool tool1 = new UniFileTool();
        tool1.setPath("dmitrii\\src\\main\\resources\\universities\\Harvard.txt");
        University u1 = tool1.readUniFile();
        uniS.add(u1);
        //
        UniFileTool tool2 = new UniFileTool();
        tool2.setPath("dmitrii\\src\\main\\resources\\universities\\Oxford.txt");
        University u2 = tool2.readUniFile();
        uniS.add(u2);
        //
        UniFileTool tool3 = new UniFileTool();
        tool3.setPath("dmitrii\\src\\main\\resources\\universities\\XAI.txt");
        University u3 = tool3.readUniFile();
        uniS.add(u3);
        return uniS;
    }
}
