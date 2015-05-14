package apps.FXview.overview;

/**
 * Created by mit_OK! on 14.05.2015.
 */
public class FieldsContainer {
    private String id;
    private String realName;
    private Object realValue;
    private String displayName;
    private String displayValue;
    private Boolean excluded;

    public FieldsContainer(String id, String realName, Object realValue, String displayName, String displayValue, Boolean excluded) {
        this.id = id;
        this.realName = realName;
        this.realValue = realValue;
        this.displayName = displayName;
        this.displayValue = displayValue;
        this.excluded = excluded;
    }

    public FieldsContainer(String id, String realName, Object realValue) {
        this.id = id;
        this.realName = realName;
        this.realValue = realValue;
        this.displayName = realName;
        this.displayValue = this.realValue+"";
        this.excluded = false;
    }

    public FieldsContainer() {
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }
    public String getDisplayValue() {
        return displayValue;
    }
    public String getRealName() {
        return realName;
    }
    public Object getRealValue() {
        return realValue;
    }
    public Boolean isExcluded() {
        return excluded;
    }
    public void setExclude(Boolean excluded) {
        this.excluded = excluded;
    }
}
