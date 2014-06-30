package ua.artcode.week4.day2.xmls;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by admin on 29.06.2014.
 */
public class Parser {

    private static final String PATH = "company.xml";

    public static void showXML() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document d = builder.parse(String.valueOf(Parser.class.getResource(PATH)));

        Element el = d.getDocumentElement();
        showElement(el.getChildNodes(),"");

    }

    public static void showElement(NodeList childs, String spaces){
        for (int i = 0; i < childs.getLength(); i++) {
            Node node = childs.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){

                Element el = (Element) childs.item(i);
                System.out.println(spaces + "<"+el.getTagName()+">");
                if(el.hasChildNodes()){
                    showElement(el.getChildNodes(), spaces + "\t");
                }
                System.out.println(spaces + "</"+el.getTagName()+">");
            } else if(node.getNodeType() == Node.TEXT_NODE) {
                if(!node.getNodeValue().contains("\n")){
                    System.out.println("\t\t" + node.getNodeValue());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        showXML();
    }

}
