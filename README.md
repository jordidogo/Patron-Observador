﻿# Práctica 7: Sistema de Observación Meteorológica usando el Patrón Observador

## Descripción
MeteorObservador es una aplicación en Java que implementa un sistema de observación meteorológica utilizando el patrón de diseño Observador. Esta aplicación permite a los usuarios obtener y visualizar las condiciones meteorológicas en tiempo real de diversas ciudades, utilizando la API de WeatherStack.

## Autores
- **Jorge Domínguez González** ([correo electrónico](mailto:alu0101330600@ull.edu.es))
- **Adnan Hawari Capa** ([correo electrónico](mailto:Alu0100417012@ull.edu.es))
- **Paula Regalado De León** ([correo electrónico](mailto:Alu0101330174@ull.edu.es))

## Funcionalidades Principales

- **Interfaz Gráfica Intuitiva:** La aplicación proporciona una interfaz fácil de usar que permite a los usuarios seleccionar ciudades de interés para recibir actualizaciones meteorológicas.

- **Datos en Tiempo Real:** Utilizando la API de WeatherStack, MeteorObservador recopila información actualizada sobre las condiciones meteorológicas y la presenta en tiempo real en la interfaz gráfica.

- **Implementación del Patrón Observador:** El código utiliza el patrón de diseño Observador para permitir que las distintas partes de la aplicación se actualicen automáticamente cuando cambian las condiciones meteorológicas.

## Instrucciones de Uso

### Requisitos Previos

- Java JDK instalado
- Conexión a Internet

### Pasos para Ejecutar

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/tu_usuario/MeteorObservador.git
   cd MeteorObservador

2. **Compilar y Ejecutar:**

    ```bash
    javac *.java
    java MainWeatherstack
    
3. **Interfaz Gráfica:**

- Selecciona ciudades y haz clic en "Obtener Condiciones Meteorológicas".
- Las condiciones meteorológicas se mostrarán en tiempo real.

  [PRESENTACIÓN](https://docs.google.com/presentation/d/11T85bDJEN3PjjprUrduhKyssI49ECHa6AYwuMLvrpGw/edit#slide=id.g1ec55ba47fd_0_18)
