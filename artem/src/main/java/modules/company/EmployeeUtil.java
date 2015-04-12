package modules.company;


import entity.company.Employee;
import Body;

import java.io.*;
import java.util.ArrayList;

public class EmployeeUtil {
    public static ArrayList<Employee> getEmployees(String path, String regExp) throws IOException{
        ArrayList<String[]> strings = Body.readFromFile(path, regExp);
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Employee e = new Employee();
            e.setName(strings.get(i)[0]);
            e.setSecondName(strings.get(i)[1]);
            e.setSalary(Double.valueOf(strings.get(i)[2]));
            e.setSex(strings.get(i)[3]);
            e.setAge(Integer.valueOf(strings.get(i)[4]));
            employees.add(e);
        }
        return employees;
    }
    public static void showEmployees(String company, ArrayList<Employee> employees) throws IOException{
        for(int i = 0; i < employees.size(); i++) System.out.println(company + " " + employees.get(i).toString());
    }
    public static void addEmployee(String company) throws IOException{
        System.out.println(" Fill the fields, please!");
        Body.scanner.useDelimiter("\n");
        System.out.print("Name: ");
        String name = Body.scanner.next();
        System.out.print("Surname: ");
        String surname = Body.scanner.next();
        Double salary=0.0;
        boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
        while (true) {
            System.out.print("Salary: ");
            try {
                salary = Double.parseDouble(Body.scanner.next());
            } catch (Exception e) {
                System.out.println("Wrong input! The input must be an positive Double number. Try again.");
                wasExc = true;
            }
            if (salary>0.0) {
                break;
            } else if (!wasExc) {
                System.out.println("Oh, the input integer number must be positive! Try again.");
            }
        }
        String sex="";
        System.out.print("Gender (\"m\"-male, \"f\"-female): ");
        while (true){
            String answer = Body.scanner.next();
            if (answer.equals("m")) { sex = "male"; break; }
            else if (answer.equals("f")) { sex = "female"; break; }
            System.out.print("Input Gender letter (\"m\"-male, \"f\"-female): ");
        }
        int age=0;
        wasExc = false;
        while (true) {
            System.out.print("Age: ");
            try {
                age = Integer.parseInt(Body.scanner.next());
            } catch (Exception e) {
                System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
                wasExc = true;
            }
            if (age>0) {
                break;
            } else if (!wasExc) {
                System.out.println("Oh, the input integer number must be positive! Try again.");
            }
        }
        Employee e = new Employee(name,surname,salary,sex,age);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e);
        if (company.equals("a")){
            System.out.print(" Enter Company Name: ");
            String s = Body.scanner.next();
            CompanyUtil.addCompany(s, employees);
        }
        else {
            Body.writeToFile("artem/src/main/java/files/companies/" + company, employees);}
    }
}