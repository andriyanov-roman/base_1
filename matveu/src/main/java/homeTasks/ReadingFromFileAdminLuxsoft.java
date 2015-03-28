package homeTasks;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFileAdminLuxsoft {
    public static ArrayList<Admin> getAdmins() throws IOException {
        File file = new File("matveu/src/AdminLuxsoft.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Admin> admins = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Admin admin = new Admin();
            admin.setName(pool[0]);
            admin.setSecondName(pool[1]);
            admin.setSex(pool[2]);
            admin.setAge(Integer.valueOf(pool[3]));
            admin.setSalary(Double.valueOf(pool[4]));
           // admin.setWorkingPlatform(pool[5]);
            admins.add(admin);
            System.out.print(admin+" "+"\n");
        }
        return admins;
    }

}
