package homework.homework3;

import java.util.*;

/**
 * Created by R-Tem on 16.03.2015.
 */
public class Methods {
    public static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println("\n1.Получить полную информацию о сотрудниках компаний" +
                "\n2.Найти сотрудника с самой большой ЗП в каждой компании" +
                "\n3.Сортировка сотрудников компании по фамилии" +
                "\n4.Сортировка сотрудников компании по возрасту" +
                "\n5.Сортировка сотрудников компании по длинне имени" +
                "\n6.Сортировка сотруников каждой компании по ЗП в порядке возростания" +
                "\n7.Добавить сотрудника"+
                "\n0.Выйти из программы");
    }
    public static void start(){
        welcome();
        while (scanner.hasNext()){
            switch (scanner.next()){
                //Каждой задаче присваивается Номер, чтобы пользователь не вводил название задачи вручную
                case "1": showEmployee(); break;
                case "2": getMaxSalary(); break;
                case "3": sortBySecodnName(); break;
                /*case "4": sortByAge(); break;
                case "5": sortByNameLenght(); break;
                case "6": sortByZp(); break;
                case "7": addEmployee(); break;*/
                case "0": System.exit(0);
                    default: System.out.println ("No such case");
            }
            welcome();
        }
    }
    public static void showEmployee(){
        ArrayList<Org> orgs = OrgUtil.getOrganizations();
        for(int i = 0; i < orgs.size(); i++){
            for(int j = 0; j < orgs.get(i).getEmployees().size(); j++){
                System.out.println(orgs.get(i).getOrgName()+" "+orgs.get(i).getEmployees().get(j));
            }
        }
    }
    public static void getMaxSalary(){
        ArrayList<Org> orgs = OrgUtil.getOrganizations();
        for (int i = 0; i < orgs.size(); i++) {
            Employee temp = orgs.get(i).getEmployees().get(0);
            for (int j = 0; j < orgs.get(i).getEmployees().size(); j++) {
                double salary = orgs.get(i).getEmployees().get(j).getSalary();
                if (temp.getSalary() < salary) {
                    temp = orgs.get(i).getEmployees().get(j);
                }
            }
            System.out.println(orgs.get(i).getOrgName() + " " + temp.getSalary());
        }
    }
    public static void sortBySecodnName(){
        ArrayList<Org> orgs = OrgUtil.getOrganizations();
        for (int i = 0; i < orgs.size(); i++) {
            Collections.sort(orgs.get(i).getEmployees(), new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getSecondName().toString().compareTo(o2.getSecondName().toString());
                }
            });
            for (int j = 0; j < orgs.get(i).getEmployees().size(); j++) {
                System.out.println(orgs.get(i).getOrgName()+" "+orgs.get(i).getEmployees().get(j));
            }
        }
    }
}