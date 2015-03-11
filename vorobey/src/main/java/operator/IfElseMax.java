package operator;


public class IfElseMax {
    public static void main(String[] args) {
        int a = 5, b = 9, c = 2, d = 19, max1 = 0, max2 = 0, max3 = 0;
        if (a > b)
            max1 = a;
        else
            max1 = b;
        if (max1 > c)
            max2 = max1;
        else
            max2 = c;
        if (max2 > d)

            System.out.println("Максимальный d: " + d);
        else
            System.out.println("Максимальный max2: " + max2);
    }
}
