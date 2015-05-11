import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class exm {
    public static void main(String[] args) throws IOException{
        File file=new File("matveu\\src\\main\\java\\ua\\test.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String regExp="[a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regExp);
        String line;
        while ((line=bufferedReader.readLine())!=null){
            Matcher matcher=pattern.matcher(line);
            if(matcher.find()){
                    String[] pool=line.split("[\\s]+");
                    for(int i=0;i<3;i++) {
                        System.out.print(pool[i]+" ");
                    }
                //System.out.println(line);
            }
        }
    }



}
