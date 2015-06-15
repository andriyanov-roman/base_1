import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Programmer on 15.06.2015.
 */
public class RecursionTest {
    private int[] array = {1, 3, 2, 4, 5, 6, 7};
    HashSet<String> directories = new HashSet<>();
    File[] files = new File("D:\\").listFiles();
    Map<String, List<String>> map = new HashMap<>();

    @Test
    public void readFileSystem() {
        File currentDir = new File("."); // current directory
        displayDirectoryContents(currentDir);
        System.out.println(map.toString());
    }

    public void displayDirectoryContents(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directory:" + file.getCanonicalPath());
                    map.put(file.getName(), new ArrayList<>());
                    displayDirectoryContents(file);
                } else {

                    System.out.println("     file:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showHalf(int i) {
        if (i < array.length / 2) {
            System.out.print(array[i] + ",");
            i++;
            showHalf(i);
        }
        i++;
        System.out.print(array[i] + ",");
    }


    @Test
    public void secondTest() {
        f(1);
    }

    public static void f(int arg) {
        if (arg < 7) {
            f(2 * arg);
        }
        System.out.print(" " + arg);

    }

    @Test
    public void testRecursion() {
        int i = 0;
        try {
            showArray(i);
        } catch (StackOverflowError e) {
            showArray(i);
        }
    }


    public void showArray(int i) {
        if (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        showArray(i);
    }
}
