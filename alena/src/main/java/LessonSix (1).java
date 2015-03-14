/**
 * Created by user on 09.12.2014.
 */
public class LessonSix {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i > 10);


        for (int b = 0; b < 10; b++) {
            System.out.println(b + "outer loop");
            for (int y = 0; y < 10; y++) {
                System.out.println(y + "outer loop");
            }
        }
    }
}
