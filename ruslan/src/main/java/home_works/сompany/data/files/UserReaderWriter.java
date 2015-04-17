package home_works.company.data.files;

import entity.CommonReaderWriter;

import home_works.company.entities.company.User;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class UserReaderWriter extends CommonReaderWriter {
    public static ArrayList<User> getUsers() throws IOException {
        File file = new File("ruslan\\src\\main\\java\\files.txt\\Users.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<User> users = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            User user = new User();
            user.setAge(Integer.valueOf(pool[0]));
            user.setId(Long.valueOf(pool[1]));
            user.setName(pool[2]);
            user.setSecondName(pool[3]);
            user.setPassword(pool[4]);
            user.setLogin(pool[5]);
            users.add(user);
        }
        return users;
    }
}
