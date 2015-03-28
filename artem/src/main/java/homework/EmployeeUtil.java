package homework;


import entity.Company;
import entity.Employee;
import java.io.*;
import java.util.ArrayList;

public class EmployeeUtil {
//    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Employee> getEmployees(String path, String regExp) throws IOException{
        ArrayList<String[]> strings = Methods.readFromFile(path, regExp);
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
        Methods.scanner.useDelimiter("\n");
        System.out.print("Name: ");
        String name = Methods.scanner.next();
        System.out.print("Surname: ");
        String surname = Methods.scanner.next();
        Double salary=0.0;
        boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
        while (true) {
            System.out.print("Salary: ");
            try {
                salary = Double.parseDouble(Methods.scanner.next());
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
            String answer = Methods.scanner.next();
            if (answer.equals("m")) { sex = "male"; break; }
            else if (answer.equals("f")) { sex = "female"; break; }
            System.out.print("Input Gender letter (\"m\"-male, \"f\"-female): ");
        }
        int age=0;
        wasExc = false;
        while (true) {
            System.out.print("Age: ");
            try {
                age = Integer.parseInt(Methods.scanner.next());
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
            String s = Methods.scanner.next();
            CompanyUtil.addCompany(s, employees);
        }
        else {Methods.writeToFile("artem/src/main/java/additionalFiles/companies/"+company, employees);}
    }
    /*
    public static void deleteEmployee() throws IOException{
        int i = -1;
        while (true) {
            System.out.print("Enter the employee index [0;"+(employees.size()-1)+"]:");
            try {
                i = Integer.parseInt(Methods.scanner.next());
                employees.remove(i);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
            } catch (IndexOutOfBoundsException e){ // чем эта ошибка отличкестя от ArrayIndexOutOfBoundsException???
                System.out.println("Wrong inpup! Array index out of bounds [0;"+(employees.size()-1)+"]. Try again.");
            }
            if (i >= 0 && i <= employees.size()) { break; }
        }
    }
    */
}