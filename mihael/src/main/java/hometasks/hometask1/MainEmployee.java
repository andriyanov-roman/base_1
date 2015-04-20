package hometasks.hometask1;

import java.util.Scanner;

/**
 * Created by Администратор on 12.03.2015.
 */
public class MainEmployee {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        showMenu();

        while (scanner.hasNext()) {

            switch (scanner.next()) {
                case "1":
                    showEmployees(EmployeeUtil.getEmployees());
                    break;
                case "2":
                    showEmployee(getBigSalaryUserId());
                    break;
                case "3":
                    showEmpSameName();
                    break;
                case "4":
                    showEmployees(bubbleSortEmpById());
                    break;
                case "5":
                    showEmployees(bubbleSortEmpBySalary());
                    break;
                default:
                    System.out.println("No such case");
                    System.out.println("1. Show all employees.\n"+
                                    "2. Show an employee with biggest sallary. \n"+
                                    "3. Show an employees with the same firstname and lastname.\n"+
                                    "4. Show an employees sorted by id.\n"+
                                    "5. Show an employees sorted by salary.\n"+
                                    "Type Exit to exit"
                    );
            }
        }
    }

    public static void showMenu(){
        System.out.println("1. Show all employees.\n"+
                        "2. Show an employee with biggest sallary. \n"+
                        "3. Show an employees with the same firstname and lastname.\n"+
                        "4. Show an employees sorted by id.\n"+
                        "5. Show an employees sorted by salary.\n"+
                        "Type Exit to exit"
        );

    }


    public static Employee[] bubbleSortEmpById() {
        Employee[] employees = EmployeeUtil.getEmployees();
        for (int i= 0; i<employees.length;i++){
            for (int j = i+1; j < employees.length; j++){
                if(employees[i].id>employees[j].id){
                    Employee tempEmp = new Employee();
                    tempEmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tempEmp;

                }
            }
        }
        return employees;

    }

    public static Employee[] bubbleSortEmpBySalary(){
        Employee[] employees = EmployeeUtil.getEmployees();
        for (int i= 0; i<employees.length;i++){
            for (int j = i+1; j < employees.length; j++){
                if(employees[i].salary>employees[j].salary){
                    Employee tempEmp = new Employee();
                    tempEmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tempEmp;

                }
            }
        }
        return employees;

    }



    public static void showEmployees(Employee[] employees){

        for (int i= 0; i<employees.length;i++){
            System.out.println(
                    "-------------employee"+i+"----------\n"+
                    "id: "+  employees[i].id +" | " +
                    "first name: "+  employees[i].firstName +" | " +
                    "last name: "+  employees[i].lastName +" | " +
                    "salary: "+  employees[i].salary +"\n"
                    //  + " ---------------------------"
            );
        }
    }
    public static void showEmployee(Long id){
        Employee[] employees = EmployeeUtil.getEmployees();
        for (int i= 0; i<employees.length;i++){
            if (employees[i].id == id) {
                System.out.println(
                        "-------------employee"+i+"----------\n"+
                                "id: "+  employees[i].id +" | " +
                                "first name: "+  employees[i].firstName +" | " +
                                "last name: "+  employees[i].lastName +" | " +
                                "salary: "+  employees[i].salary +"\n"
                        //  + " ---------------------------"
                );
            }
        }
    }

    public static Long getBigSalaryUserId(){
        Employee[] employees = EmployeeUtil.getEmployees();
        Long bigId = 0L;
        int salary = 0;
        for (int i= 0; i<employees.length;i++){

            if (salary < employees[i].salary) {
                salary = employees[i].salary;
                bigId = employees[i].id;
            }
        }
        return bigId;
    }
    public static void showEmpSameName(){

        Employee[] employees = EmployeeUtil.getEmployees();
        int [][] theSame = new int[employees.length][employees.length];
        for (int i=0; i<employees.length;i++){
            for (int j=0; j<employees.length;j++){
                theSame[i][j] = 0;
                if(i>=j) {continue;}
                if(
                        (employees[i].firstName.equals(employees[j].firstName)&&
                        employees[i].lastName.equals(employees[j].lastName)))
                {
                    theSame[i][j] = 1;
                }
            }
        }
        for (int i =0; i<theSame.length ; i++){

            boolean iPrint =false;
            //if we have the same first name and last name setting up iPrint to true
            for(int j=0;j<theSame.length;j++){
                if(theSame[i][j]==1){
                    iPrint = true;
                }
            }
            // removing duplicated the same employees
            for (int k=0; k<i; k++){
                if((employees[i].firstName.equals(employees[k].firstName)&&
                                employees[i].lastName.equals(employees[k].lastName))){
                    iPrint=false;
                }

            }
            if(iPrint){
                //printing first the same name employee
                System.out.println( "------------------------------------\n");
                System.out.println( "-------------employee"+i+"----------\n"+
                        "id: "+  employees[i].id +" | " +
                        "first name: "+  employees[i].firstName +" | " +
                        "last name: "+  employees[i].lastName +" | " +
                        "salary: "+  employees[i].salary +"\n"
                );
                // printing others employees with the same name
                for(int j=0;j<theSame.length;j++){
                    if(theSame[i][j]==1){
                        System.out.println( "-------------employee"+j+"----------\n"+
                                        "id: "+  employees[j].id +" | " +
                                        "first name: "+  employees[j].firstName +" | " +
                                        "last name: "+  employees[j].lastName +" | " +
                                        "salary: "+  employees[j].salary +"\n"
                        );


                    }
                }

            }

        }
    }
}
