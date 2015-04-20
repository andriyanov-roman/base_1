package entities.factory;

/**
 * Created by Администратор on 03.04.2015.
 */
public class Color {
    private String colorName;

    public Color() {}
    public Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorName='" + colorName + '\'' +
                '}';
    }

}
