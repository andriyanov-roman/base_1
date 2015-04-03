package entities;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList workers;

    public ArrayList getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList workers) {
        this.workers = workers;
    }

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }

    @Override
    public String toString() {
        String str = companyName+"\n";
        for (int i = 0; i < workers.size(); i++) {
            str=str+workers.get(i).toString()+"\n";
        }
        return str;
    }
}
