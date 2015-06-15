/**
 * Created by User on 13.06.2015.
 */
public enum EmployeeEnum {
    NAME ("name"),
    SURNAME ("surname"),
    SALARY ("salary"),
    AGE ("age"),
    SEX("sex");
    private String value;

    private EmployeeEnum (String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
