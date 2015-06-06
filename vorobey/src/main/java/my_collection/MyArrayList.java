package my_collection;

public class MyArrayList<T> {
    private int size = 0;
    private Object[] elements = {};

    public MyArrayList() {
        elements = new Object[10];
    }

    public void add(T element) throws Exception {
        if (size >= 10) {
            throw new Exception("MyArrayList is full");
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        int element = list.get(0);
        System.out.println("This element = " + element);

        int size = list.size();
        System.out.println("List size = " + size);
    }

}


