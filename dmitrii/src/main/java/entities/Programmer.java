package entities;

/**
 * Created by user on 23.03.2015.
 */
public class Programmer extends Employee{
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "+super.toString() + " | Dev.lang.: " + getLanguage();
    }
}
