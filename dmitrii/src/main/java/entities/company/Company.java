package entities.company;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> workers;

    public Company() {
    }

    public Company(String companyName, Employee e) {
        this.companyName = companyName;
        ArrayList<Employee> stuff = new ArrayList<>();
        stuff.add(e);
        this.workers = stuff;
    }

    public ArrayList<Employee> getWorkers() {
        return workers;
    }

    public void setWorkers( ArrayList<Employee> workers) {
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
