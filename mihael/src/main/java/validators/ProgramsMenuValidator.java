package validators;

/**
 * Created by Администратор on 17.04.2015.
 */
public class ProgramsMenuValidator extends CommonValidator {
    public Boolean validateProgramsMenuChoice(String choice){
        Boolean isValidated = false;
        if (isInteger(choice)){
            if(isIntegerInPeriod(choice,0,5)){
                isValidated = true;
            }
        }

        return isValidated;
    }
}
