package HomeTask1;

/**
 * Created by Master on 14.03.2015.
 */
public class Emploee {
    public double salary;
    public String name;
    public String secondName;

//    public Emploee (String name, String secondName, double salary){
//        this.name = name;
//        this.secondName=secondName;
//        this.salary =salary;
//
//    }


    public static Emploee[] getEmploees() {

        Emploee e1 = new Emploee();
        e1.salary = 300;
        e1.name = "Jack";
        e1.secondName = "Vorobey";

        Emploee e2 = new Emploee();
        e2.salary = 370;
        e2.name = "John";
        e2.secondName = "Black";

        Emploee e3 = new Emploee();
        e3.salary = 150;
        e3.name = "Johny";
        e3.secondName = "Walker";

        Emploee e4 = new Emploee();
        e4.salary = 556;
        e4.name = "White";
        e4.secondName = "Horse";

        Emploee e5 = new Emploee();
        e5.salary = 345;
        e5.name = "White";
        e5.secondName = "Bird";

        Emploee e6 = new Emploee();
        e6.salary = 235;
        e6.name = "Black";
        e6.secondName = "Horse";


        Emploee[] emploees = new Emploee[4];
        emploees[0] = e1;
        emploees[1] = e2;
        emploees[2] = e3;
        emploees[3] = e4;
        emploees[4] = e5;
        emploees[6] = e6;
        //return  emploees;
        return new Emploee[]{e1, e2, e3, e4, e5, e6};
    }


}
