package lections.lection22;

/**
 * Created by Programmer on 01.06.2015.
 */
public class MyArrList<E> {

        private Object[] array = new Object[10];
        private Object[] array2 = new Object[20];

        public void copyArrays(Object[] array,Object[] array2){
            System.arraycopy(array,0,array2,0,array.length);
        }

        public Object[] getArray() {
            return array;
        }

        public void setArray(Object[] array) {
            this.array = array;
        }

        public boolean add(E e) {
            array[0] = e;
            return true;
        }

        public E get(int index) {
            return (E)array[index];
        }


}
