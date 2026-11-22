# LoginJSF · Autenticación y Persistencia ObjectDB

Aplicación web académica desarrollada con Java, Jakarta Server Faces (JSF) y persistencia nativa orientada a objetos mediante ObjectDB.

- **Documentación de arquitectura:** [DeepWiki - LoginJSF](https://deepwiki.com/eneekoruiz/LoginJSF)

## Arquitectura y Decisiones de Diseño

- **Persistencia Orientada a Objetos:** Utiliza ObjectDB como motor de base de datos orientado a objetos, almacenando directamente instancias Java y sus relaciones sin necesidad de transformaciones relacionales complejas.
- **Ciclo de Vida JSF:** Manejo del ciclo de vida de peticiones Jakarta Faces, navegación declarativa mediante `faces-config.xml` y enlaces de datos bidireccionales con Managed Beans.
- **Validación de Formularios:** Validadores integrados en vistas XHTML para comprobación de credenciales y feedback interactivo al usuario.

## Stack Técnico

- **Lenguaje:** Java 17+
- **Tecnología Web:** JSF (Jakarta Faces)
- **Base de Datos:** ObjectDB
- **Gestión:** Apache Maven

## Puesta en Marcha Local

```bash
git clone https://github.com/eneekoruiz/LoginJSF.git
cd LoginJSF

# Compilar y empaquetar WAR
mvn clean package
```
