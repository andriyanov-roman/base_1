package lessons.my_sax;

/**
 * Created by Programmer on 13.06.2015.
 */
public enum MainEnumeration {
    MODULES("modules"),
    MODULE("module"),
    DEPENDENCIES("dependencies"),
    DEPENDENCY("dependency");
    /*groupId
    groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.11</version>
    <scope*/
    private String value;

    private MainEnumeration(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
