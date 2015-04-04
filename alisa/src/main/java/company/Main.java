package company;

import entity.EntityMethods;

import java.io.IOException;

/**
 * Created by user on 14.03.2015.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        new CompanyMethods().start();
        new EntityMethods().start();

    }

}
