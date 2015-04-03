package tools;

/**
 * Created by mit_OK! on 31.03.2015.
 */
public class Tools {
    public static Boolean isExistInArr (String[] array, int index) {
        try {
            String s = array[index];
            return true;
        } catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }
}
