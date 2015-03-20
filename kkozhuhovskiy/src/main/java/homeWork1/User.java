package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class User {
    private Long id;
    private String name;
    private String secondName;
    private String login;
    private String password;
    private int age;

    public  User(String name, Long id, String secondName, String login, String password, int age){
        this.name = name;
        this.age = age;
        this.login = login;
        this.id = id;
        this.secondName = secondName;
        this.password = password;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
