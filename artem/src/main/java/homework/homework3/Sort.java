package homework.homework3;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by R-Tem on 20.03.2015.
 */
public class Sort {
    public static void sortByName(){
        Collections.sort(OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int j = 0; j < OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees().size(); j++) {
            System.out.println(OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getOrgName()+" "+OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees().get(j));
        }
    }
    public static void sortBySurnameLength(){
        Collections.sort(OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSecondName().length() - o2.getSecondName().length();
            }
        });
        for (int j = 0; j < OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees().size(); j++) {
            System.out.println(OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getOrgName()+" "+OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees().get(j));
        }
    }
    public static void sortByAge(){
        Collections.sort(OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (int j = 0; j < OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees().size(); j++) {
            System.out.println(OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getOrgName()+" "+OrgUtil.orgsGLobaL.get(OrgUtil.sortselection).getEmployees().get(j));
        }
    }
    public static void sortByZP(){
        /*Collections.sort(orgsGLobaL.get(i).getEmployees(), new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getSalary() - o2.getSalary();
                }
            });*/
            /*for (int j = 0; j < orgs.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < orgs.get(i).getEmployees().size() - j - 1; k++) {
                    if(orgs.get(i).getEmployees().get(k).getSalary() > orgs.get(i).getEmployees().get(k + 1)){
                        Employee tmp =
                    }
                }
            }*/
    }
}
