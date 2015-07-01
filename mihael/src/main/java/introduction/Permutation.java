package introduction;

import java.util.ArrayList;

/**
 * Created by Администратор on 30.06.2015.
 */
public class Permutation {
    Integer [] inputArray ={6, 8, 5, 7, 18, 21, 20, 16, 19, 17};

    public static  void main(String [] args){
        Permutation permutation = new Permutation();
        PermutationAndPosition permutationAndPosition = permutation.getBiggestPermution(permutation.inputArray);
        System.out.println(permutationAndPosition.toString());
    }
    public PermutationAndPosition getBiggestPermution(Integer[] inputArray){
        PermutationAndPosition permutationAndPosition = new PermutationAndPosition(1,2);

        return  permutationAndPosition;
    }
    class PermutationAndPosition {

        public Integer position;
        public Integer length;
        public ArrayList<Integer> arrayList;
        public PermutationAndPosition(Integer position, Integer length){
            this.position = position;
            this.length = length;
        }
        @Override
        public String toString() {
            return "PermutationAndPosition{" +
                    "position=" + position +
                    //"length=" + arrayList.size() +
                    ", arrayList=" + arrayList +
                    '}';
        }
    }
}
