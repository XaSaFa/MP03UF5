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



