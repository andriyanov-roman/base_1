package entity.figures.comparators;

import entity.figures.AbsFigure;
import entity.figures.Circle;

import java.util.Comparator;

/**
 * Created by R-Tem on 28.04.2015.
 */
public class CompByName implements Comparator<AbsFigure>{
    @Override
    public int compare(AbsFigure o1, AbsFigure o2) {
        if(o1.getName().length() > o2.getName().length()) return 1;
        if(o1.getName().length() < o2.getName().length()) return -1;
        return 0;
    }
}
