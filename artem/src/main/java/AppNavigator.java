import modules.company.EmployeeUtil;
import view.BaseView;
import view.consoleApp.CommonView;
import view.consoleApp.CompanyView;

import java.util.Scanner;


public class AppNavigator {
    private Scanner scanner = new Scanner(System.in);

    public void startProgram(){
        BaseView baseView = new BaseView(scanner);
        do{
            switch (baseView.startProgram()) {
                case "console":
                    do {
                        CommonView commonView = new CommonView(scanner);
                        switch (commonView.selectProject()) {
                            case "Company Util":
                                CompanyView companyView = new CompanyView(scanner);
                                switch (companyView.menu()) {
                                    case "getEmployees": /*EmployeeUtil.getEmployees()*/
                                        break;
                                    case "getMaxSalary":
                                        break;
                                    case "sortUtil":
                                        break;
                                    case "addEmp":
                                        break;
                                    case "fireEmp":
                                        break;
                                    case "increaseSalary":
                                        break;
                                    case "addComp":
                                        break;
                                    case "return":
                                }
                                break;
                            case "Car Factory Util":
                                break;
                            case "Figure Util":
                                break;
                            case "University Util":
                                break;
                            case "return":
                                startProgram();
                                break; // во время рекурсии удаляются и создаются заново или...?
                        }
                    } while (scanner.hasNext());
                    break;
                case "swing":
                    System.out.println("There is no any modules yet. Good bay!");
                    System.exit(0);
            }
        } while (scanner.hasNext());
    }
}