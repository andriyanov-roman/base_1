package home_work_2;

public class CompanyUtil {
    public static Company[] getCompanies() {
        Employee[] employee = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        c1.setEmployee(new Employee[]{employee[0], employee[1]});
        c1.setCompanyName("Oracle");
        Company c2 = new Company();
        c2.setEmployee(new Employee[]{employee[2], employee[3]});
        c2.setCompanyName("Microsoft");
        Company c3 = new Company();
        c3.setEmployee(new Employee[]{employee[4]});
        c3.setCompanyName("IBM");
        return new Company[]{c1, c2, c3};
    }

    public static void showCompany() {//показивет компании
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].getEmployee().length; j++) {
                System.out.println("Company: " + companies[i].getCompanyName() + " Employee :" + companies[i].getEmployee()[j].name + " " +
                        companies[i].getEmployee()[j].secondName);
                System.out.println();
            }
        }
    }

    public static void getMaxSalary() { // находит сотрудника, с найбольшей зарплатой
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].getEmployee()[0];
            for (int j = 0; j < companies[i].getEmployee().length; j++) {
                double salary = companies[i].getEmployee()[j].salary;
                if (salary > temp.salary) {
                    temp = companies[i].getEmployee()[j];
                }
            }
            System.out.println(companies[i].getCompanyName() + " " + temp.name + " "
                    + temp.secondName + " " + temp.salary);
        }
    }

    public static void sortBySalary() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].getEmployee().length - 1; j++) {
                if (companies[i].getEmployee()[j].salary < companies[i].getEmployee()[j + 1].salary) {
                    Employee employee = companies[i].getEmployee()[j];
                    companies[i].getEmployee()[j] = companies[i].getEmployee()[j + 1];
                    companies[i].getEmployee()[j + 1] = employee;
                }
            }
        }
        System.out.println(" Зарплаты сотрудников : ");
        for (int i = 0; i < getCompanies()[i].getEmployee().length; i++) {
            System.out.println(companies[i].getEmployee()[i].name + "  " + companies[i].getEmployee()[i].secondName + " - " + companies[i].getEmployee()[i].salary + " USD ");
        }


    }

    public static void sortByAge() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].getEmployee().length - 1; j++) {
                if (companies[i].getEmployee()[j].age < companies[i].getEmployee()[j + 1].age) {
                    Employee employee = companies[i].getEmployee()[j];
                    companies[i].getEmployee()[j] = companies[i].getEmployee()[j + 1];
                    companies[i].getEmployee()[j + 1] = employee;
                }
            }
        }
        System.out.println(" Сортировка по возрасту : ");
        for (int i = 0; i < getCompanies()[i].getEmployee().length; i++) {
            System.out.println(companies[i].getEmployee()[i].name + "  " + companies[i].getEmployee()[i].secondName + " - " + companies[i].getEmployee()[i].age + " year(s) ");
        }

    }

    public static void sortSecondNameLenght() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].getEmployee().length - 1; j++) {
                if (companies[i].getEmployee()[i].secondName.compareToIgnoreCase(companies[i].getEmployee()[j+1].secondName)>0){
                    Employee employee = companies[i].getEmployee()[j];
                    companies[i].getEmployee()[j] = companies[i].getEmployee()[j + 1];
                    companies[i].getEmployee()[j + 1] = employee;
                }
            }
        }
        System.out.println(" Сортировка по длине фамилиии : ");
        for (int i = 0; i < getCompanies()[i].getEmployee().length; i++) {


                System.out.println(getCompanies()[i].getEmployee()[i].secondName);
            }
        }

    }





