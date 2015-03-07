package IfElse;


public class IfElseBinary {
    public static void main(String[] args) {
        Perevod(19); }//Перевод числа в двоичную систему
    static void Perevod(int a) {

        String y = "";
        for (; a > 0;) {
            if (a % 2 != 0) {
                y += "1";
            } else {
                y += "0";
            }
            a = a / 2;
        }
        StringBuffer x = new StringBuffer(y);
        x = (new StringBuffer(y)).reverse();
        System.out.println(x);
    }
}
