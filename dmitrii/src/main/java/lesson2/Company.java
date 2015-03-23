package lesson2;

/**
 * Created by user on 14.03.2015.
 */
class Company {
    private String companyName;
    public Employee[] employees;

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }
}
