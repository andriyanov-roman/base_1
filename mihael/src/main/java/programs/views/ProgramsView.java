package programs.views;

import programs.controllers.ProgramsController;
import validators.CommonValidator;
import validators.ProgramsMenuValidator;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by Администратор on 17.04.2015.
 */
public class ProgramsView extends CommonView{

    boolean showMenu = true;
    String choice;

    ProgramsMenuValidator validator= new ProgramsMenuValidator();
    public void showProgramsMenu(){
        System.out.println("Please choice subprogram");
        System.out.println("1. Company");
        System.out.println("2. Factory");
        System.out.println("3. University");
        System.out.println("4. Figure");
        System.out.println("5. ");
        System.out.println("0. Exit");
    }

    public void programsMenu() throws IOException, ParseException {
        showProgramsMenu();
        while (showMenu) {

            choice = scanner.next();
            if(validator.validateProgramsMenuChoice(choice)){
                System.out.println("Your choise is: "+ choice);
                if (choice.equals("0")){showMenu = false; System.out.println("Program exiting");} else{
                    ProgramsController programsController = new ProgramsController();
                    programsController.programsMenuControl(choice);
                }
                if(showMenu) {showProgramsMenu();}
            } else  {
                System.out.println("Please input the number from 0 to 5");
            }




        }
    }



}