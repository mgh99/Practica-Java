# Practica-Java
_Simulador de reservas de habitaciones de un hotel_

## Introducción
_En este repositorio he publicado la primera práctica de Java de la asignatura de Técnicas de Programación Avanzada._

Para ésta primera práctica he creado una clase padre (Ecommerce) y hereda de una hija (Hotel), ambas con sus getters y setters correspondientes.
Además tiene una clase "BookRoom" y otra "Read" donde desarrollo todos los métodos que voy a necesitar en el main del programa.

Los hoteles se guardan en un Array en el main donde se instancian y se cargan todos los atributos de los hoteles.

### Código
_El código consiste en:_

* Clases: Ecommerce (Hotel), BookRoom, Read, Menu.
* Tests: BookRoomTest, EcommerceTest, HotelTest

### Main

Si ejecutas el programa, saldrá un menú principal con las opciones: Mostrar todos los hoteles, Reservar habitaciones, Mostrar dinero total gastado en la app y Buscar hotes por ciudades con la opción de reservar en ellos.
Al elegir la 4 opción (Buscar hoteles por ciudades) saldrá un submenú, donde aparecen todas las ciudades en las que hay hoteles disponibles para reservar, con todas sus carácterísticas.

Una vez elegido el hotel en el que quieres reservar una habitación saldrá otrp submenú en el que te preguntará si quieres una habitación Suit o Standard y el número de habitaciones.
 * Nota: el precio de las habitaciones tanto Suit cómo Standard es noche/persona.
