import entities.company.Employee;
import org.junit.Test;

/**
 * Created by Programmer on 20.05.2015.
 */
public class EualsAndHashCode {
    @Test
    public void test(){
        // Множество объектов всегда сильнее (мощнее) множества hashCode-ов
        // Если входные объекты разные, то hashCode-ы ГАРАНТИРОВАННО разные
        // Если hashCode-ы равны, то объекты не гарантированно равны
        //
        // - рефлексивность ()
        // - симетричность (x == y  y == x)
        // - транзитивность (x.equals(y), y.equals(z), z.equals(x))
        // - непротиворечивость (если для двух переменных, которые не подверались изенению,
        // метод .equals возвращал true то при любой последующей компиляции программы он отже должен возвращать true)
        // - (не нулевая ссылка при сравнении с литералом null всегда возвращает false)
        Employee e = new Employee();
        e.setName("Ivan");
        System.out.println(e.hashCode());
        Employee e1 = new Employee();
        e.setName("Ivan");
        System.out.println(e1.hashCode());
        System.out.println(e.equals(e1));
        System.out.println(e == e1);
        String str = new String("test");
        String str1 = new String("test");
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
    }
}
