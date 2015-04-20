package validators;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by Администратор on 20.04.2015.
 */
public class CommonValidtorTest {

    private static final Pattern INTEGER_PATTERN = Pattern.compile(
            "^[{0-9]*$");

    @Test
    public  void isInteger()
    {
        String str = "12";
        boolean out = INTEGER_PATTERN.matcher(str).matches();
        System.out.println(out);
    }

    @Test
    public  void isIntegerInPeriod()
    {
        String s="5";
        Integer from = 1;
        Integer to = 4;
        Boolean result = false;
        if(true //isInteger(s)
                ){
            System.out.println(s);
            Integer integerNum = Integer.parseInt(s);
            System.out.println(integerNum);
            if(integerNum >= from && integerNum <= to){
                result = true;
            }
        }

        System.out.println(result);

    }
}
