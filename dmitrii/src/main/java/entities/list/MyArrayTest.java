package entities.list;

/**
 * Created by mit_OK! on 07.06.2015.
 */
public class MyArrayTest {
    public static void main(String[] args) {
        DiamondList<String> list = new DiamondList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        /*System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);*/
        list.remove("C");
        System.out.println(list);
    }
}
