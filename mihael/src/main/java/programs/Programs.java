package programs;

import programs.controllers.ProgramsController;
import programs.views.ProgramsView;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Администратор on 05.04.2015.
 */
public class Programs {
    public static void main(String args[]) throws IOException, ParseException {
        Programs program = new Programs();
        program.startPrograms();
        //MainFigures.startFigures();
        //UniversityRun.startUniversity();

    }
    public void startPrograms() throws IOException, ParseException {
        ProgramsView programsView = new ProgramsView();
        ProgramsController programsController = new ProgramsController();
        programsView.programsMenu();
    }
}
