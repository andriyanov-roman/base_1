package task7;

public class Animal {
    private String animalClass;

    public Animal(){

    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public Animal(String animalClass) {
        this.animalClass = animalClass;
    }
    void showName(String name){
        System.out.println("имя" + name);
    }
    public void feet(String feet){
        System.out.println("подать лапу"+feet);
    }
    protected void bite(String jaws){
        System.out.println("кусать"+jaws);
    }
}
