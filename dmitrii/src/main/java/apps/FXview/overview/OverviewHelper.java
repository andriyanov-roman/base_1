package apps.FXview.overview;

import javafx.util.Pair;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by mit_OK! on 06.05.2015.
 */
public class OverviewHelper<T> {
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
    private ArrayList<Pair<String,String>> pairs;
    private ArrayList<Pair<String,String>> replacedPairs;

    public OverviewHelper(String windowTitle, String title, String subTitle, String iconChar,
                          T entity, Boolean useSuperFields, ArrayList<Pair<String,String>> replacedPairs,
                          String ... excludedFields) {
        this.windowTitle = windowTitle;
        this.title = title;
        this.subTitle = subTitle;
        this.iconChar = iconChar;
        this.entity = entity;
        this.useSuperFields = useSuperFields;
        this.excludedFields = excludedFields;
        this.replacedPairs = replacedPairs;
        this.pairs = new ArrayList<>();
        makePairsFromFields(entity.getClass().getSuperclass().getDeclaredFields());
        makePairsFromFields(entity.getClass().getDeclaredFields());
        replacePair();
    }

    public OverviewHelper(T entity, Boolean useSuperFields,String ... excludedFields) {
        this.entity = entity;
        this.windowTitle = "";
        this.title = "";
        this.subTitle = "";
        this.iconChar = UNKNOWN_ICON;
        this.useSuperFields = false;
        this.excludedFields = excludedFields;
        this.pairs = new ArrayList<>();
        if (useSuperFields){
            makePairsFromFields(entity.getClass().getSuperclass().getDeclaredFields());
        }
        makePairsFromFields(entity.getClass().getDeclaredFields());
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

    public Boolean getUseSuperFields() {
        return useSuperFields;
    }
    public void setUseSuperFields(Boolean useSuperFields) {
        this.useSuperFields = useSuperFields;
    }

    public ArrayList<Pair<String, String>> getPairs() {
        return pairs;
    }

    public ArrayList<Pair<String, String>> getReplacedPairs() {
        return replacedPairs;
    }
    public void setReplacedPairs(ArrayList<Pair<String, String>> replacedPairs) {
        this.replacedPairs = replacedPairs;
        replacePair();
    }
    public void addReplacedPair(String keyName, String keyValue) {
        if (replacedPairs == null) {
            replacedPairs = new ArrayList<>();
        }
        replacedPairs.add(new Pair<>(keyName, keyValue));
        replacePair();
    }

    private void replacePair(){
            for (Pair<String, String> r : replacedPairs){
                for (int i = 0; i < pairs.size(); i++) {
                    if (pairs.get(i).getKey().equals(r.getKey())){
                        pairs.set(i,r);
                    }
                }
            }
    }
    private Boolean isExcludedField (Field f){
        for (String disField : excludedFields) {
            if (f.getName().equals(disField)) {
                return true;
            }
        }
        return false;
    }
    public void makePairsFromFields(Field[] fields) {
        for (Field f : fields){
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

}
