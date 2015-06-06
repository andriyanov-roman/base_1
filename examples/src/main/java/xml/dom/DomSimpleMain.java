package xml.dom;

/**
 * Created by user on 6/6/2015.
 */
public class DomSimpleMain {
    public static void main(String[] args) {
        StudentsDOMBuilder domBuilder = new StudentsDOMBuilder();
        domBuilder.buildSetStudents("examples\\src\\main\\resources\\student.xml");
        System. out.println(domBuilder.getStudents());
    }
}
