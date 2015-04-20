package lections.lesson10;

/**
 * Created by Администратор on 18.04.2015.
 */
public class MainInterfacesTest {
    public static void main(String args[]){
        PlaneFlyImpl plane = new PlaneFlyImpl();
        plane.iCanFly();

        IFly fly = new BirdFlyImpl();
        fly = new PlaneFlyImpl();

    }
}
