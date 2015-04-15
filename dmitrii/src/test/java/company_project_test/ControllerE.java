package company_project_test;

import apps.company.CompanyModel;
import entities.company.Admin;
import entities.company.Company;
import entities.company.Employee;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 31.03.2015.
 */
public class ControllerE {
    @Test
    public void getMaxSalaryInComp () throws Exception{
        //Company com = CompanyModel.companyParse("src\\main\\resources\\companies\\Polaris.txt");


       /* Employee eWithMaxSalary = (Employee)((ArrayList)com.getWorkers().get(0)).get(0);
        for (int i = 0; i < com.getWorkers().size(); i++) {
            ArrayList division = (ArrayList) com.getWorkers().get(i);
            for (int j = 0; j < division.size(); j++) {
                Employee eNext = (Employee)division.get(j);
                if (eNext.getSalary() > eWithMaxSalary.getSalary()) {
                    eWithMaxSalary = eNext;
                    if (division.get(i) instanceof Admin){
                        //analytics.setAdminMax((Admin) division.get(i));
                    }
                    *//*if (division.get(i) instanceof Manager){maxStuff.set(2,division.get(i));}
                    if (division.get(i) instanceof Programmer){maxStuff.set(3,division.get(i));}
                    if (division.get(i) instanceof Employee){maxStuff.set(0,division.get(i));}*//*
                }
            }
        }
        //return  analytics;*/
    }

    @Test
    public void getAdminMaxSalary () throws Exception {
        //Company com = CompanyModel.companyParse("src\\main\\resources\\companies\\Polaris.txt");
        //ArrayList<Admin> admins = com.getAdmins();
        /* ----------------------------------------------*/
       /* Admin aMax = admins.get(0);
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getSalary()>aMax.getSalary()) {
                aMax = admins.get(i);
            }
        }*/
        //System.out.println(aMax);
    }
}
