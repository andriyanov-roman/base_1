package homework;

import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    public static Scanner scanner = new Scanner(System.in);
    public static void start() {
        System.out.println("1.Получить информацию о всех пользователях");
        System.out.println("2.Проверка совпадения логина с именем или Фамилией нажмите");
        System.out.println("3.Проверка совпадения и имен и фамилий у нескольких пользователей");
        System.out.println("4.Сортировать пользователей по id в порядке возростания");
        System.out.println("5.Получить полную информацию о сотрудниках компаний");
        System.out.println("6.Найти сотрудника с самой большой ЗП в каждой компании");
        System.out.println("7.Сортировка сотрудников компании 'C#' по ЗП");
        System.out.println("8.Сортировка сотрудников компании 'C++' по возрасту");
        System.out.println("9.Сортировка сотрудников компании 'Java' по длинне фамилии");
        System.out.println("10.Сортировка сотруников каждой компании по ЗП в порядке возростания");
        System.out.println("11.Добавить сотрудника");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkLogin();
                    break;
                case "3":
                    checkSame();
                    break;
                case "4":
                    sortedById();
                    break;
                case "5":
                    showEmployees();
                    break;
                case "6":
                    getMaxSalary();
                    break;
                case "7":
                    getOrg1SortByZP();
                    break;
                case "8":
                    sortByAge();
                    break;
                case "9":
                    sortByLongSN();
                    break;
                case "10":
                    getSortByZP();
                    break;
                case "11":
                    addEmployee();
                    break;
                case "0":
                    System.exit(0);//системный метод завершения программы
                default:
                    System.out.println("No such case");
            }
        }
    }
    //1
    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (User user : users) System.out.print(user.name + " " + user.secondName + "\n");
        System.out.println();
    }
    //2
    public static void checkLogin(){
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name)/*||users[i].login.equals(users[i].secondName)*/){
                int n=i+1;
                System.out.println("Users "+n+" has the same login and name");
            }
            if (users[i].login.equals(users[i].secondName)){
                int n=i+1;
                System.out.println("Users "+n+" has the same login and second name");
            }
        }
    }
    //3
    public static void checkSame(){
        User[] users = UsersUtil.getUsers();
        //int n;
        int [] tmp = new int[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = i+1; j < users.length; j++){
                if (users[i].name.equals(users[j].name)&&users[i].secondName.equals(users[j].secondName)){
                    tmp[i] = j;
                    System.out.println("Users "+i+" and "+tmp[i]+" have the same names and second names");
                }
            }
        }
    }
    //4
    public static void sortedById(){
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - i - 1; j++) {
                if (users[j].id > users[j + 1].id) {
                    User tmp = users[j + 1];
                    users[j + 1] = users[j];
                    users[j] = tmp;
                }
            }
            System.out.println(users[i].id + " " + users[i].name);
        }
    }
    //5
    public static void showEmployees(){
        Org[] orgs = OrgUtil.getOrganizations(); // Создаем массив организаций созданных штампующим классом OrgUtil
        // по шаблону Org
        for (int i = 0; i < orgs.length; i++) { // Начинаем переберать организации
            for (int j = 0; j < orgs[i].getEmployees().length; j++) { // Теперь идем по каждому сотруднику
                System.out.println(orgs[i].getOrgName() +" "+ orgs[i].getEmployees()[j].getName() +" "+orgs[i].getEmployees()[j].getSecondName()+" "+ orgs[i].getEmployees()[j].getSalary()+" "+orgs[i].getEmployees()[j].getSex()+" "+orgs[i].getEmployees()[j].getAge());
            }
        }
    }
    //6
    public static void getMaxSalary() { // метод выводит максимальную ЗП для каждой организации отдельно
        Org[] orgs = OrgUtil.getOrganizations(); // Создаем массив организаций созданных штампующим классом OrgUtil
                                                // по шаблону Org
        for (int i = 0; i < orgs.length; i++) { // Начинаем переберать организации
            Employee temp = orgs[i].getEmployees()[0]; // Создаем временный объект по шаблону Employee
            for (int j = 0; j < orgs[i].getEmployees().length; j++) { // Теперь идем по каждому сотруднику
                double salary = orgs[i].getEmployees()[j].getSalary(); // Создаем временную переменную запоминающюю ЗП
                if (temp.getSalary() < salary) { // Если ЗП сотрудника больше значения из временного объекта класса Employee то
                    temp = orgs[i].getEmployees()[j]; // Заменяем объект сотрудником с более высокой ЗП

                }
            }
            System.out.println(orgs[i].getOrgName() + " "+temp.getName()+ " " + temp.getSalary()); // Выводим в консоль
        }
    }
    //7
    public static void getOrg1SortByZP(){
        Org[] orgs = OrgUtil.getOrganizations(); // Создаем массив организаций созданных штампующим классом OrgUtil
                                                  // по шаблону Org
        for (int j = 0; j < orgs[0].getEmployees().length; j++) { // Начинаем переберать сотрудников организации пузырьковым методом
            for (int k = 0; k < orgs[0].getEmployees().length - j - 1; k++) {
                if (orgs[0].getEmployees()[k].getSalary() > orgs[0].getEmployees()[k + 1].getSalary()) {
                    Employee tmp = orgs[0].getEmployees()[k + 1];
                    orgs[0].getEmployees()[k + 1] = orgs[0].getEmployees()[k];
                    orgs[0].getEmployees()[k] = tmp;
                }
            }
            System.out.println(orgs[0].getOrgName() +" "+ orgs[0].getEmployees()[j].getName() +" "+ orgs[0].getEmployees()[j].getSalary());
        }
    }
    //8
    public static void sortByAge(){
        Org[] orgs = OrgUtil.getOrganizations(); // Создаем массив организаций созданных штампующим классом OrgUtil
                                                  // по шаблону Org
        for (int j = 0; j < orgs[1].getEmployees().length; j++) { // Начинаем переберать сотрудников организации пузырьковым методом
            for (int k = 0; k < orgs[1].getEmployees().length - j - 1; k++) {
                if (orgs[1].getEmployees()[k].getAge() > orgs[1].getEmployees()[k + 1].getAge()) {
                    Employee tmp = orgs[1].getEmployees()[k + 1];
                    orgs[1].getEmployees()[k + 1] = orgs[1].getEmployees()[k];
                    orgs[1].getEmployees()[k] = tmp;
                }
            }
            System.out.println(orgs[1].getOrgName() +" "+ orgs[1].getEmployees()[j].getName() +" "+ orgs[1].getEmployees()[j].getSalary()+" "+orgs[1].getEmployees()[j].getAge());
        }
    }
    //9
    public static void sortByLongSN(){
        Org[] orgs = OrgUtil.getOrganizations(); // Создаем массив организаций созданных штампующим классом OrgUtil
                                                  // по шаблону Org
        for (int j = 0; j < orgs[2].getEmployees().length; j++) { // Начинаем переберать сотрудников организации пузырьковым методом
            for (int k = 0; k < orgs[2].getEmployees().length - j - 1; k++) {
                if (orgs[2].getEmployees()[k].getSecondName().length() > orgs[2].getEmployees()[k + 1].getSecondName().length()) {
                    Employee tmp = orgs[2].getEmployees()[k + 1];
                    orgs[2].getEmployees()[k + 1] = orgs[2].getEmployees()[k];
                    orgs[2].getEmployees()[k] = tmp;
                }
            }
            System.out.println(orgs[2].getOrgName() +" "+ orgs[2].getEmployees()[j].getSecondName() +" "+ orgs[2].getEmployees()[j].getSalary());
        }
    }
    //10
    public static void getSortByZP(){ // Метод выводит отсортированых по зп сотрудников
        Org[] orgs = OrgUtil.getOrganizations(); // Создаем массив организаций созданных штампующим классом OrgUtil
                                                // по шаблону Org
        for (int i =0; i < orgs.length; i++){ // Начинаем переберать организации
            for (int j = 0; j < orgs[i].getEmployees().length; j++) { // Начинаем переберать сотрудников организации пузырьковым методом
                for (int k = 0; k < orgs[i].getEmployees().length - j - 1; k++) {
                    if (orgs[i].getEmployees()[k].getSalary() > orgs[i].getEmployees()[k + 1].getSalary()) {
                        Employee tmp = orgs[i].getEmployees()[k + 1];
                        orgs[i].getEmployees()[k + 1] = orgs[i].getEmployees()[k];
                        orgs[i].getEmployees()[k] = tmp;
                    }
                }
                System.out.println(orgs[i].getOrgName() +" "+ orgs[i].getEmployees()[j].getName() +" "+ orgs[i].getEmployees()[j].getSalary());
            }
        }
    }
    //11
    public static void addEmployee(){
        ArrayList employees = EmployeeUtil.getEmployees();
        Org[] orgs = OrgUtil.getOrganizations();
        for(int i = 0; i<employees.size(); i++){
            System.out.println(employees.get(i));
        }

//        System.out.println(employees.toString());

//        System.out.println("Выберите компанию,в которую желаете добавить сотрудника:");
//        System.out.println("0: C#");
//        System.out.println("1: C++");
//        System.out.println("2: Java");
//        int k = scanner.nextInt();
//        for (int i = 9; i < employees.length; i++) {
//            Employee e10 = new Employee();
//            employees.add(e10);
//            System.out.print("Введите имя сотрудника: ");
//            employees[i].setName(scanner.next());
//            System.out.print("Введите фамилию сотрудника: ");
//            employees[i].setSecondName(scanner.next());
//            System.out.print("Введите пол сотрудника: ");
//            employees[i].setSex(scanner.next());
//            System.out.print("Введите возраст сотрудника: ");
//            employees[i].setAge(scanner.nextInt());
//            System.out.print("Введите зарплату сотрудника: ");
//            employees[i].setSalary(scanner.nextInt());
//            // создаём новый массив по количеству сотрудников конкретной организации и ПЛЮС ОДНО место под нового сотрудника
//            Employee[] tempArr = new Employee[orgs[k].getEmployees().length + 1];
//            for (int j = 0; j < orgs[k].getEmployees().length; j++) {
//                tempArr[j] = orgs[k].getEmployees()[j];// загоняем старых во временный массив
//            }
//            tempArr[tempArr.length - 1] = e10;// в этот же массив добавляем нового сотрудника
//            orgs[k].setEmployees(tempArr); //обновляем список сотрудников компании
//            System.out.println("Выберите действие:");
//            System.out.println("1: Добавить следующего сотрудника");
//            System.out.println("2: Вывести информацию по данному сотруднику");
//        }
    }

    /*public void addEmployeeForCompany() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        while (scanner.hasNext()){
            switch (scanner.next()) {
                case "1":
                    addEmployeeForCompany();
                    break;
                case "2":
                    System.out.println(orgs[k].getEmployees()[orgs[k].getEmployees().length - 1].getName());
                    System.out.println(" -- Добавить еще сотрудника?\n1: да\n2: выйти");
                    if (scanner.nextInt() == 1) { addEmployee(); }
                    else { System.exit(0); }
                    break;
            }
        }
    }*/
}
