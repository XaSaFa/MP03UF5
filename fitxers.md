## Fitxers:

Un fitxer o arxiu és un conjunt de bits emmagatzemats a un dispositiu, com pot ser un disc dur.

L’avantatge principal dels fitxers és que les dades es poden recuperar un cop s’apaga el equip, no són volàtils.

#### Llibreria java.io

![image](https://user-images.githubusercontent.com/110727546/201608056-7ce264dc-9e8b-4c84-bbf8-d904603c9818.png)

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
- mkdir(): Crea un directori amb el nom indicat a la creació de l’objecte File.
- renameTo(File nou): renombra el fitxer.
- ...

#### Activitat:

Fes un programa que, passant-li una ruta et retorni:

1. Si és la ruta d'un fitxer o un directori
2. El nom del fitxer/directori.
3. El camí relatiu (path).
4. El camí absolut (path).
5. En cas de ser un fitxer Si el fitxer es pot llegir, escriure i/o executar.
6. La última vegada que es va modificar.
7. El seu tamany.

### Exemple de creació d’un fitxer nou:

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

### Llegir i escriure carácters:

Per llegir i escriure a carácters fem servir les classes [FileReader](https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html) i [FileWriter](https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html).

Heu de tenir en compte que la classe FileWriter crea un nou fitxer, per tant es perd la informació quan cridem al constructor. Això s'evita cridant al constructor amb un segon paràmetre amb valor **true**.

Aquí teniu un exemple d'una escriptura de tres carácters i la seva lectura:

```
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ficheros {

    public static void main(String[] args) {

        try{
            FileWriter fileWriterAux = new FileWriter("caracters.txt");
            fileWriterAux.write('a');
            fileWriterAux.write('b');
            fileWriterAux.write('c');
            fileWriterAux.close();
            FileReader fileReaderAux = new FileReader("caracters.txt");
            int caracterActual = 0;
            while((caracterActual = fileReaderAux.read())!=-1) {
                System.out.println((char)caracterActual);
            }
            fileReaderAux.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

#### Activitat:

Fes un programa que:

1. Generi 10 caràcters de la A a la Z maiúscules de forma aleatòria.
2. Guardi els 10 caràcters al fitxer "caracters.txt".
3. Llegeixi el fitxer "caracters.txt" i tregui un llistat amb totes les lletres de l'abecedari en maiúscules i la quantitat de lletres que hi ha al fitxer de cada una d'elles.

Per exemple, si es generen aquests caràcters: A,A,A,B,B,B,C,C,C,D

La sortida seria: 
A:3
B:3
C:3
D:1
E:0
...


### Llegir i escriure Línies de text (Strings):

Normalment utilitzem métodes de classes com [BufferedWriter](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedWriter.html) per escriure o [BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html) per llegir.

En el següent exemple s'escriuren tres línies de text i es llegeixen.
```
import java.io.*;

public class ficheros {

    public static void main(String[] args) {

        try{
            //escriure:
            FileWriter fileWriterAux = new FileWriter("frases.txt");
            BufferedWriter bufferedWriterAux = new BufferedWriter(fileWriterAux);
            bufferedWriterAux.write("Mas vale prevenir que curar");
            bufferedWriterAux.newLine();
            bufferedWriterAux.write("Quien a buen arbol se arrima buena sombra le cobija");
            bufferedWriterAux.newLine();
            bufferedWriterAux.close();
            //llegir:
            FileReader fileReaderAux = new FileReader("frases.txt");
            BufferedReader bufferedReaderAux = new BufferedReader(fileReaderAux);
            String fraseActual = "";
            while((fraseActual = bufferedReaderAux.readLine())!=null) {
                System.out.println(fraseActual);
            }
            bufferedReaderAux.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

#### Activitat:

Fes un programa que:

1. Demana a l'usuari/a el títol d'una peli.
2. Ordeni alfabèticament les pelis del fitxer "pelis.txt", afegint la nova peli.
3. Llista les pelis del fitxer "pelis.txt".



### Llegir i escriure dades binaries:

El que hem vist fins ara era escriure i llegir informació en mode text.

Per llegir i escrire dades en binari utilitzem les classes [DataInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/DataInputStream.html) i  [DataOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/DataOutputStream.html).

En el següent exemple escrivim i llegim números sencers, però les classes tenen mètodes per llegir i escriure diferents tipus de dades.

```
import java.io.*;

public class ficheros {

    public static void main(String[] args) {

        try{
            //escriure:
            FileOutputStream fileOutputStreamAux = new FileOutputStream("dadesBinaries.data");
            DataOutputStream dataOutputStreamAux = new DataOutputStream(fileOutputStreamAux);
            dataOutputStreamAux.writeInt(1);
            dataOutputStreamAux.writeInt(2);
            dataOutputStreamAux.writeInt(3);
            dataOutputStreamAux.close();
            //llegir:
            FileInputStream fileInputStreamAux = new FileInputStream("dadesBinaries.data");
            DataInputStream dataInputStreamAux = new DataInputStream(fileInputStreamAux);


            while(dataInputStreamAux.available()>0) {
                System.out.println(dataInputStreamAux.readInt());
            }
            dataInputStreamAux.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```

#### Activitat:

Fes un programa que:

1. Pregunti a l'usuari un numero sencer i guardi al fitxer "arrels.data" el numero sencer al quadrat.
2. Llegeixi del fitxer "arrels.data" els numeros emmagatzemats i mostri la seva arrel quadrada.

