package apps.FXview.overview;

/**
 * Created by mit_OK! on 21.05.2015.
 */
public class NameFieldValidator implements FieldValidator{
    private String ErrDescription = "";
    @Override
    public Boolean validate(Object newValue) {
        if (newValue.toString().length()<5) {
            ErrDescription = "It is too short!";
            return false;
        } else {
            ErrDescription = "OK";
            return true;
        }
    }

    @Override
    public String getErrDescription() {
        return ErrDescription;
    }
}
