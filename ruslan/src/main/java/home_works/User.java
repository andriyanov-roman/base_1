package home_works;

/**
 * Created by user on 23.03.2015.
 */
public class User {
    public Long id;
    public String name;
    public String secondName;
    public String login;
    public String password;
    public int age;

    public User(int age, long id, String name, String secondName, String password, String login) {

        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return id + name + secondName + login + password + age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
