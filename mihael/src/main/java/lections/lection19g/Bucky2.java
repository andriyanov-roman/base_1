package lections.lection19g;

/**
 * Created by Администратор on 19.05.2015.
 */
public class Bucky2 {
    public static void main(String []args){
        System.out.println(max(42,43,1));
        System.out.println(max("apples","tots","chicken"));
    }
    public static <T extends Comparable<T>> T max(T a , T b ,T c){
        T m = a;
        if(b.compareTo(a)>0)
            m=b;
        if(c.compareTo(m)>0)
            m=c;
        return m;
    }
}
