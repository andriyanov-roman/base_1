package homeTask1;


public class UsersUtil {

        public static UserMatveu[] getUsers() {
            UserMatveu u1= new UserMatveu();
            u1.age=30;
            u1.id=784737L;
            u1.login="Vorobey";
            u1.password="pass";
            u1.name="Jack";
            u1.secondName="Vorobey";

            UserMatveu u2= new UserMatveu();
            u2.age=25;
            u2.id=162727L;
            u2.login="Matveu";
            u2.password="pass123";
            u2.name="Igor";
            u2.secondName="Matviichuk";

            UserMatveu u3= new UserMatveu();
            u3.age=35;
            u3.id=583920L;
            u3.login="Anton111";
            u3.password="pass123pass";
            u3.name="Anton";
            u3.secondName="Gerasimov";

            UserMatveu u4= new UserMatveu();
            u4.age=15;
            u4.id=245466L;
            u4.login="Dima222";
            u4.password="pass112";
            u4.name="Dima";
            u4.secondName="Shevchenko";

            UserMatveu u5= new UserMatveu();
            u5.age=21;
            u5.id=836535L;
            u5.login="Leno4ka";
            u5.password="pass666";
            u5.name="Elena";
            u5.secondName="Elena";

            UserMatveu u6= new UserMatveu();
            u6.age=32;
            u6.id=984833L;
            u6.login="Radik";
            u6.password="pass98";
            u6.name="Radik";
            u6.secondName="Radion";

            UserMatveu[] users=new UserMatveu[6];
            users[0]=u1;
            users[1]=u2;
            users[2]=u3;
            users[3]=u4;
            users[4]=u5;
            users[5]=u6;
            return users;
        /* или можно записать
        return new User[](u1,u2};
         */

        }
    }

