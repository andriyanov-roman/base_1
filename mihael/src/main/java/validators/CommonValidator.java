package validators;

import java.util.regex.Pattern;

/**
 * Created by Администратор on 05.04.2015.
 */
public class CommonValidator {
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

    private static final Pattern INTEGER_PATTERN = Pattern.compile(
            "^[{0-9]*$");
    public static boolean isInteger(String s)
    {
        return INTEGER_PATTERN.matcher(s).matches();
    }

    public static boolean isIntegerInPeriod(String s,double from, double to)
    {
        Boolean result = false;
        if(isInteger(s)){
            Integer integerNum = Integer.parseInt(s);
            if(integerNum >= from && integerNum <= to){
                result = true;
            }
        }

        return result;
    }

}
