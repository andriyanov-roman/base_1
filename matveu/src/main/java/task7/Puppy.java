package task7;

public class Puppy extends Dog {
    private String name;
    private String size;

    public Puppy(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Puppy(String animalClass, String feet, String tail, String jaws, String name, String size) {
        super(animalClass, feet, tail, jaws);
        this.name = name;
        this.size = size;
    }

}
