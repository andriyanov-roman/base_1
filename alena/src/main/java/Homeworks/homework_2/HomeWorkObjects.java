package Homeworks.homework_2;

/**
 * Created by lbondarenko on 13.01.2015.
 */
public class HomeWorkObjects {
    public static void main(String[] args) {
        Human ex1 = new Human();
        ex1.name = "Igor";
        ex1.eyes = "blue";
        ex1.age = 21;
        ex1.height = 1.87;
        ex1.weight = 78;

        Human ex2 = new Human();
        ex2.name = "Enrika";
        ex2.eyes = "brown";
        ex2.age = 27;
        ex2.height = 1.71;
        ex2.weight = 67;

        Human ex3 = new Human();
        ex3.name = "Helena";
        ex3.eyes = "blue";
        ex3.age = 32;
        ex3.height = 1.69;
        ex3.weight = 56;

        Human ex4 = new Human();
        ex4.name = "Eric";
        ex4.eyes = "green";
        ex4.age = 45;
        ex4.height = 1.77;
        ex4.weight = 85;

        Human ex5 = new Human();
        ex5.name = "Olha";
        ex5.eyes = "grey";
        ex5.age = 51;
        ex5.height = 1.55;
        ex5.weight = 62;

        Human ex6 = new Human();
        ex6.name = "Elza";
        ex6.eyes = "brown";
        ex6.age = 29;
        ex6.height = 1.63;
        ex6.weight = 54;

        Human ex7 = new Human();
        ex7.name = "Huan";
        ex7.eyes = "green";
        ex7.age = 65;
        ex7.height = 1.77;
        ex7.weight = 80;

        Human ex8 = new Human();
        ex8.name = "Emma";
        ex8.eyes = "brown";
        ex8.age = 27;
        ex8.height = 1.77;
        ex8.weight = 68;

        Human ex9 = new Human();
        ex9.name = "Remy";
        ex9.eyes = "brown";
        ex9.age = 41;
        ex9.height = 1.68;
        ex9.weight = 73;

        Human ex10 = new Human();
        ex10.name = "Genry";
        ex10.eyes = "grey";
        ex10.age = 21;
        ex10.height = 1.66;
        ex10.weight = 55;

        Human[] people = {ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9, ex10};
        showMaxWeightHuman(people);
        showMaxHeightHuman(people);
        System.out.println();
        findTheMaxWeight(people);
        sortByAge(people);
        System.out.println();
        sortByWeight(people);
        System.out.println();
        sortByHeight(people);



    }

    public static Human showMaxWeightHuman (Human[] people) {
        Human peopleMax = people[0];
        int indexMaxW = 0;
        for (int i = 0; i <people.length; i++) {
            if (people[i].weight > peopleMax.weight) {
                peopleMax = people[i];
                indexMaxW = i;
            }

        } System.out.println(peopleMax.name + " " + "has the biggest weight");
        return peopleMax;


    }

    public static Human showMaxHeightHuman (Human[] people){
        Human peopleMax = people[0];
        int indexMaxH = 0;
        for (int i = 0; i <people.length; i++) {
            if (people[i].height > peopleMax.height) {
                peopleMax = people[i];
                indexMaxH = i;
            }

        } System.out.println(peopleMax.name + " " + "has the biggest height");
        return peopleMax;
    }






    private static void sortByAge(Human[] people) {
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length-1; j++) {
                if(people[j].age < people[j+1].age){
                    Human human = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name + " " + people[i].age);
        }
    }

    private static void sortByWeight (Human[] people) {
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length-1; j++) {
                if(people[j].weight < people[j+1].weight){
                    Human human = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name + " " + people[i].weight);
        }
    }

    private static void sortByHeight (Human[] people) {
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length-1; j++) {
                if(people[j].height < people[j+1].height){
                    Human human = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name + " " + people[i].height);
        }
    }

    private static void findTheMaxWeight(Human[] people) {
        Human temp = people[0];
        for (int i = 0; i < people.length; i++) {
            if(people[i].weight > temp.weight){
                temp = people[i];
            }

        }
        System.out.println(temp.weight + " " + temp.name);
    }


}
