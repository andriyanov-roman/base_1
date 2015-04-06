/**
 * Created by Администратор on 06.04.2015.
 */
public class Abonent {
    private String name;
    private Phone phoneNumber;

    public Abonent(String name, int code, int operatorCode,int mainNumber) {
        this.name = name;
        Phone phone = new Phone();
        phone.code = code;
    }

    private class Phone {
        int code;
        int operatorCode;
        int mainNumber;
    }

    public static class StaticAbonent {
        public static void main(String[] args) {
            System.out.println("Hello");
        }
    }

}
