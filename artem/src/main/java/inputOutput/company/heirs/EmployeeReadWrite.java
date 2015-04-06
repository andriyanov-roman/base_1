package inputOutput.company.heirs;

import inputOutput.company.CommonReadWrite;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by R-Tem on 31.03.2015.
 */
public class EmployeeReadWrite extends CommonReadWrite {
    protected boolean reWrite;

    public EmployeeReadWrite(String path, String regExp, boolean reWrite) {
        super(path, regExp);
        this.reWrite = reWrite;
    }

    public boolean getReWrite() {
        return reWrite;
    } // почему Идея изредка называет геттеры "isReWrite" вместо "getReWrite"
    public void setReWrite(boolean reWrite) {
        this.reWrite = reWrite;
    }

    @Override
    public ArrayList<String[]> readFromFile() throws IOException {
        return super.readFromFile();
    }
    @Override
    public void writeToFile() throws IOException {
        super.writeToFile();
    }
}
