# Practica-Java
_Simulador de reservas de habitaciones de un hotel_

## Introducción
_En este repositorio he publicado la segunda práctica de Java (continuación de la primera) de la asignatura de Técnicas de Programación Avanzada._

Para ésta segunda práctica he actualizado la clase padre (Ecommerce) y hereda de una hija (Hotel), ambas con sus getters y setters correspondientes.
He creado otra clase padre (Worker) y hereda de una hija (Employee), al igual que la anterior, con sus getters y setters correspondientes.
Además tiene una clase "BookRoom" y otra "PersonMethods" dónde se hacen las principales funciones.
Otras clases que también he utilizado son "Date", "Internacionalizaion", "Read", "Cities".
Para que el main quede mejor organizado he creado una clase "Menus" donde albergo todos los menús necesarios.

Los hoteles se guardan en un Array en la clase BookRoom y se instancian en el main, así cargándose todos los atributos de los hoteles.
Los empleados es similar al anterior salvo por que se guardan en un clase PersonMethods.

También al contar con internacionalización cuenta con la posiblidad de cambiar a otros idiomas:

* Español
* Inglés
* Alemán
* Francés

### Código
_El código consiste en:_

* Clases: Ecommerce (Hotel), BookRoom, Read, Menus, PrincipalMenu, Cities, Date, Employee, Internacionalization, PersonMethods, Worker
* Tests: BookRoomTest, EcommerceTest, HotelTest, CitiesTest, DateTest, PersonMethodsTest, WorkerTest

### Main

Al ejecutar el programa lo primero que sale es un menú informativo con lo que puede hacer el programa y la fecha actual:
--ADJUNTAR FOTO
A continuación sale un pequeño menú a elegir entre trabajador o cliente.

 **Cliente:
Si elegimos cliente se puede ver cómo aparecerá un submenú 
-- ADJUNTAR FOTO
El objetivo principal es que el cliente pueda ver todos los hoteles disponibles con sus características para después reservar el número de habitaciones que desee y después en su cuenta se verá reflejado el dinero que se ha gastado.

 **Trabajador:
 Si hemos seleccionado esta opcion nos saldrá por pantalla un submenú que nos preguntara si somos empleados o propietarios de un hotel.
 - Los empleados pueden buscar empleados, mostrar todos los empleados o calcular el sueldo según el puesto de trabajo que tengan
 - Los propietarios pueden ver a todos los empleados y a los hoteles, añadir nuevos hoteles, contratar o despedir empleados, buscar a un empleado en concreto y cambiar de idioma
 
 * Nota: el precio de las habitaciones tanto Suit cómo Standard es noche/persona.
