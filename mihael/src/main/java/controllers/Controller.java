package controllers;

import java.util.regex.Pattern;

/**
 * Created by Администратор on 05.04.2015.
 */
public class Controller {
    private static final Pattern DOUBLE_PATTERN = Pattern.compile(
            "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +
                    "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +
                    "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))" +
                    "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
    public static boolean isDouble(String s)
    {
        return DOUBLE_PATTERN.matcher(s).matches();
    }

    public static boolean isDoubleInPeriod(String s,double from, double to)
    {
        Boolean result = false;
        if(isDouble(s)){
            Double doubleNum = Double.parseDouble(s);
            if(doubleNum > from && doubleNum < to){
                result = true;
            }
        }

        return result;
    }
}
