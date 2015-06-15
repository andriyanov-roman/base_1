package lections.lesson26;

import java.io.File;
import java.util.HashSet;


public class RecursionTest {
    public int[]  array={1,2,3,4,5,6,8};
    HashSet<File> directories = new HashSet<>();
    HashSet<File> files = new HashSet<>();
    public void readFileSystem(){

    }
    public void analyseFileSystem(){

        for (File f: files ){
            if(f.isDirectory()){
                //map.put(file.getName,newHashMap<>())
                analyseFileSystem();
            }
        }
    };

    public static void main(String[] args){
        System.out.println("hello");
        RecursionTest rt = new RecursionTest();
        rt.showArray(7);
        //rt.showHalfArray(7);

    }
    int i=0;
    public void showArray(int j){

        //System.out.println("array.length: "+ array.length);
        if(i<array.length/2){
            //System.out.println("inside" );
            //System.out.print("i: " + i +" j: " +j+" ");

            System.out.println("array[i]: "+ array[i]);
            i++;
            showArray(i);
        }

    }
    int halfArray=0;
    public void showHalfArray(int j){
        halfArray=array.length/2;
        System.out.println(array.length/2);
        if(i<(halfArray)){
            System.out.println("inside" );
            System.out.print("i: " + i +" j: " +j+" ");
            System.out.println("array["+i+"]: "+ array[i]);
            i++;
            showArray(i);
        }

    }
    public void thirdTest(){
        File[] files = new File("D:\\").listFiles();
        for(File f: files){
            if (f.isDirectory()){

            }
        }
    }

}
