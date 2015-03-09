package base_examples.strings;


import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        int i = 0;
        int[] array = {};
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        for (int j = 0; j < hello.length; j++) {
            System.out.print(hello[j]);
        }
        System.out.println();
        String str = "hello";
        System.out.println(str);
        String strOne = new String("hello");
        System.out.println(strOne);
        String strTwo = "hello";
        System.out.println(str.equals(strOne));
        System.out.println(str.equals(strTwo));
        String strThree = "hello";
        System.out.println(str + strOne + strTwo + strThree);
        char a = str.charAt(0);
        System.out.println(a);
        boolean b = str.endsWith("lo");
        System.out.println(b);
        int ind = str.indexOf('h');
        System.out.println(ind);
        ind = str.indexOf("lm");
        System.out.println(ind);
        System.out.println("hello".equals("Hello"));
        System.out.println("hello".equalsIgnoreCase("Hello"));
        str = strOne.replace('h', 'Y');
        System.out.println(str);
        str = str.replaceAll("l", "bb");
        System.out.println(str);
        str = str.replaceFirst("bb", "l");
        System.out.println(str);
        str = str.substring(2);
        System.out.println(str);
        str = str.substring(2, 4);
        System.out.println(str);
        String test = "Lost Luggage is an action-video " +
                "game developed and released, in 1982 " +
                "for the Atari 2600 by the Texas-based studio Games by Apollo.";
        String[] words = test.split("\\s");
        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }
        System.out.println(words[11]);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] pool = scanner.next().split(" ");
            for (int j = 0; j < pool.length; j++) {
                System.out.println(pool[i]);
            }
        }
    }
}
