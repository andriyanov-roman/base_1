package programs.views;

/**
 * Created by Администратор on 20.04.2015.
 */
public class EmployeeView extends CommonView{


    public static void employeeShowMenu(){
        System.out.println( "-------------------------\n" +
                        "1. Show all Employees" + "\n" +
                        "2. Show company 1 sorted by salary" +  "\n" +
                        "3. Show company 2 sorted by Age" + "\n" +
                        "4. Show company 3 sorted by Last Name Length" + "\n" +
                        "5. Add an Employee" + "\n" +
                        "6. Rise sallary for man 15% and fire woman "
        );

    }
}
