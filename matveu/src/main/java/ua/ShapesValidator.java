package ua;


public class ShapesValidator {


    public boolean isSideValid(double side) {
        if(side > 10) {
            return true;
        }
        return false;
    }
}
