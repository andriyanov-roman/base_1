/**
 * Created by Администратор on 06.03.2015.
 */
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число! ");
        String s=br.readLine();
        int x=Integer.parseInt(s);
        int[] mas=new int[x];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*21-10);
            System.out.print(mas[i]+" ");
        }

    }
}
