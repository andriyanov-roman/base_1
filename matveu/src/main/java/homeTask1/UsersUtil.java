package homeTask1;


public class UsersUtil {

        public static UserMatveu[] getUsers() {
            UserMatveu u1= new UserMatveu();
            u1.age=30;
            u1.id=1L;
            u1.login="Vorobey";
            u1.password="pass";
            u1.name="Jack";
            u1.secondName="Vorobey";

            UserMatveu u2= new UserMatveu();
            u2.age=25;
            u2.id=2L;
            u2.login="IhorSuper";
            u2.password="pass123";
            u2.name="Ihor";
            u2.secondName="ihor";

            UserMatveu u3= new UserMatveu();
            u3.age=35;
            u3.id=3L;
            u3.login="Anton111";
            u3.password="pass123pass";
            u3.name="Anton";
            u3.secondName="Anton";

            UserMatveu u4= new UserMatveu();
            u4.age=15;
            u4.id=4L;
            u4.login="Djack222";
            u4.password="pass112";
            u4.name="Dima";
            u4.secondName="dima";

            UserMatveu[] users=new UserMatveu[4];
            users[0]=u1;
            users[1]=u2;
            users[2]=u3;
            users[3]=u4;
            return users;
        /* или можно записать
        return new User[](u1,u2};
         */

        }
    }

