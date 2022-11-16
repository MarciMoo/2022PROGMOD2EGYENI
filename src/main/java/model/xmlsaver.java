package model;

import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class xmlsaver {
    public static void savePatientsToXml(ArrayList<patient> betegek, String filepath) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = document.createElement("betegek");
            document.appendChild(rootElement);
            for (patient beteg : betegek) {
                Element beteg1 = document.createElement("beteg");
                rootElement.appendChild(beteg1);
                createChildElement(document, beteg1, "taj", beteg.getTaj());
                createChildElement(document, beteg1, "name", beteg.getName());
                createChildElement(document, beteg1, "birthYear",beteg.getBirthYear());
                createChildElement(document, beteg1, "kezeleskezdete",beteg.getKezeleskezdete());
                createChildElement(document, beteg1, "betegsegneve", beteg.getBetegsegneve());
                createChildElement(document, beteg1, "allapot", beteg.getAllapot().toString());
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileOutputStream(filepath));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createChildElement(Document document, Element parent, String tagName, String value) {
        Element element = document.createElement(tagName);
        element.setTextContent(value);
        parent.appendChild(element);
    }
}
