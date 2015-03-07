import java.util.Scanner;

//Example on the lesson
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше число!");
        summa(sc.nextInt(), sc.nextInt());

    }

    static void summa(int a, int b) {
        int c = a + b;
        System.out.println(c);


    }
}
