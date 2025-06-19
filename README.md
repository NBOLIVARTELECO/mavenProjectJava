# Proyecto de ejemplo: Java + Maven

> **¡Incluye Maven Wrapper!**
>
> Este proyecto ya incluye Maven Wrapper (`mvnw`, `mvnw.cmd`, `.mvn/`). Puedes compilar y ejecutar el proyecto sin tener Maven instalado globalmente, usando los scripts proporcionados:
>
> - En Linux/Mac: `./mvnw clean package`
> - En Windows: `mvnw.cmd clean package`

Este proyecto ejemplifica cómo crear y configurar un proyecto básico en Java utilizando Maven. Es ideal para quienes desean comprender la estructura mínima y los pasos esenciales para iniciar un proyecto Java con Maven.

## Estructura del proyecto

```
mavenproject1/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── mavenproject1/
│                       └── Mavenproject1.java
└── target/ (generado tras compilar)
```

## 1. ¿Qué es Maven?
Maven es una herramienta de automatización y gestión de proyectos para Java. Permite compilar, probar, empaquetar y gestionar dependencias de manera sencilla y estandarizada.

## 2. Creación del proyecto
Puedes crear un proyecto similar ejecutando:

```sh
mvn archetype:generate -DgroupId=com.mycompany -DartifactId=mavenproject1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Esto generará la estructura básica y el archivo `pom.xml`.

## 3. Estructura de carpetas
- `src/main/java/`: Código fuente principal.
- `src/test/java/`: (opcional) Pruebas unitarias.
- `pom.xml`: Archivo de configuración de Maven.
- `target/`: Carpeta generada automáticamente al compilar, contiene los archivos `.class` y el `.jar` resultante.

## 4. Archivo pom.xml
El `pom.xml` define la configuración del proyecto:

```xml
<project ...>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.mycompany</groupId>
    <artifactId>mavenproject1</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>22</maven.compiler.source>
        <maven.compiler.target>22</maven.compiler.target>
        <exec.mainClass>com.mycompany.mavenproject1.Mavenproject1</exec.mainClass>
    </properties>
</project>
```

- **groupId**: Identificador del grupo (suele ser el dominio invertido de la organización).
- **artifactId**: Nombre del proyecto.
- **version**: Versión del proyecto.
- **packaging**: Tipo de artefacto generado (jar, war, etc).
- **maven.compiler.source/target**: Versión de Java utilizada.
- **exec.mainClass**: Clase principal para ejecución.

## 5. Código de ejemplo
Archivo principal: `src/main/java/com/mycompany/mavenproject1/Mavenproject1.java`

```java
public class Mavenproject1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

## 6. Compilar y ejecutar

### Compilar
```sh
mvn clean package
```
Esto genera el archivo `.jar` en la carpeta `target/`.

### Ejecutar
```sh
java -cp target/mavenproject1-1.0-SNAPSHOT.jar com.mycompany.mavenproject1.Mavenproject1
```

## 7. Recomendación: Maven Wrapper
Para facilitar la ejecución sin requerir Maven instalado globalmente, se recomienda agregar Maven Wrapper:

```sh
mvn -N io.takari:maven:wrapper
```
Esto generará los archivos `mvnw`, `mvnw.cmd` y la carpeta `.mvn/`.

Luego puedes compilar y ejecutar usando:
```sh
./mvnw clean package
```

## 8. Recursos útiles
- [Documentación oficial de Maven](https://maven.apache.org/guides/index.html)
- [Guía de inicio rápido](https://maven.apache.org/guides/getting-started/index.html)

## 9. Dependencias y pruebas unitarias

Este proyecto incluye JUnit Jupiter (JUnit 5) para pruebas unitarias. Puedes agregar tus propias pruebas en `src/test/java/`.

### Ejemplo de método a probar
En `Mavenproject1.java`:
```java
public static int sumar(int a, int b) {
    return a + b;
}
```

### Ejemplo de prueba unitaria
Crea el archivo `src/test/java/com/mycompany/mavenproject1/Mavenproject1Test.java` con el siguiente contenido:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Mavenproject1Test {
    @Test
    void testSumar() {
        assertEquals(5, Mavenproject1.sumar(2, 3));
    }
}
```

### Ejecutar pruebas

```sh
./mvnw test
```

Esto ejecutará todas las pruebas unitarias del proyecto.

---

Este proyecto es un punto de partida para cualquier aplicación Java sencilla gestionada con Maven. ¡Modifica y expande según tus necesidades! 