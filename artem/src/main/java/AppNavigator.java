import view.BaseView;
import view.consoleApp.CommonView;
import view.consoleApp.CompanyView;
import view.consoleApp.FiguresView;
import view.consoleApp.UniversityView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AppNavigator {
    private Scanner scanner = new Scanner(System.in);

    public void startProgram() throws IOException{
        BaseView baseView = new BaseView(scanner);
        do {
            switch (baseView.startProgram()) {
                case "console":
                    do {
                        boolean toReturn = true;
                        CommonView commonView = new CommonView(scanner);
                        switch (commonView.selectProject()) {
                            case "Company Util":
                                do {
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
                                        case "return": toReturn = false; break;
                                    }
                                } while (toReturn);
                                break;
                            case "Car Factory Util":
                                do {

                                } while (toReturn);
                                break;
                            case "Figure Util":
                                do {
                                    FiguresView view = new FiguresView(scanner);
                                    String s = view.menu();
                                    if(s.equals("return")) toReturn = false;
                                } while (toReturn);
                                break;
                            case "University Util":
                                do {
                                    UniversityView view = new UniversityView(scanner);
                                    String s = view.menu();
                                    if(s.equals("return")) toReturn = false;
                                } while (toReturn);
                                break;
                            case "return": startProgram(); break; // во время рекурсии переменные удаляются и создаются заново или...?
                        }
                    } while (true);
                case "swing":
                    System.out.println("There is no any modules yet. Good bay!");
                    System.exit(0);
            }
        } while (true);
    }
}