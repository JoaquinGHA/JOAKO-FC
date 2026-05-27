# JOAKO-FC ⚽

Proyecto Java para la gestión de una plantilla de fútbol.
Desarrollado como ejercicio práctico de Programación Orientada a Objetos (POO).

## Descripción

Este proyecto simula la gestión de una plantilla de fútbol, usando como ejemplo 
el FC Barcelona. Permite almacenar jugadores por posición, consultar sus estadísticas 
y calcular su valor de mercado.

## Conceptos aplicados

- **Clase abstracta** `Jugador` como base con atributos comunes
- **Herencia** — clases `Portero`, `Defensa`, `Medio` y `Delantero`
- **Polimorfismo** — cada clase implementa su propio método `describir()`
- **Interface** `ITransferable` — calcula precio de venta y transferibilidad según posición
- **ArrayList** — almacena y recorre toda la plantilla
- **HashMap** — busca jugadores por número de dorsal

## Tecnologías

- Java 17
- Eclipse IDE
