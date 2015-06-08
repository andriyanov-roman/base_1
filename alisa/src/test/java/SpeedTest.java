/**
 * Created by admin on 08.06.15.
 */
public class SpeedTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            NanoTimer.start();
        }
        NanoTimer.stop();
    }
}
