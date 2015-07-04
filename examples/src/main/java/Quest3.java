/**
 * Created by Programmer on 29.06.2015.
 */
public class Quest3 {
    public static void main(String[] args) {
        Outer obj = new Outer().new Inner1();

        obj.print();
        String str = new Object() {
            public String hello() {
                return "Hello!";
            }
        }.hello();
        System.out.println(str);
    }
}

class Outer {

    public void print() {
    }

    class Inner1 extends Outer {
        public void print() {
            Outer.this.print();
            System.out.println("In inner.");
        }
    }

}
