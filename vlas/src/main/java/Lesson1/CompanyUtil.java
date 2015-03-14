package Lesson1;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        Company c1 = new Company();
        Emploee[] emploees = Emploee.getEmploees();
        c1.emploees = new Emploee[]{emploees[0], emploees[1]};
        return new Company[]{c1};
        }
    }
