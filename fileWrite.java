import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) {
        try{
            //escriptura:
            FileWriter escriptorDeFitxer = new FileWriter("uf.xml");
            //afegir al final:
            //FileWriter escriptorDeFitxer = new FileWriter("uf.xml",true);
            escriptorDeFitxer.write("<UF><CODI>MP03UF5</CODI></UF>");
            escriptorDeFitxer.close();
            System.out.println("Fitxer modificat amb èxit");
        }catch (IOException error){
            System.out.println("Error al crear el fitxer");
            error.printStackTrace();
        }
    }
}
