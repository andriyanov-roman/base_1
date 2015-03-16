import base_examples.objects.Human;

public class Main {
    public static void main(String[] args) {
        Human[] humans = getHumans();
        showMaxHuman(humans);
    }

    public static Human[] getHumans() {
        Human h1 = new Human();
        h1.age = 16;
        h1.name = "Dasha";
        h1.height = 1.71;
        h1.secondName = "Streltsova";
        h1.gender = "female";

        Human h2 = new Human();
        h2.age = 24;
        h2.name = "Vova";
        h2.height = 1.81;
        h2.secondName = "Morkovka";
        h2.gender = "male";

        return new Human[]{h1, h2};
    }

    public static void showMaxHuman(Human[] humans) {
        Human maxAge = humans[0];
        for (int i = 0; i < humans.length; i++) {
            if(maxAge.age < humans[i].age) {
                maxAge = humans[i];
            }
        }
        System.out.println(maxAge.name);
    }

}
