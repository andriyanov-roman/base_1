package xml;


public enum EmployeeEnum {
    COMPANY("company"),
    EMPLOYEE("employee"),
    NAME("name"),
    SECONDNAME("secondName"),
    SEX("sex"),
    AGE("age"),
    SALARY("salary");


    private String value;

    public String getValue() {
        return value;
    }

    EmployeeEnum(String value) {
        this.value=value;
    }
}
