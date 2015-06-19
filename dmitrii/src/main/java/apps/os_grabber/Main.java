package apps.os_grabber;

import java.io.File;

/**
 * Created by mit_OK! on 18.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        FileFinder fileFinder = new FileFinder();
        fileFinder.findFiles((new File("C:\\TidyHTML")));
        fileFinder.writeXMLfile("osFiles");
       /* HashSet<String> set = new HashSet<>();
        for (String s : set){
            System.out.println(s);
        }*/
        /*File file = new File("C:\\Users\\Dr\\Desktop\\VA-BANK");
        ArrayList<File> fileArrayList = new ArrayList<>(Arrays.asList(file.listFiles()));
        fileArrayList.sort(Comparator.comparing(File::isDirectory));
        for (File f : fileArrayList){
            System.out.println(f.getName());
        }*/
    }
}
