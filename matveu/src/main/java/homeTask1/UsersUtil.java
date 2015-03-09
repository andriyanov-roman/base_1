package homeTask1;

/**
 * Created by user on 09.03.2015.
 */
public class UsersUtil {

        public static UserMatveu[] getUsers() {
            UserMatveu u1= new UserMatveu();
            u1.age=30;
            u1.id=1L;
            u1.login="Vorobeu";
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

            UserMatveu[] users=new UserMatveu[2];
            users[0]=u1;
            users[1]=u2;
            return users;
        /* или можно записать
        return new User[](u1,u2};
         */

        }
    }

