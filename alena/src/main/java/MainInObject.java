/**
 * Created by user on 13.01.2015.
 */
public class MainInObject {
    public static void main(String[] args) {
        Human1 h1 = new Human1();
        h1.name = "Anton";
        h1.age = 23;
        h1.eyes = "blue";
        h1.height = 1.86;
        h1.weight = 69;

        Human1 h2 = new Human1();
        h2.name = "Deli";
        h2.age = 22;
        h2.eyes = "brown";
        h2.height = 1.66;
        h2.weight = 55;

        Human1 h3 = new Human1();
        h3.name = "Alyona";
        h3.age = 22;
        h3.eyes = "blue";
        h3.height = 1.64;
        h3.weight = 60;

        Human1 h4 = new Human1();
        h4.name = "Ruslan";
        h4.age = 22;
        h4.eyes = "green";
        h4.height = 1.88;
        h4.weight = 70;

        Human1[] humans = {h1, h2, h3, h4};
        findTheMaxWeight(humans);
        sortByAge(humans);
        System.out.println();
        sortByWeight(humans);
        System.out.println();
        sortByHeight(humans);

    }

    private static void sortByAge(Human1[] humans) {
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length-1; j++) {
                if(humans[j].age < humans[j+1].age){
                    Human1 human = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + " " + humans[i].age);
        }
    }

    private static void sortByWeight (Human1[] humans) {
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length-1; j++) {
                if(humans[j].weight < humans[j+1].weight){
                    Human1 human = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + " " + humans[i].weight);
        }
    }

    private static void sortByHeight (Human1[] humans) {
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length-1; j++) {
                if(humans[j].height < humans[j+1].height){
                    Human1 human = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + " " + humans[i].height);
        }
    }

    private static void findTheMaxWeight(Human1[] humans) {
        Human1 temp = humans[0];
        for (int i = 0; i < humans.length; i++) {
            if(humans[i].weight > temp.weight){
                temp = humans[i];
            }

        }
        System.out.println(temp.weight + " " + temp.name);
    }
}
