package loop;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Loop04 {
    public static void main (String[] args){
        int x = 2;
        int num = 0;
        while (x>=0) {
            num++;
            System.out.println(num + " "+x+" ");
            if (num >=20) break;
            x *=2;
        }
    }
}
