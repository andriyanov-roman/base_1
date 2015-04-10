package mvc.models;
import entities.university.University;
import entities.file_tools.UniverFileTool;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.04.2015.
 */
public class UniverModel extends CommonModel {
    private ArrayList<University> univers = new ArrayList<>();

    public ArrayList<University> getUnivers() {
        return univers;
    }

    public void setUnivers(ArrayList<University> univers) {
        this.univers = univers;
    }

    public UniverModel(String folderPath) {
        super(folderPath);
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            UniverFileTool tool = new UniverFileTool();
            univers.add(tool.readUniverFile(files[i]));
        }
    }

    public void updateUnivers(University univer) {
        for (int i = 0; i < getUnivers().size(); i++) {
            if (getUnivers().get(i).getUniName().equals(univer.getUniName())){
                getUnivers().set(i,univer);
            }
        }
    }

    public void saveToFile() {
        for (int i = 0; i < getUnivers().size(); i++) {
            UniverFileTool tool = new UniverFileTool(getFolderPath()+"\\"+getUnivers().get(i).getUniName()+".txt");
            tool.writeUniverToFile(getUnivers().get(i));
        }

    }
}
