package model;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xmlreader {
    public static ArrayList<patient> readPatientsFromXml(String filepath) {
        ArrayList<patient> betegek = new ArrayList<>();
        try{
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(filepath);
            Element rootElement = document.getDocumentElement();
            NodeList childNodesList = rootElement.getChildNodes();
            Node node;
            for (int i = 0; i < childNodesList.getLength(); i++) {
                node = childNodesList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList childNodesOfUserTag = node.getChildNodes();
                    String taj = "", name = "", birthYear = "", kezeleskezdete = "", betegsegneve = "", allapot="";
                    for (int j = 0; j < childNodesOfUserTag.getLength(); j++) {
                        if (childNodesOfUserTag.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            switch (childNodesOfUserTag.item(j).getNodeName()) {
                                case "taj" : taj = childNodesOfUserTag.item(j).getTextContent();
                                case "name" : name = childNodesOfUserTag.item(j).getTextContent();
                                case "birthYear" : birthYear = childNodesOfUserTag.item(j).getTextContent();
                                case "kezeleskezdete" : kezeleskezdete = childNodesOfUserTag.item(j).getTextContent();
                                case "betegsegneve" : betegsegneve = childNodesOfUserTag.item(j).getTextContent();
                                case "allapot" : allapot = childNodesOfUserTag.item(j).getTextContent();
                            }
                        }
                    }
                    betegek.add(new patient(taj, name, birthYear, kezeleskezdete, betegsegneve, patient_enum.valueOf(allapot)));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return betegek;
    }
}
