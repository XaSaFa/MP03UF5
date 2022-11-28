# Cues:

## Funcionament:

![image](https://user-images.githubusercontent.com/110727546/204243246-3ff44adf-dfc1-4665-89b5-8e740e49261c.png)

Les [cues o queues](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html) son estructures de dates que gestionen els seus elements utilitzan FIFO (First Input First Output).

Hi ha diverses implementacions de cues a Java: [Implementacions](https://docs.oracle.com/javase/tutorial/collections/implementations/queue.html).

Utilitzarem la classe [LinkedList](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html), per exemple, per a fer servir cues.

## Mètodes:

- Afegir element: Sempre al final (**add(E e)**).
- Eliminar element: Sempre el primer (**remove()**), retorna el primer element.
- Mirar el primer: (**peek()**), retorna null si la cua es buida.

## Exemple:

1. Aquest exemple crea una cua de números sencers i els mostra per pantalla:

```
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        int intAux = 0;
        LinkedList<Integer> cua = new LinkedList<>();
        cua.add(1);
        cua.add(10);
        cua.add(5);

        while(cua.peek()!= null){
            intAux=cua.remove();
            System.out.println(intAux);
        }
    }
}
```

## Activitats:

1. Crea un programa que demana a l'usuari números sencers, per consola, de forma il·limitada fins que l'usuari introdueixi un número negatiu. Quan l'usuari introdueix un número negatiu el programa mostra els números de la cua en ordre del primer a l'últim.

2. Crea un programa que demana a l'usuari números sencers de l'1 al 20, per consola, de forma il·limitada fins que l'usuari introdueixi un número negatiu. Quan l'usuari introdueix un número negatiu el programa mostra per pantalla, per cada valor de la cua, una línia amb un número d'asterics igual al valor del número de la cua.

Per exemple la cua següent (3,2,3), mostraria:

```
***
**
***
```


