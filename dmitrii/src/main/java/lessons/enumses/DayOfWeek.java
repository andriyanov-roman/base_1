package lessons.enumses;

/**
 * Created by Programmer on 08.06.2015.
 */
public enum DayOfWeek {
    MONDAY("monday"),
    THURSDAY("thursday");
    private String value;

    DayOfWeek(String value) {
        this.value = value;
    }
}
