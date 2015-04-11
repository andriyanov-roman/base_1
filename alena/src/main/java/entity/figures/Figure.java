package entity.figures;

/**
 * Created by user on 04.04.2015.
 */
public abstract class Figure {
    private String name;
    private double perimetr;
    private double square;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPerimetr();


    public abstract double getSquare();


}
