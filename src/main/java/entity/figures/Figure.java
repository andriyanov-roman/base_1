package entity.figures;

/**
 * Created by Администратор on 04.04.2015.
 */
public abstract class Figure implements IParameter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
