import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Programmer on 09.05.2015.
 */
public class exm {
    public static void main(String[] args) throws IOException{
        File file=new File("matveu\\src\\main\\java\\ua\\test.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String regExp="(Java)|(PHP)|(C#)";


        Pattern pattern=Pattern.compile(regExp);


        String line;
        while ((line=bufferedReader.readLine())!=null){
            Matcher matcher=pattern.matcher(line);
            if(matcher.find()){
                System.out.println(line);
            }
        }



    }
}
