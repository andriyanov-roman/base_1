package task7;

public class Methods {
    public static void main(String[] args) {
        Animal puppy = new Puppy("собака", "четыре лапы", "хвост", "пасть", "имя", "малыш");
        Animal dog = new Dog("собака", "лапы", "хвост", "пасть");
        Animal animal = new Animal("класс к которому относится животное");

        puppy.showName(" chris");
        puppy.feet(" правую");
        puppy.bite(" не больно");
        dog.feet(" левую");



    }
}
