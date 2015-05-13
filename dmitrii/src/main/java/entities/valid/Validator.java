package entities.valid;

/**
 * Created by mit_OK! on 07.04.2015.
 */
public class Validator {
    public String failedTest="";
    public Boolean canBeInt (String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public Boolean canBeDouble (String s) {
        try {
            Double i = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public Boolean canBeInPositiveRange (int i, int endOfRange) {
        return i > 0 && i <= endOfRange;
    }
    public Boolean canBeInPositiveRange (Double i, Double endOfRange) {
        return i > 0 && i <= endOfRange;
    }
    public Boolean isLettersOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i)==32 | s.charAt(i)> 64 & s.charAt(i)< 91 | s.charAt(i)> 96 & s.charAt(i)<123 )){
                failedTest = "Only letters can be inputted!";
                return false;
            }
        }
        return true;
    }
    public class StringTest {
        
    }
    public class NumberTest {


    }
    public class DateTest {

    }
}
