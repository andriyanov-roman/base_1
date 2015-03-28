package homeTasks;


import java.util.ArrayList;

public class Company {
    public String companyName;
    public ArrayList<Employee> employees;
    public ArrayList<Meneger> manegers;
    public ArrayList<Admin> admins;
    public ArrayList<Programmer> programmers;

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }


    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public ArrayList<Meneger> getManegers() {
        return manegers;
    }

    public void setManegers(ArrayList<Meneger> manegers) {
        this.manegers = manegers;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }
}
