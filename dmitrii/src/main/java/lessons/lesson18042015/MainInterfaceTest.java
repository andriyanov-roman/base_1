package lessons.lesson18042015;

/**
 * Created by user on 18.04.2015.
 */
public class MainInterfaceTest {
    public static void main(String[] args) {
        PlaneFlyImpl plane = new PlaneFlyImpl();
        plane.iCanFly();

        IFly fly = new BirdFlyImpl();
        fly = new PlaneFlyImpl();

    }
}
