package com.ubs.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

/**
 * Used DOM Parser to parse the XML File.
 */
public class DOMXMLParser {

    public static void main(String[] args) {


        String fileName = "books.xml";
        File file = new File(Parser.class.getClassLoader().getResource(fileName).getFile());
        try {


            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("book");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Attribute id : " + eElement.getAttribute("id"));
                    System.out.println("author : " + eElement.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("genre : " + eElement.getElementsByTagName("genre").item(0).getTextContent());
                    System.out.println("price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("publish_date : " + eElement.getElementsByTagName("publish_date").item(0).getTextContent());
                    System.out.println("description : " + eElement.getElementsByTagName("description").item(0).getTextContent());

                }
            }

        } catch (ParserConfigurationException e){
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
