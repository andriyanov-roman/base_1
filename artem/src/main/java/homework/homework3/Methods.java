package homework.homework3;

import java.util.*;


public class Methods {
    public static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println(
                "1. Get all employees from all companies" +
                "\n2. Get employee with max Salary" +
                "\n3. Sort employees" +
                "\n4. Add employees" +
                "\n5. Fire employees" +
                "\n6. Increase the salary for 15%" +
                "\n7. Add company" +
                "\n0. Exit program"
        );
    }
    public static void start(){
        welcome();
        while (scanner.hasNext()){
            switch (scanner.next()){
                //Каждой задаче присваивается Номер, чтобы пользователь не вводил название задачи вручную
                case "1": OrgUtil.showEmployees(); break;
                case "2": OrgUtil.getMaxSalary(); break;
                case "3": OrgUtil.sortBy(); break;
                case "7": addEmployee(); break;
                case "8": fireFemale(); break;
                case "0": System.exit(0);
                    default: System.out.println ("No such case");
            }
        }
    }
    public static void addEmployee(){
        ArrayList<Org> orgs = new ArrayList<>();
        System.out.println(" Check the organization:\n   1 - for C#\n   2 - for C++\n   3 - for Java\n   4 - for new organization");
        switch (scanner.next()){
            case "1":
                scanner.useDelimiter("\n");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Surname: ");
                String surname = scanner.next();
                Double salary=0.0;
                boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
                while (true) {
                    System.out.print("Salary: ");
                    try {
                        salary = Double.parseDouble(scanner.next());
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
                System.out.print("Sex: ");
                String gender = scanner.next();
                int age=0;
                wasExc = false;
                while (true) {
                    System.out.print("Age: ");
                    try {
                        age = Integer.parseInt(scanner.next());
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
                Employee newStuff = new Employee(name,surname,salary,gender,age);
                orgs.get(0).getEmployees().add(newStuff);
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
        }
    }
    public static void fireFemale(){
        ArrayList<Org> orgs = OrgUtil.getOrgs();
        for (int i = 0; i < orgs.size(); i++) {
            for (int j = orgs.get(i).getEmployees().size()-1; j >= 0; j--) {
                if(orgs.get(i).getEmployees().get(j).getSex().equals("female")){orgs.get(i).getEmployees().remove(j);}
            }
            for (int j = 0; j < orgs.get(i).getEmployees().size(); j++) {
                System.out.println(orgs.get(i).getOrgName()+" "+orgs.get(i).getEmployees().get(j));
            }
        }
    }
}