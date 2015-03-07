import java.util.Scanner;

/**
 * Created by Администратор on 06.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        summa(sc.nextInt(), sc.nextInt());

    }

    static void summa(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}
