package home_tasks_1.Employee;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите интересующею Вас информацию:");
        System.out.println("1.  Информация о работниках.");
        System.out.println("2.  Информация о заработной плате работников. Максимальная зарплата.");
        System.out.println("3.  Информация о работниках, c одинаковыми, именами и фамилиями. Показать их.");
        System.out.println("4.  Информация о работниках. Вывести зарплаты.");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showEmployee();
                    break;
                case "2":
                    maxSalary();
                    break;
                case "3":
                    sameEmployee();
                    break;
                case "4":
                    sortSalary();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Нету интересующей Вас информации.");
            }
        }
    }

    public static void showEmployee() { // покажет все работников
        Employee[] employee = EmployeesUtil.getEmployee();
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].name + " " + employee[i].secondName + ",  - Зарплата - " +
                    employee[i].salary);
            System.out.println();

        }
    }

    public static void maxSalary() { // находит сотрудника, с найбольшей зарплатой
        Employee[] employee = EmployeesUtil.getEmployee();
        //double maxSalary = 0;
        Employee temp = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].salary > temp.salary) {
                temp = employee[i];


                System.out.println("Сотрудник с самой высокой заработной платой :  " + "  Имя, фамилия - " +
                        employee[i].name + " " + employee[i].secondName + " , зарплата " + employee[i].salary + " USD ");
            }
        }
    }


    public static void sameEmployee() { // находит однофамильцев

        Employee[] employee = EmployeesUtil.getEmployee();
        for (int i = 0; i < employee.length; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].name == employee[j].name && employee[i].secondName == employee[j].secondName) {

                    System.out.println(" Имя  и фамилия однофамильцев - " + employee[i].name + " " + employee[i].secondName + " и " +
                            employee[j].name + " " + employee[j].secondName);

                }
            }
        }
    }
    public static void sortSalary() { // сортировка пузырьком, зарплати
        Employee[] employees = EmployeesUtil.getEmployee();
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].salary < employees[j + 1].salary) {
                    Employee employee = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = employee;
                }
            }
        }
        System.out.println(" Зарплаты сотрудников : ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].name + employees[i].secondName + " - " + employees[i].salary + " USD ");
        }
    }
}
