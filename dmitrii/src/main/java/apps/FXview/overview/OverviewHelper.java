package apps.FXview.overview;

import javafx.util.Pair;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.05.2015.
 */
public class OverviewHelper<T> implements IValueReplacer {
    public static final String CAR_ICON = "\uf1b9";
    public static final String MALE_ICON = "\uf183";
    public static final String FEMALE_ICON = "\uf182";
    public static final String UNIVERSITY_ICON = "\uf19d";
    public static final String SHAPE_ICON = "\uf1b2";
    public static final String UNKNOWN_ICON = "\uf059";

    private String windowTitle;
    private String title;
    private String subTitle;
    private String iconChar;
    private T entity;
    private String [] excludedFields;
    private Boolean useSuperFields;

    public OverviewHelper(String windowTitle, String title, String subTitle, String iconChar, T entity, Boolean useSuperFields, String ... disabledFields) {
        this.windowTitle = windowTitle;
        this.title = title;
        this.subTitle = subTitle;
        this.iconChar = iconChar;
        this.entity = entity;
        this.useSuperFields = useSuperFields;
        this.excludedFields = disabledFields;
    }

    public OverviewHelper(T entity) {
        this.entity = entity;
        this.windowTitle = "";
        this.title = "";
        this.subTitle = "";
        this.iconChar = UNKNOWN_ICON;
        this.useSuperFields = false;
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

    public String[] getExcludedFields() {
        return excludedFields;
    }
    public void setExcludedFields(String ... excludedFields) {
        this.excludedFields = excludedFields;
    }

    public Boolean getUseSuperFields() {
        return useSuperFields;
    }
    public void setUseSuperFields(Boolean useSuperFields) {
        this.useSuperFields = useSuperFields;
    }

    public ArrayList<Pair<String, String>> getPairs(){
        Class e = entity.getClass();
        ArrayList<Pair<String,String>> pairs = new ArrayList<>();
        if (useSuperFields) {
            for (Field f : e.getSuperclass().getDeclaredFields()){
                f.setAccessible(true);
                try {
                    if (!isExcludedField(f)) {
                        pairs.add(new Pair(f.getName(),f.get(entity)+""));
                    }
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }
        }
        for (Field f : e.getDeclaredFields()){
            f.setAccessible(true);
            try {
                if (!isExcludedField(f)) {
                    pairs.add(new Pair(f.getName(),f.get(entity)+""));
                }
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }
        return pairs;
    }
    private Boolean isExcludedField (Field f){
        for (String disField : excludedFields) {
            if (f.getName().equals(disField)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void replaceValue(String fieldName, String newValue) {

    }
}
