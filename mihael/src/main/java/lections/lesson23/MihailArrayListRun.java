package lections.lesson23;

/**
 * Created by Programmer on 06.06.2015.
 */
public class MihailArrayListRun {
    public static void main(String[] args){

        MihailArrayList<String> mihailArrayList = new MihailArrayList<>();
        mihailArrayList.add("A");
        mihailArrayList.add("B");
        System.out.println(mihailArrayList.getSize());
        System.out.println(mihailArrayList.get(1));
    }
}
