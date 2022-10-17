import java.io.File;
import java.io.IOException;

public class fileCreate {
    public static void main(String[] args) {
        try {
            File fitxerDades = new File("uf.xml");
            //Si he aconseguit crear el fitxer
            if (fitxerDades.createNewFile()) {
                System.out.println("Fitxer "+ fitxerDades.getName() +" creat");
            }
            //Si no he pogut
            else {
                System.out.println("No s'ha pogut crear.");
            }
        }catch(IOException error){
            System.out.println("Error al crear el fitxer.");
            error.printStackTrace();
        }
    }
}
