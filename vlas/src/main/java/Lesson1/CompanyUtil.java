package Lesson1;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        Company c1 = new Company();
        Emploee[] emploees = Emploee.getEmploees();
        c1.emploees = new Emploee[]{emploees[0], emploees[1]};
        c1.companyName = "March";

        Company c2 = new Company();
        c2.emploees = new Emploee[]{emploees[2], emploees[3]};
        c2.companyName = "April";

        Company c3 = new Company();
        c3.emploees = new Emploee[]{emploees[4], emploees[5]};
        c3.companyName = "May";

        Company[] companies = new Company[3];
        companies[0] = c1;
        companies[1] = c2;
        companies[2] = c3;

        return new Company[]{c1, c2, c3};

    }

    public static void getMaxSalary() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Emploee temp = companies[i].emploees[0];
            for (int j = 0; j < companies.length; j++) {
                double salary = companies[i].emploees[j].salary;
                if (temp.salary > salary) {
                    temp = companies[i].emploees[j];
                }
            }
        }
    }
}
