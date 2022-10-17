import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) {
        try {
            File fitxerDades = new File("uf.xml");
            Scanner lectorDades = new Scanner(fitxerDades);
            while (lectorDades.hasNextLine()){
                String dades = lectorDades.nextLine();
                System.out.println(dades);
            }
            lectorDades.close();
        }catch(FileNotFoundException error){
            System.out.println("Error a l'obrir el fitxer per lectura.");
            error.printStackTrace();
        }
    }
}
