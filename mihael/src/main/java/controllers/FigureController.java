package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Администратор on 05.04.2015.
 */

public class FigureController extends Controller{

    //public static void main (String[] args){controlSide("6");}
    public static Boolean controlSide(String line){
        Boolean result = false;
        double from = 0.00001;
        double to = 100000;
        if(isDouble(line)){
            if (isDoubleInPeriod(line,0.00001,100000)){
                result = true;
            }else {System.out.println("Input must be int period from" + from +" to "+to);}
        } else {System.out.println("Input must be double type number");}
            System.out.println();

        return result;
    }
    public static Boolean controlHeight(String line){
        Boolean result = false;
        double from = 0.00001;
        double to = 100000;
        if(isDouble(line)){
            if (isDoubleInPeriod(line,from,to)){
                result = true;
            }else {System.out.println("Input must be int period from" + from +" to "+to);}
        } else {System.out.println("Input must be double type number");}
        System.out.println();

        return result;
    }
    public static Boolean controlRadius(String line){
        Boolean result = false;
        double from = 0.00001;
        double to = 100000;
        if(isDouble(line)){
            if (isDoubleInPeriod(line,0.00001,100000)){
                result = true;
            }else {System.out.println("Input must be int period from" + from +" to "+to);}
        } else {System.out.println("Input must be double type number");}
        System.out.println();

        return result;
    }
}
