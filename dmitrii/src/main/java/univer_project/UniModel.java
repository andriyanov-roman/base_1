package univer_project;

import universityEntities.UniFileUtil;
import universityEntities.University;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 04.04.2015.
 */
public class UniModel {
    public static ArrayList<University> getUni(){
        ArrayList<University> uniS = new ArrayList<>();
        //
        UniFileUtil tool1 = new UniFileUtil();
        tool1.setPath("dmitrii\\src\\main\\resources\\universities\\Harvard.txt");
        University u1 = tool1.readUniFile();
        uniS.add(u1);
        //
        UniFileUtil tool2 = new UniFileUtil();
        tool2.setPath("dmitrii\\src\\main\\resources\\universities\\Oxford.txt");
        University u2 = tool2.readUniFile();
        uniS.add(u2);
        //
        UniFileUtil tool3 = new UniFileUtil();
        tool3.setPath("dmitrii\\src\\main\\resources\\universities\\XAI.txt");
        University u3 = tool3.readUniFile();
        uniS.add(u3);
        return uniS;
    }
}
