package task7;

public class Dog extends Animal {
    private String feet;
    private String tail;
    private String jaws;
    public Dog(){

    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getJaws() {
        return jaws;
    }

    public void setJaws(String jaws) {
        this.jaws = jaws;
    }

    public Dog(String animalClass, String feet, String tail, String jaws) {
        super(animalClass);
        this.feet = feet;
        this.tail = tail;
        this.jaws = jaws;
    }
}
