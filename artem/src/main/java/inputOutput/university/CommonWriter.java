package inputOutput.university;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by R-Tem on 01.04.2015.
 */
public class CommonWriter {
    private String path;

    public CommonWriter(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public void writeToFile () throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.flush(); // Метод flush вызывает принудительный сброс буфера вывода.
        //flush не очищает буфер, а убеждается, что все данные, которые в него должны быть записаны, уже записались.
        writer.close();
    }
}
