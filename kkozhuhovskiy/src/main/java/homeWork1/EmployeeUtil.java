package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class EmployeeUtil implements Comparable {
    public  static EmployeeUser[] getEmployeeUser(){

        EmployeeUser  eU1 = new EmployeeUser("Arina", "Bashkirova",21800, "Female",25 );
        EmployeeUser  eU2 = new EmployeeUser("Dima", "Kozuh", 31800, "male",35 );
        EmployeeUser  eU3 = new EmployeeUser("Andrey", "Manzhul", 33800, "male", 26 );
        EmployeeUser  eU4 = new EmployeeUser("Kostya", "Sever", 21800, "male",33 );
        EmployeeUser  eU5 = new EmployeeUser("Jonh", "Never",19800, "male",25 );
        EmployeeUser  eU6 = new EmployeeUser("Kira", "Nitly",191800, "Female",39 );
        EmployeeUser  eU7 = new EmployeeUser("Tanya", "Shkirova",241800, "Female",35 );
        EmployeeUser  eU8 = new EmployeeUser("Den", "Kirkorov",21800, "male",33 );
        EmployeeUser  eU9 = new EmployeeUser("Vlad", "Lermontov",21800, "male",47 );

        return new EmployeeUser[]{eU1, eU2, eU3, eU4, eU5, eU6, eU7, eU8, eU9};

    }

    public static void findEmployeeUserSalary() {

        EmployeeUser[] workers = EmployeeUtil.getEmployeeUser();
        for(int i = 0; i < workers.length; i++) {
            EmployeeUser temp = getEmployeeUser()[0];
            if(workers[i].getSalary() > temp.getSalary()) ;
            System.out.println(workers[i].getName() + workers[i].getSecondName() + workers[i].getSalary()  + " more salary than " + temp);
        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
