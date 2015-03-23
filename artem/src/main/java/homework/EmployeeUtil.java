package homework;


import entity.Company;
import entity.Employee;
import java.io.*;
import java.util.ArrayList;

public class EmployeeUtil {
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Employee> getEmployees() throws IOException{
        File file = new File("artem/src/main/java/additionalFiles/employees");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Employee e = new Employee();
            e.setName(pool[0]);
            e.setSecondName(pool[1]);
            e.setSalary(Double.valueOf(pool[2]));
            e.setSex(pool[3]);
            e.setAge(Integer.valueOf(pool[4]));
            employees.add(e);
        }
        return employees;
    }
    public static void showEmployees(){
        for(int i = 0; i < employees.size(); i++){
                System.out.println(employees.get(i));
        }
    }
    public static void addEmployee() throws IOException{
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
        boolean b = true;
        while (b){
            String answer = Methods.scanner.next();
            if (answer.equals("m")) { sex = "male"; b=false; break; }
            else if (answer.equals("f")) { sex = "female"; b=false; break; }
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
        employees.add(e);
    }
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
    public static void saveEmployeeFile()throws IOException{
        FileWriter writer = new FileWriter("artem/src/main/java/additionalFiles/test");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < employees.size(); i++) {
            buffer.append(String.valueOf(employees.get(i).getName()+":"+employees.get(i).getSecondName()+":"+employees.get(i).getSalary()+":"+employees.get(i).getSex()+":"+employees.get(i).getAge()+":"+ "\n"));
        }
        writer.write(String.valueOf(buffer));
        writer.flush();
        writer.close();
    }
}
