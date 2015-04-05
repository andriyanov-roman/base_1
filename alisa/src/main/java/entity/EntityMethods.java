package entity;

import company.Company;
import company.CompanyMethods;
import company.CompanyUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23.03.2015.
 */

public class EntityMethods {
    private Scanner scanner = new Scanner(System.in);


    public void start() throws IOException {
        System.out.println("Enter command key: " +
                "\n 0.Show Admin MaxSalary \n ");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    getMaxSalary();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }


    public ArrayList<Admin> getAdmins(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = CompanyUtil.readFromFile(path, regExp);
        ArrayList<Admin> admins = new ArrayList <> ();
        for (int i = 0; i < strings.size(); i++) {
            Admin a = new Admin();
            a.setName(strings.get(i)[0]);
            a.setSurname(strings.get(i)[1]);
            a.setSalary(Double.valueOf(strings.get(i)[2]));
            a.setPlatformName(strings.get(i)[3]);
            admins.add(a);
        }

        return admins;
    }




    public void getMaxSalary() throws IOException {
        ArrayList<Admin> admins = getAdmins("alisa\\src\\result\\Admin.txt", ":");
        Admin temp = admins.get(0);
         for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getSalary() > temp.getSalary()){
                temp = admins.get(i);

                }
            }
            System.out.println(temp.getName() + " " + temp.getSalary() + " " + temp.getPlatformName());
        }

    }



