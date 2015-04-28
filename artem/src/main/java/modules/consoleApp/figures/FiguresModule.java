package modules.consoleApp.figures;

import entity.figures.*;
import entity.figures.comparators.CompByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by R-Tem on 06.04.2015.
 */
public class FiguresModule {
    public static AbsFigure biggestFig(ArrayList<AbsFigure> figures, int choice){
//        Collections.sort(figures, new CompByName());
        switch (choice){
            case 1:
                Collections.sort(figures, Comparator.comparing(AbsFigure::calculatePerimeter));
                int num = figures.size();
                return figures.get(num-1);
            case 2:
                Collections.sort(figures, Comparator.comparingDouble(AbsFigure::calculateSquare));
                num = figures.size();
                return figures.get(num-1);
                // в чем разница между comparing и comparingDouble
        }
        return null;
    }
}
