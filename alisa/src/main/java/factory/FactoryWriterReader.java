package factory;

/**
 * Created by admin on 08.04.15.
 */
public class FactoryWriterReader extends CommonWriterReader {
    @Override
    public void writerToFile(String txt) {
        super.writerToFile(txt+"*");
    }
}
