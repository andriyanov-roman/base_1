package entities.factory;

/**
 * Created by user on 28.03.2015.
 */
public class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}


