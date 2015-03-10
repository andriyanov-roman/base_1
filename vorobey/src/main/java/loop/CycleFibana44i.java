package loop;


public class CycleFibana44i {
    public static void main(String[] args) {
        int a = 2, b = 3, summa;

        for (int i = 0; i < 20; i++) {
            summa = a + b;
            a = b;
            b = summa;
            System.out.print("  " + summa);
        }
    }
}
