# Enunciat:

Agafem l'enunciat de Gestió d'expedients quedant-nos només amb la part de creació del CRUD de UFs.

**Classe UF**

Atributs: 
- int codi
- String nom
- int hores
- int nota

El nostre programa ens permet:
- Crear una nova UF.
- Modificar les dades d'una UF.
- Eliminar una UF.
- Mostrar les dades d'una UF.
- Llistar les UFs que hi ha a memòria.
- **Guardar la llista de UFs a disc**

Per a guardar la llista de UFs a disc hem vist a classe com utilitzar les classes File i FileWriter:

- [Crear un fitxer.](fileCreate.java)
- [Escriure a un fitxer.](fileWrite.java)
- [Llegir de fitxer.](fileRead.java)

No podrem recuperar la informació en XML de forma fàcil, feu servir la lectura de fitxer només per controlar que el contingut del fitxer és correcte. 
