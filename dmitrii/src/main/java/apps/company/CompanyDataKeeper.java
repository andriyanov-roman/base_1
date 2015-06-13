package apps.company;

import entities.company.Company;
import entities.company.Employee;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Created by mit_OK! on 11.06.2015.
 */
public class CompanyDataKeeper {
    public static Company loadCompanyFromXML (){
        return null;
    }
    public static void saveCompanyToXML(Company com){
        DocumentBuilderFactory documentBuilderFactory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder =
                    documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = documentBuilder.newDocument();
        Element rootElement = doc.createElement("company");
        doc.appendChild(rootElement);
        for (int i = 0; i < com.getWorkers().size(); i++) {
            Employee e = com.getWorkers().get(i);
            Element employeeTag = doc.createElement("employee");
            //םאמבמנמע ןמכÿ
            Field[] fieldsOfEntity = e.getClass().getDeclaredFields();
            Field[] fieldsSuper = new Field[0];
            if (!(e.getClass().getSimpleName().equals("Employee"))){
                employeeTag.setAttribute("position",e.getClass().getSimpleName().toLowerCase());
                fieldsSuper = e.getClass().getSuperclass().getDeclaredFields();
            }
            Field[] fields = new Field[fieldsOfEntity.length+fieldsSuper.length];
            System.arraycopy(fieldsOfEntity,0,fields,0,fieldsOfEntity.length-1);
            if (fieldsSuper.length>0){
                System.arraycopy(fieldsSuper,0,fields,fieldsOfEntity.length,fieldsSuper.length);
            }
            for (Field f : fields){
                Element tag = doc.createElement(f.getName());
                f.setAccessible(true);
                try {
                    tag.appendChild(doc.createTextNode(f.get(e).toString()));
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
                employeeTag.appendChild(tag);
            }
            rootElement.appendChild(employeeTag);
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result =
                    new StreamResult(new FileWriter("dmitrii\\src\\main\\resources\\companies\\"+com.getCompanyName()+".xml"));
            transformer.transform(source, result);
                /*StreamResult resultStream = new StreamResult(System.out);
                transformer.transform(source, resultStream);*/
        } catch (IOException | TransformerException ex) {
            ex.printStackTrace();
        }
    }
}
