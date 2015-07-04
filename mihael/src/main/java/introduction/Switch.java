package introduction;

/**
 * Created by Администратор on 28.06.2015.
 */
public class Switch {
        public static void main(String[] args) {
            final int i = 1;
            switch (1) {
                case i:
                    System.out.println("1");
                    break;
                default:
                    System.out.println("default");
            }
        }

}
