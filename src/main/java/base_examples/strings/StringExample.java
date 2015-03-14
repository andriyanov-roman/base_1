package base_examples.strings;


import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hugh Walpole abba (1884–1941) " +
                "was a New aaa Zealand-born English novelist";
        String[] words = str.split("\\s");
        for (int i = 0; i < words.length; i++) {
            char[] palindr;
            palindr = words[i].toCharArray();
            char[] p1 = new char[palindr.length / 2];
            char[] p2 = new char[palindr.length / 2];
            for (int j = 0; j < palindr.length / 2; j++) {
                p1[j] = palindr[j];
                p2[j] = palindr[palindr.length - 1 - j];
            }
            String pone = new String(p1); //преобразование честно подсмотрено в интернете
            String ptwo = new String(p2); //и это тоже
            if (pone.equalsIgnoreCase(ptwo) && words[i].length() > 2) {
                System.out.println(words[i] + " is palindrome");
            }
        }
        /*for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            char[] tempArray = new char[charArray.length];
            for (int j = charArray.length - 1; j >= 0 ; j--) {
                tempArray[charArray.length - 1 - j] = charArray[j];
            }
            String temp = new String(tempArray);
            String polindrom = "";
            for (int j = 0; j < array.length; j++) {
                if(temp.equals(array[i])) {
                    polindrom = array[i];
                }
            }
            System.out.println(polindrom);
        }*/
    }
}
