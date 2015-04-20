package programs.controllers;
import hometasks.hometask3.Main;
import programs.MainFigures;
import programs.UniversityRun;
import factory.MainCar;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Администратор on 20.04.2015.
 */
public class ProgramsController {
    public void programsMenuControl(String choice) throws IOException, ParseException {
        switch (choice){
            case "1":
                Main.start();
                break; // Company
            case "2":
                MainCar.startFactory();
                break; //Factory
            case "3":
                UniversityRun.startUniversity();
                break; //University
            case "4":
                MainFigures.startFigures();
                break; //Figure
            case "5": break;

            default:
        }
    };
}
