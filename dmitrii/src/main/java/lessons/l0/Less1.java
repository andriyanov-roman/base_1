package lessons.l0; /**
 * Created by Dmitriy on 07.03.2015.
 */
import java.util.Scanner;
public class Less1 {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        inp.useDelimiter("\n"); // if number will be like "125 555 999". It parses whole input
        int data=0;
        boolean wasExc = false;
        while (true) {
            System.out.print("Please, input a positive integer number - array size: ");

            try {
                data = Integer.parseInt(inp.next());
            } catch (Exception e) {
                System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
                wasExc = true;
            }
            if (data>0) {
                break;
            } else if (!wasExc) {
                System.out.println("Oh, the input integer number must be positive! Try again.");
            }
        }
        inp.close();
        byte min_val = -5;
        byte max_val = 5;
        byte[] arr = new byte[data];
        System.out.print("\t\tResult array:[ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (min_val + (byte)(Math.random() * ((max_val - min_val) + 1)));
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        int left_part=0, right_part=0,center_id=0;
        if (arr.length%2==0) {
            System.out.println ("Array has even quantity of elements.");
        } else {
            System.out.print("Array has odd quantity of elements. ");
            if (arr.length>1) {
                int center = arr.length/2+1;
                System.out.println("Center element: №"+center+" \""+arr[center]+"\" (We don\'t count it)");
                center_id=1;
            } else {
                System.out.println ("\n\t\tArray has ONE element: "+arr[0]);
                return;
            }
        }
        for (int i = 0; i <arr.length/2; i++) {
            left_part+=Math.abs(arr[i]);
        }
        for (int i = arr.length/2+center_id; i <arr.length ; i++) {
            right_part+=Math.abs(arr[i]);
        }
        System.out.println("Sum of left part: "+left_part);
        System.out.println("Sum of right part: : "+right_part);
        if (left_part>right_part){
            System.out.println("=============================================");
            System.out.println("Sum of LEFT PART more than sum of right part.");
        } else if (left_part==right_part){
            System.out.println("===============================================");
            System.out.println("Sum of left part is EQUAL to sum of right part.");
        } else {
            System.out.println("=============================================");
            System.out.println("Sum of RIGHT PART more than sum of left part.");
        }
    }
}
