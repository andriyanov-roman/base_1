package programs;

import entities.figures.Container;
import entities.figures.ContainerUtils;

import java.io.IOException;

/**
 * Created by Администратор on 05.04.2015.
 */
public class MainFigures {

    public static void startFigures() throws IOException {
        Container container = new Container(100);
        ContainerUtils.mainMenu();
    }

}
