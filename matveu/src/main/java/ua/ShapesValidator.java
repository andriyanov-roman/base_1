package ua;


import apps.Employees.Employee;

public class ShapesValidator {
    private int i;
    public boolean isSideValid(double side) {
        if(side > 10) {
            return true;
        }
        return false;
    }

    public void getPreFigure(int side, int perimeter) {
        PreFigure figure = new PreFigure();
        figure.side = side;
        figure.perimeter = perimeter;
    }
    private void doSomething() {

    }

    public class PreFigure extends Employee  {
        int side;
        int perimeter;
        {
            i = 0;
            doSomething();
        }
    }

    public class InnerTwo extends PreFigure {
        {
            doSomething();
            side = 0;
        }
    }

}
