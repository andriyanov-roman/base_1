package recursionTest;

import org.junit.Test;

import java.io.File;

/**
 * Created by Programmer on 15.06.2015.
 */
public class RecTest {
    private int[] array = {1,2,3,4,5,6,7,8};

    @Test
    public void testRun (){
        showLeftHalf(0, array.length / 2);
        System.out.println("=============");
        showLeftHalf(array.length / 2, array.length);
        System.out.println("===REVERSE===");
        reverseShow(array.length / 2 - 1, 0);
        System.out.println("=============");
        reverseShow(array.length - 1, array.length / 2);
        System.out.println("======FAKTORIAL =======");
        System.out.println(fakt(3));
        System.out.println("======Show files =======");
        showFiles("D:\\");
    }
    public  void showLeftHalf (int i, int end) {
        if (i < end){
            System.out.println(array[i]);
            i++;
            showLeftHalf(i,end);
        }
    }
    public void reverseShow (int i, int begin){
        if (i >= begin){
            System.out.println(array[i]);
            i--;
            reverseShow(i, begin);
        }
    }
    public int fakt (int arg){
        if (arg <= 1) return 1;
        else return arg * fakt( arg - 1 );
    }
    public void showFiles(String startFolder){
        File f = new File(startFolder);
        if (f.isDirectory()){
            System.out.println();
        }

    }
}
