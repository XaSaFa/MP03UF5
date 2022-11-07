/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

/**
 *
 * @author Kal
 */
class Producte{
    int id;
    String nom;
    String descripcio;
    Double preu;

    public String toString(){
        return("-Producte: "+id+", nom: "+nom+", descripció: "+descripcio+", preu: "+preu+".");
    }

}

public class JAVAXMLSAX {

    public static void main(String[] args){

        ArrayList<Producte> LlistaProductes = new ArrayList<>();

        try{
            XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
            TractarContingut  gestor = new TractarContingut(LlistaProductes);
            procesadorXML.setContentHandler(gestor);
            InputSource fileXML = new InputSource("Productes.xml");
            procesadorXML.parse(fileXML);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        Iterator it = LlistaProductes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}

class TractarContingut  extends DefaultHandler {
    ArrayList<Producte> LlistaProductes = new ArrayList<>();
    Producte producteAux = new Producte();
    String element = "";
    Boolean guardar = false;
    int idioma=1;//Agafem anglès per exemple.

    public TractarContingut(ArrayList<Producte> a) {
        this.LlistaProductes = a;
    }
    public TractarContingut() {
        super();//construtor classe mare
    }

    @Override
    public void startDocument() {
        System.out.println("Començament del document XML");
    }

    @Override
    public void endDocument() {
        System.out.println("Final del document XML");
    }
    @Override
    public void startElement(String uri, String nom,
                             String nomC, Attributes atts) {
        System.out.println("\tPrincipi Element: " + nom);
        if(atts.getLength()>0){
            System.out.println("\tAtributs: " + atts.getLocalName(0)+" = "+atts.getValue(0));
        }

        //Si el tag es de producte creem un nou producte:
        if(nom.equals("producte")){
            producteAux = new Producte();
        }

        //AGAFEM EL NOM DEL TAG:
        element = nom;
        guardar = false;
        if(element.equals("nom")){
            if(atts.getLength()>0){
                for(int i=0;i<atts.getLength();i++)
                {

                    if(atts.getLocalName(i).equals("lang")&&Integer.parseInt(atts.getValue(0))==idioma){
                        guardar=true;
                    }
                }
            }
        }
        if(element.equals("descripcio")){
            if(atts.getLength()>0){
                for(int i=0;i<atts.getLength();i++)
                {

                    if(atts.getLocalName(i).equals("lang")&&Integer.parseInt(atts.getValue(0))==idioma){
                        guardar=true;
                    }
                }
            }
        }
    }
    @Override
    public void endElement (String uri, String nom, String qName) {
        System.out.println("\tFinal Element: " + nom);
        if(nom.equals("producte")){
            LlistaProductes.add(producteAux);
        }
    }
    @Override
    public void characters(char[] ch, int inici, int longitud)
            throws SAXException {
        String car=new String(ch, inici, longitud);
        car = car.replaceAll("[\t\n]","");
        if(car.trim().length()>0){
            System.out.println("\tCatacters: " + car);

            //Si element es ID el guardem com id de producte:
            if(element.equals("id")){
                producteAux.id = Integer.parseInt(car);
            }
            //Si element es nom el guardem com nom de producte:
            if(element.equals("nom")){
                if(guardar){
                    producteAux.nom = car;
                }
            }
            //Si element es descripció el guardem com descripcio de producte:
            if(element.equals("descripcio")){

                if(guardar){
                    producteAux.descripcio = car;
                }
            }
            //Si element es preu el guardem com preu de producte:
            if(element.equals("preu")){
                producteAux.preu = Double.parseDouble(car);
            }
        }
    }
}
