package lections.hashcode;

/**
 * Created by Администратор on 26.06.2015.
 */
public class HashCodeTest {
    private Integer integer ;
    private String string;
    private int anInt;

    public static void main(String... args){

        HashCodeTest hashCodeTest = new HashCodeTest();
        System.out.println(hashCodeTest.hashCode());
        hashCodeTest.integer = 1;
        hashCodeTest.string="2";
        hashCodeTest.anInt = 3;
        System.out.println(hashCodeTest.hashCode());
        hashCodeTest.anInt = 5;
        System.out.println(hashCodeTest.hashCode());
        hashCodeTest = new HashCodeTest();
        System.out.println(hashCodeTest.hashCode());
    }

}
