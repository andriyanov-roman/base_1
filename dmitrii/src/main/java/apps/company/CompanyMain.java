package apps.company;

import java.io.IOException;

/**
 * Created by mit_OK! on 20.03.2015.
 */
public class CompanyMain {
    public static void main(String[] args) throws IOException {
        //new CompanyApp().run();
        new CompanyMenu().startProgram(args);
    }
}
