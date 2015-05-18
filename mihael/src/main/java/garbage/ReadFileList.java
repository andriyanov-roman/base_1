package garbage;

import io_tools.CommonWriterReader;

/**
 * Created by Администратор on 28.04.2015.
 */
public class ReadFileList extends CommonWriterReader {
     ReadFileList(){
        super.setPath("mihael/src/main/java/garbage/main_list_name.txt");
        super.setDelimiter(",");
    }

}
