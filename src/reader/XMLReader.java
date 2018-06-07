package reader;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXParseException;
import person.Student;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class XMLReader {
    public static List<Student> readStudentsXML(String path){
        List<Student> students = new LinkedList<>();
        try {
            File xmlFile = new File("data/" + path);

            //System.out.println(xmlFile.getPath());

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("student");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                    String sLevel = eElement.getElementsByTagName("level").item(0).getTextContent();
                    int level = Integer.parseInt(sLevel);
                    students.add(new Student(name, level));
                    //System.out.println(name);
                    //System.out.println(level);
                }
            }

        } catch (FileNotFoundException fileNotFoundExc) {
            System.out.println("Файл: " + path + " не найден");
        } catch (SAXParseException saxParserExc){
            System.out.println("Ощибка чтения XML");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return students;
    }
}
