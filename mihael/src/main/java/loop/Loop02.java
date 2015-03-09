package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop02 {
    public static void main (String[] args){
        int x = 1;
        int num = 0;
        while (x<10000) {
            num++;
            System.out.println(x+" ");
            if (num >=55) break;
            x +=2;
        }

    }
}
