package lections.lection25;

/**
 * Created by Programmer on 13.06.2015.
 */
public enum EmployeeEnum {
    EMPLOYEES("employees"),
    EMPLOYEE("employee"),
    POSITION("position"),
    NAME("name"),
    SECONDNAME("secondName"),
    SALARY("salary"),
    SEX("sex"),
    AGE("age");

    private String value;

    private EmployeeEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}
