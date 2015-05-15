package apps.FXview.overview;

import javafx.util.Pair;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.05.2015.....
 */
public class OverviewHelper<T> {
    public static final String CAR_ICON = "\uf1b9";
    public static final String MALE_ICON = "\uf183";
    public static final String FEMALE_ICON = "\uf182";
    public static final String UNIVERSITY_ICON = "\uf19d";
    public static final String SHAPE_ICON = "\uf1b2";
    public static final String UNKNOWN_ICON = "\uf059";
    public static final String ADMIN_ICON = "\uf085";
    public static final String USER_ICON = "\uf007";

    private String windowTitle;
    private String title;
    private String subTitle;
    private String iconChar;
    private T entity;
    private Boolean useSuperFields;
    private ArrayList<FieldsContainer> fields;
    private Boolean forbidEditing;

    public OverviewHelper(String windowTitle, String title, String subTitle, String iconChar,
                          T entity, Boolean useSuperFields, ArrayList<Pair<String,String>> replacedPairs,Boolean forbidEditing,
                          String ... excludedFields) {
        this.windowTitle = windowTitle;
        this.title = title;
        this.subTitle = subTitle;
        this.iconChar = iconChar;
        this.entity = entity;
        this.useSuperFields = useSuperFields;
        this.forbidEditing = forbidEditing;
        this.fields = new ArrayList<>();
        makePairsFromFields(entity.getClass().getSuperclass().getDeclaredFields());
        makePairsFromFields(entity.getClass().getDeclaredFields());
        excludeFields(excludedFields);
    }

    public OverviewHelper(T entity, Boolean useSuperFields,String ... excludedFields) {
        this.entity = entity;
        this.windowTitle = "";
        this.title = "";
        this.subTitle = "";
        this.iconChar = UNKNOWN_ICON;
        this.useSuperFields = false;

        this.forbidEditing = true;
        this.fields = new ArrayList<>();
        if (useSuperFields){
            makePairsFromFields(entity.getClass().getSuperclass().getDeclaredFields());
        }
        makePairsFromFields(entity.getClass().getDeclaredFields());
        excludeFields(excludedFields);
    }

    private void excludeFields(String[] excludedFields) {
        for (String excludedF : excludedFields){
            for (FieldsContainer fc : fields){
                if (excludedF.equals(fc.getRealName())){
                    fc.setExclude(true);
                }
            }
        }
    }

    public String getWindowTitle() {
        return windowTitle;
    }
    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getIconChar() {
        return iconChar;
    }
    public void setIconChar(String iconChar) {
        this.iconChar = iconChar;
    }

    public T getEntity() {
        return entity;
    }
    public void setEntity(T entity) {
        this.entity = entity;
    }

    public Boolean getUseSuperFields() {
        return useSuperFields;
    }
    public void setUseSuperFields(Boolean useSuperFields) {
        this.useSuperFields = useSuperFields;
    }

    public Boolean getForbidEditing() {
        return forbidEditing;
    }
    public void setForbidEditing(Boolean forbidEditing) {
        this.forbidEditing = forbidEditing;
    }

    public ArrayList<FieldsContainer> getFields() {
        ArrayList<FieldsContainer> fieldsWithoutExcluded = new ArrayList<>();
        for (FieldsContainer fc : fields) {
            if (!fc.isExcluded()){
                fieldsWithoutExcluded.add(fc);
            }
        }
        return fieldsWithoutExcluded ;
    }

    public void replaceFieldDisplayName(String realName, String displayName) {
        for (FieldsContainer fc : fields){
            if (fc.getRealName().equals(realName)){
                fc.setDisplayName(displayName);
            }
        }
    }
    public void replaceFieldDisplayValue(String realName, String displayValue){
        for (FieldsContainer fc : fields){
            if (fc.getRealName().equals(realName)){
                fc.setDisplayValue(displayValue);
            }
        }
    }
    public void makePairsFromFields(Field[] fields) {
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);
            try {
                this.fields.add(new FieldsContainer(i+"_"+f.getName(),f.getName(),f.get(entity)));
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }
    }

}
