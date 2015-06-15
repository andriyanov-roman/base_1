package parsers_xml_sax;

/**
 * Created by Programmer on 13.06.2015.
 */
public enum EmployeeEnum {
    EMPLOYEE("employee"),
    FIRST_NAME("firstname"),
    SECOND_NAME("secondname"),
    AGE("age"),
    SALARY("salary"),
    GENDER("gender"),;
    private String value;

    EmployeeEnum(String value) {
        this.value = value;
           }

    public String getValue() {
        return value;
    }

}
