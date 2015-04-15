package company_project_test;

import apps.company.CompanyModel;
import entities.company.Company;
import entities.company.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mit_OK! on 31.03.2015.
 */
public class ViewE {
    static Scanner scanner = new Scanner(System.in);


    @Test
    public void showWorkerSHORT () throws Exception {
        /* --------- Test Variables -------------*/
        String workerString = "Manager:Immanuel::1.00:true:300:Проект 'О природе вещей':fff:rrr";
        String separator = ":";
        /* -------------------------------------*/
        String[] p = workerString.split(Employee.getSeparator());
        String result = "";
        for (int i = 0; i < p.length; i++) {
            switch (i) {
                case 1:
                    p[1] = ">> " + p[1];
                case 3:
                    p[3] += "$";
                    break;
                case 4:
                    if (Boolean.valueOf(p[4])) {
                        p[4] = "male";
                    } else {
                        p[4] = "female";
                    }
                    break;
                case 5:
                    p[5] += " years";
                    break;
                case 6:
                    if (p[0].equals("Admin")) {
                        p[6] = "OS: " + p[6];
                    }
                    if (p[0].equals("Manager")) {
                        p[6] = "Project: " + p[6];
                    }
                    if (p[0].equals("Programmer")) {
                        p[6] = "Dev.lang.: " + p[6];
                    }
                    break;
            }
            if (p[i].isEmpty()) {
                p[i] = "[not set]";
            }
            result += p[i] + " ";
        }
        System.out.println(result);
    }
    @Test
    public void showWorkerFULL () throws Exception{
        /* --------- Test Variables -------------*/
        //String workerString="Admin:Neil::103499.0:falsDDe";
        String workerString="Programmer:Kevin:Mitnic:4400.24:true:40:C++";
        String separator=":";
        /* -------------------------------------*/
        String result = "";
        String[] p = workerString.split(Employee.getSeparator());
        if (p.length < 6) {
            result = "NOT ENOUGH DATA FOR CORRECT DISPLAY!\n"+
                    "All we have: " + workerString;
            //return result;
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i].isEmpty()) {
                p[i] = "[not set]";
            }
        }
        if (Boolean.valueOf(p[4])) {
            p[4] = "male";
        } else {
            p[4] = "female";
        }
        result = "\nJob title: " + p[0] + "\nName: " + p[1] + "\nSurname: " + p[2] +
                "\nSalary: " + p[3] + "$" + "\nGender: " + p[4] + "\nAge: " + p[5];
        if (p.length > 6) {
            String diffField = "";
            switch (p[0]) {
                case "Admin":
                    diffField = "\nOS/Platform: ";
                    break;
                case "Programmer":
                    diffField = "\nDev.lang.: ";
                    break;
                case "Manager":
                    diffField = "\nProjects: ";
                    break;
                default:
                    diffField = "\nOther field: ";
            }
            result += diffField + p[6];
        }
        if (p.length > 7) {
            for (int i = 7; i < p.length; i++) {
                result += "\nNew field: " + p[i];
            }
        }
        System.out.println(result);
    }

    @Test
    public void toTable () throws Exception {
        String rowStr ="Employee:Mirriam:Carter:14375.0:false:53";
        String titleStr = "Job title:Name:Surname:Salary:Gender:Age:Other";
        Company com = new Company();// = model.companyParse("src\\main\\resources\\companies\\ZAZ.txt");
        String regExp = ":";

        String [] titles = titleStr.split(regExp);
        String [] cells = titleStr.split(regExp);
        int colWidth = 16;
        int totalColumns = cells.length;
        int fullWidth = colWidth * cells.length;
        toDash(fullWidth);
        toHeader(fullWidth, com.getCompanyName());
        toPlusDash(colWidth, totalColumns);
        toRowCenter(colWidth, titles);
        toPlusDash(colWidth, totalColumns);
        /*for (int i = 0; i < com.getWorkers().size(); i++) {
            ArrayList division = (ArrayList) com.getWorkers().get(i);
            for (int j = 0; j < division.size(); j++) {
                String tempStr = division.get(j).toString();
                String temp[]=tempStr.split(Employee.getSeparator());
                if (temp.length<totalColumns){
                    for (int k = temp.length; k < totalColumns; k++) {
                        tempStr+=(Employee.getSeparator()+" ");
                    }
                }
                cells = tempStr.split(Employee.getSeparator());
                toRow(colWidth, cells);
            }
        }*/
        toDash(fullWidth);

        /*System.out.format("\n| %1$10s | %2$10s | %3$10s | %4$10s", string1, int1, string2, string3);*/

    }
    public static void toDash (int fullWidth) {
        System.out.println();
        for (int i = 0; i < fullWidth; i++) {
            System.out.print("-");
        }
    }
    public static void toHeader (int fullWidth, String CompanyName) {
        int margin = fullWidth/2-1;
        System.out.format("\n|%1$" + margin + "s%2$" + margin + "s|", CompanyName, "");
    }
    public  static void toPlusDash (int colWidth, int totalColumns) {
        System.out.println();
        for (int i = 0; i < totalColumns; i++) {
            int j;
            for (j = 0; j < colWidth-1; j++) {
                System.out.print("-");
            }
            if (j!=(colWidth-2)) {System.out.print("+");}
            else {System.out.print("|");}
        }
    }
    public static void toRow (int colWidth, String[] cells){
        System.out.print("\n|");
        for (int i = 0; i < cells.length; i++) {
            if (i==0){System.out.format("%1$" + (colWidth - 2) + "s|", cells[i]);}
            else {System.out.format("%1$" + (colWidth - 1) + "s|", cells[i]);}
        }
    }
    public static void toRowCenter (int colWidth, String[] cells){
        System.out.print("\n|");
        for (int i = 0; i < cells.length; i++) {
            int right = (colWidth-cells[i].length())/2;
            int left = right+cells[i].length();
            if (cells[i].length()%2==0){left=left-1;}
            if (i==0) {System.out.format("%1$"+(left-1)+"s%2$"+right+"s|", cells[i],"");}
            else {System.out.format("%1$"+left+"s%2$"+right+"s|", cells[i],"");}
        }
    }
}
