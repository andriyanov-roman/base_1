import cons.company.Employee;
import cons.views.EmployeeComparator;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by User on 01.06.2015.
 */
public class CollectionsTest {

    @Test
    public void testArrayList() throws Exception {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        ListIterator<String> stringListIterator = stringList.listIterator();
        Iterator<String> stringIterator = stringList.iterator();
        //stringList.remove("A");
        while (stringIterator.hasNext()) {
            if ("A".equals(stringIterator.next())) {
                stringIterator.remove();
            }
        }
        stringList = new LinkedList<>();
        ListIterator<String> listIterator = stringList.listIterator();

        System.out.println(stringList);
    }

    @Test
    public void testSet() throws Exception {
        Set<Employee> employees = new HashSet<>();
        Employee e = new Employee();
        System.out.println(e.hashCode());
        Employee e1 = new Employee();
        System.out.println(e1.hashCode());
        Employee e2 = new Employee();
        System.out.println(e2.hashCode());
        Employee e3 = new Employee();
        System.out.println(e3.hashCode());
        Employee e4 = new Employee();
        System.out.println(e4.hashCode());
        Employee e5 = new Employee();
        System.out.println(e5.hashCode());
        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        System.out.println(employees.size());
    }

    @Test
    public void testMap() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", 2);
        map.put("A", 0);
        map.put("B", 4);
        Set<String> strings = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(values.getClass());
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (map.containsKey(words.get(i))) {

            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map.containsKey("A")) {
                int counter = map.get("A");
                counter++;
                map.put("A", counter);
            }
        }
        System.out.println(map);
    }

    @Test
    public void testStream() throws Exception {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        List<String> strings = stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .collect(Collectors.toList());
    }

    @Test
    public void testThreeMap() {
        Employee e = new Employee();
        e.setName("Ivan");
        Employee e1 = new Employee();
        e1.setName("Petro");
        Map<Employee, String> map = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 1;
            }
        });

        System.out.println(map.size());

    }
}
