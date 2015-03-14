/**
 * Created by user on 16.12.2014.
 */
public class LessonNineString {
    public static void main(String[] args) {
        String little = "Test";
        String littleTwo = new String ("Test");
        System.out.println(little.equals(littleTwo));
        System.out.println(little.length() == littleTwo.length());

        String little3 = new String (new char[]{'t', 'r', 'h'});
        String little4 = "Test3";
        String little5 = little.concat(littleTwo).concat(little3).concat(little4);
        System.out.println(little.substring(1));
        System.out.println(little4.substring(1, 3));

        // \\s - разбить по пробелам
        // \\W - разбить по всем символам



        String test = "Leigh Leigh was a 14-year-old girl from Fern Bay on the east coast of Australia,";
        System.out.println(test.length());
        String[] words = test.split(" ");

        int max = words[0].length();
        int min = words[0].length();
        String minWord = words[min];
        String maxWord = words[max];

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].length());


        }



        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max){
                max = words[i].length();
                maxWord = words[i];

            }

            if (words[i].length() < min ) {
                min = words[i].length();
                minWord = words[i];
            }

        }

        System.out.println(maxWord);
        System.out.println(minWord);
        String cloud = "";
        cloud = minWord;
        minWord = maxWord;
        maxWord = cloud;
        System.out.println(minWord + " " + maxWord);


        // еще один вариант найти макс и мин через стринг, а не инт
//        String maxWord = words[0];
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].length() > maxWord.length()) {
//                maxWord = words[i];
//            }
//
//        }
//
//        System.out.println(max);
//











    }



}
