# Enunciat:

Tenim la classe carta:

```
import java.io.*;

public class carta implements Serializable{
    enum pals{
        ORS,
        COPES,
        ESPASES,
        BASTOS
    }
    int numero;
    String pal;

    public int getNumero() {
        return numero;
    }
    public String getPal(){
        return pal;
    }

    public carta(int n, String p){
        this.numero = n;
        this.pal = String.valueOf(pals.valueOf(p));
    }
}
```

El següent codi guarda a un fitxer un objete de tipus carta i el torna a llegir:

```
  public static void main(String[] args) throws IOException, ClassNotFoundException {
        carta a = new carta(1,"ORS");
        carta b;
        File fitxer = new File ("cartes.txt");

        //escriptura:
        ObjectOutputStream fluxeEscriptura = new ObjectOutputStream(new FileOutputStream(fitxer));
        fluxeEscriptura.writeObject(a);
        fluxeEscriptura.close();

        //lectura:
        ObjectInputStream fluxeLectura = new ObjectInputStream(new FileInputStream(fitxer));
        b = (carta)fluxeLectura.readObject();
        fluxeLectura.close();
        System.out.println(b.pal);
    }
```


1. Hem de fer un programa que crei una baralla amb totes les cartes de la baralla espanyola (del 1 al 12 de cada pal).
  -  La baralla serà un ArrayList de cartes.
  -  Es podran barrejar les cartes de forma aleatòria (utilitza dos ArrayLists).
2. Hem de fer un programa que guardi la baralla de cartes a un fitxer i el pugui tornar a llegir.

-------------------------------------------------------------------------------------------------------------------

3. Crea un programa que faci una pila de cartes per jugar ordenades de forma aleatoria cada vegada.
  -  El programa pregunta els noms del jugador 1 i jugador 2.
  -  El programa barreja la baralla.
  -  El programa agafa les dues últimes cartes, la primera pel jugador 1 i la segona pel jugador 2.
  -  El programa diu quin jugador guanya la ma (la carta més alta guanya, si hi ha empat no guanya ningú).
  -  Al final de la partida el programa diu els punts de cada jugador i qui ha guanyat.
  -  Et dona la opció de fer una nova partida o sortir.
