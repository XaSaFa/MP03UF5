## Fitxers:

Un fitxer o arxiu és un conjunt de bits emmagatzemats a un dispositiu, com pot ser un disc dur.

L’avantatge principal dels fitxers és que les dades es poden recuperar un cop s’apaga el equip, no són volàtils.

### Classe File:

La classe **File** de JAVA ens proporciona una serie de informació i mètodes de manipulació de fitxers, la classe File només té el nom i ruta del fitxer, no és el fitxer en si:

- list(): Mostra els fitxers d’un directori.
- getName(): Torna el nom del fitxer o directori.
- getPath(): Torna el cami relatiu.
- getAbsolutePath(): Torna el camí absolut del fitxer o directori.
- canRead(): Torna true si el fitxer es pot llegir.
- canWrite(): Torna true si el fitxer es pot escriure.
- lenght(): Torna els tamany del fitxer en bytes.
- createNewFile(): crea un nou fitxer buit i associat a File si no existeix cap fitxer amb aquest nom.
- delete(): Esborra el fitxer o directori associat a File.
- isFile(): Retorna true si File es un fitxer normal.
- mkdir(): Crea un directoriamb el nom indicat a la creació de l’objecte File.
- renameTo(File nou): renombra el fitxer.

#### Exemple de creació d’un fitxer nou:

´´´
import java.io.File;
import java.io.IOException;

public class ficheros {

    public static void main(String[] args) {

        try{
            File file1;
            file1 = new File("exemple.txt");
            file1.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
´´´
#### Llibreria java.io

![image](https://user-images.githubusercontent.com/110727546/201608056-7ce264dc-9e8b-4c84-bbf8-d904603c9818.png)
