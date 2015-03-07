package Cycles;


public class CycleInstanceOf13 {
    public static void main(String[] args) {
        int i, count = 0;
        for (i = 0; i < 1000000; i++) {
            String s = String.valueOf(i);
            if (s.indexOf("13") != -1) {
                count++;
            }

        }
        System.out.println("Количество чисел ,включающих 13: " + count);
    }

}
