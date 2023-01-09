# Interfícies a JAVA:

A dia d'avui gairebé no existeixen les aplicaciones natives amb interfície a Java, gairebé tothom fa servir Apps o WebApps.

No obstant podem utilitzar interfícies gràfiques per crear els nostres programes.

Tradicionalment es feia servir Swing.

Nosaltres veurem com fer una aplicació amb JAVAFX i el framework, o més aviat, els fulls d'estil de BootstrapFX.

## Enllaços:

- [BootstrapFX](https://gitee.com/tju_xiaoyong/bootstrapfx)
- [Exemples BootstrapFX](https://www.jfx-ensemble.com/project/BootstrapFX)

## Proves:

### Exemple:

Per provar com funciona farem un programa senzill com el que ve per defecte a BootstrapFX, afegeix elements i modifica els seus estils.

### Calculadora:

Ara farem una senzilla calculadora.

### Captura de nou projecte:

![image](https://user-images.githubusercontent.com/110727546/208448107-6244c827-e08f-4d98-a152-1918956e2ebc.png)
![image](https://user-images.githubusercontent.com/110727546/208448170-8fe5f8c0-0e11-43c2-83de-5970b1644628.png)

### Important:

Per aplicar estil Bootstrap afegiu aquesta línia al mètode Start de HelloApplication.

```
scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
```

## Camps de text:

Per poder interactuar amb l'usuari és important tenir elements d'entrada d'informació com els camps de text "TextField".

Veurem una aplicació que fa ús dels TextField, aquesta aplicació té un camp de text on s'introdueix el nom d'usuari/a i dos botons, un per dir-li hola i un altre per dir-li adéu.

![image](https://user-images.githubusercontent.com/110727546/211264891-8c4dda18-3620-4012-a183-0374f8d5586f.png)

### HelloApplication:

```
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```

### HelloController:

```
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nom;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void boto1() {
        String cadenaAux = "Hola ";
        cadenaAux += nom.getText();
        welcomeText.setText(cadenaAux);
    }
    @FXML
    protected void boto2() {
        String cadenaAux = "Adeu ";
        cadenaAux += nom.getText();
        welcomeText.setText(cadenaAux);
    }

}
```

### hello-view.fxml:

```
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.VBox?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.control.TextField?>
<VBox alignment="CENTER" spacing="20.0" xmlns:fx="http://javafx.com/fxml"
      fx:controller="com.example.demo4.HelloController">
    <padding>
        <Insets bottom="20.0" left="20.0" right="20.0" top="20.0"/>
    </padding>

    <Label fx:id="welcomeText"/>
    <HBox>
        <TextField fx:id="nom"/>
        <Button id="1" text="Hola" onAction="#boto1" styleClass="btn-info"/>
        <Button id="2" text="Adeu" onAction="#boto2" styleClass="btn-info"/>
    </HBox>


</VBox>
```

### Activitats:

1. Feu un programa que tingui dos camps de text per introduir números i un botó per cada operació matemàtica: suma, resta, multiplicació, divisió. Al pressionar el botó d'una operació es mostrarà en una etiqueta Label el resultat.

2. Feu un programa que demani usuari i contrasenya utilitzant un TextField pel nom i un PasswordField per la contrasenya, també que tingui un botó amb el text "registrar usuari". El programa guarda en un fitxer anomenat "secret" el nom d'usuari i la contrasenya.

3. Millora el programa anterior amb xifratge de la contrasenya [pots utilitzar el xifratge SHA d'Apache](https://mvnrepository.com/artifact/commons-codec/commons-codec/1.9) o un altre.

4. Fes un programa que demani usuari i contrasenya i mostri "Error" si no hi ha cap combinació d'usuari i contrasenya idèntic al fitxer secret però mostri "Benvingut/da + nom d'usuari/a" si existeix.

## Imatges:

Podem afegir imatges al nostre programa, per exemple al fitxer FXML:

```
    <ImageView fitWidth="150" preserveRatio="true" fx:id="logo" >
        <image>
            <Image  url="https://pbs.twimg.com/profile_images/1501471976094945280/gE-3sm7e_400x400.jpg" />
        </image>
    </ImageView>
```

I les podem canviar en temps d'execució (a HelloController):

```
    @FXML
    protected void boto1() {
        String cadenaAux = nom.getText();        
        Image imatge1 = new Image(cadenaAux);
        logo.setImage(imatge1);
    }
```

### Activitats:

1. Afegeix una imatge als programes anteriors.

2. Fes un programa que tingui una imatge, un camp de text i un botó, si pressionem el botó es canviarà la imatge del programa per la de la URL introduida al camp de text.


