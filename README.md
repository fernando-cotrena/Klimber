# SerenityBDD

Proyecto implementado con SerenityBDD, donde se aprovecha la sintaxis Gherkin para la definición de casos de prueba y se emplea el patrón "Screenplay" para la implementación de los escenarios. Este enfoque proporciona una estructura clara y modular para la automatización de pruebas, permitiendo una fácil comprensión y mantenimiento del código. Explora este proyecto para obtener ejemplos prácticos de cómo utilizar SerenityBDD, Gherkin y el patrón "Screenplay" para llevar a cabo pruebas de manera eficiente y estructurada.


## Preparacion de ambiente

- JDK 1.8+, Estoy usando JDK 11.
- Gradle 6.0+,Estoy usando Gradle 7.6.4.

## Como ejecutar las pruebas

```bash
.gradle clean test
```
## Reporte
    Desde la ruta target\site\serenity se puede leer el archivo index.html


### Configuracion del Webdriver 
La configuración de WebDriver se gestiona íntegramente desde el archivo "serenity.conf", como se ilustra a continuación:
```java
webdriver {
    driver = chrome
}
headless.mode = true

chrome.switches="""--start-maximized;--test-type;--no-sandbox;--ignore-certificate-errors;
                   --disable-popup-blocking;--disable-default-apps;--disable-extensions-file-access-check;
                   --incognito;--disable-infobars,--disable-gpu"""

```

Serenity utiliza WebDriverManager para descargar automáticamente los binarios de WebDriver antes de ejecutar las pruebas.

### Configuraciones específicas del entorno
También podemos configurar propiedades y opciones específicas del entorno, para que las pruebas puedan ejecutarse en distintos entornos. Aquí, configuramos tres entornos, __dev__, _staging_ y _prod_, con diferentes URLs de inicio para cada uno:

```json
environments {
  default {
    webdriver.base.url = "https://purchase-testing.klimber.com"
  }
  dev {
    webdriver.base.url = "https://purchase-dev.klimber.com"
  }
  staging {
    webdriver.base.url = "https://purchase-staging.klimber.com"
  }
  prod {
    webdriver.base.url = "https://purchase-prod.klimber.com"
  }
}
```
Se puede cambiar el ambiente de prueba agregando -Denvironment=staging
```bash
.gradle clean test -Denvironment=staging
```
Por defecto utiliza los datos en la opcion "default"
