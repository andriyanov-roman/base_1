package home_task5;


public class Container extends Shape {
    private double contSquare;

    public double getContSquare() {
        return contSquare;
    }

    public void setContSquare(double contSquare) {
        this.contSquare = contSquare;
    }

    public Container() {
    }

    ;

    public Container(String name, double square, double perimetr, double contSquare) {
        super(name, square, perimetr);
        this.contSquare = contSquare;
    }


    @Override
    public String toString() {
        return "Контейнер" + "c" + "площадью" + contSquare;
    }
}
