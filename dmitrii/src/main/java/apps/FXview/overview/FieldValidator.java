package apps.FXview.overview;

/**
 * Created by mit_OK! on 21.05.2015.
 */
public interface FieldValidator<T> {
    Boolean validate(T newValue);

    String getErrDescription();
}
