package ua.artcode.week4.day2.xml;

import com.sun.javafx.sg.prism.NGNode;
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
 * Created by mike on 6/29/14.
 */
public class Parser {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document =
                builder.parse(Parser.class.getResource("company.xml").toString());
        //System.out.println(document.getDocumentElement().getTextContent());



        NodeList nodeList = document.getElementsByTagName("employee");

        Parser.Parse(nodeList, "");

    }

    public static void Parse(NodeList nodeList, String spaces)
    {
        String value = " ";

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if(node.getNodeType() == Node.ELEMENT_NODE || node.getNodeType() == Node.TEXT_NODE) {

                if (node.getNodeType() == Node.TEXT_NODE)
                {
                    value = node.getNodeValue();
                }

                else {


                    Element element = (Element) node;
                    System.out.println(spaces + "<" + element.getTagName() + ">");

                    System.out.println(value);

                    //System.out.println(nodeList.item(i).getNodeValue());

                    if (node.hasChildNodes()) {
                        NodeList nodeNodeList = node.getChildNodes();
                        Parser.Parse(nodeNodeList, spaces + "    ");
                    }

                    System.out.println(spaces + "</" + element.getTagName() + ">");
                }




            }
        }
    }
}