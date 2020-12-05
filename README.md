# Practica-Java
_Simulador de reservas de habitaciones de un hotel_

## Diagrama de clases
_Visuualización de como sería el esquema del diagram de clases de la práctica 3:_
![esquema diagrama de clases practica3_page-0001](https://user-images.githubusercontent.com/43043718/100024921-0a18eb80-2de8-11eb-937e-0c8903167a26.jpg)

* Para ver los atributos de cada clase puedes verlo en el siguiente enlace:
https://github.com/mgh99/Practica-Java/tree/main/images/Diagrama_de_clases

## Introducción
_En este repositorio he publicado la cuarta práctica de Java (continuación de la tercera) de la asignatura de Técnicas de Programación Avanzada._

Para ésta cuarta práctica he añadido principalmente la lectura de ficheros mediante la clase "ReadBossHotels", que lee un ejemplo de algunos de los propietarios de hoteles guardados en un fichero de texto. Además he añadido la librería crypto; en la cual se encripta el menú del propietario y después se desencripta para ver sus opciones. He modificado la clase de IRegister (interface) y la he puesto con genéricos para poder introducir cualquier tipo de datos. Por último he añadido Threads para hacer una simulación de lo que tardarían en completar la reserva de varias habitaciones un recepcionista con un cliente, con sus tiempos de ejecución.

También hay una clase padre (Ecommerce) y hereda de una hija (Hotel), ambas con sus getters y setters correspondientes.
He creado otra clase padre (Worker) y hereda de una hija (Employee), al igual que la anterior, con sus getters y setters correspondientes.
Además tiene una clase "BookRoom" y otra "PersonMethods" dónde se hacen las principales funciones.
Otras clases que también he utilizado son "Date", "Internacionalizaion", "Read", "Cities".
Para que el main quede mejor organizado he creado una clase "Menus" donde albergo todos los menús necesarios.

He añadido un clase interface (IRegister) que sirve para crear un inicio de sesión para el cliente y los trabajadores ahora con genéricos.
Y la clase Register donde se verifica que el ID de un usuario ya registrado coincida con la contraseña asignada por el mismo, si es así puedes iniciar sesión como cliente o coomo trabajador.

Además he añadido una clase MathHotel que calcula el dinero total de la app.
Y una clase client que guarda el nombre del cliente utilizado para los Threads y los tiempos de compra.

Los hoteles se guardan en un Array en la clase BookRoom y se instancian en el main, así cargándose todos los atributos de los hoteles.
Los empleados es similar al anterior salvo por que se guardan en un clase PersonMethods.

También al contar con internacionalización cuenta con la posiblidad de cambiar a otros idiomas
(La foto tiene un trozo de cada idioma para visualizar de forma rápida cómo se vería):

* Español
* Inglés
* Alemán
* Francés

![trozos_menu](https://user-images.githubusercontent.com/43043718/98460803-b4b5cb00-21a7-11eb-8582-aee66961c0bd.png)

### Código
_El código consiste en:_

* Clases: Ecommerce (Hotel), BookRoom, Read, Menus, PrincipalMenu, Cities, Date, Employee, Internacionalization, PersonMethods, Worker, IRegister, MathHotel, Register, AESSymetricCrypto, Client, HiloWork, ReadBossHotels
* Tests: BookRoomTest, EcommerceTest, HotelTest, CitiesTest, DateTest, PersonMethodsTest, WorkerTest, InternacionalizationTest, MathHotelTest, RegisterTest, AESSymetricCryptoTest, ClientTest, HiloWorkTest
* Ficheros: MessagesBundle_de_DE, MessagesBundle_en_US, MessagesBundle_es_ES, MessagesBundle_fr_FR, MyFileReader

### Main

Al ejecutar el programa lo primero que sale es un menú informativo con lo que puede hacer el programa y la fecha actual:

![menu_principal_nuevo](https://user-images.githubusercontent.com/43043718/101259689-9d2c1c80-372a-11eb-9ba0-121cc3a5510b.png)

Primero sale un menú donde aparece las opciones para el inicio de sesión.

![menu de registro](https://user-images.githubusercontent.com/43043718/100026953-0ab38100-2dec-11eb-8819-704e437d3e94.png)

 * He probado a introducir varios usurios y esta es la lista de visualización de ellos:
 
 ![lista de usuarios](https://user-images.githubusercontent.com/43043718/100026985-1acb6080-2dec-11eb-9383-4456e5e0d5e4.png)
 
 Si el usuario y la contraseña coinciden con alguno de los que están registrados entra dentro del menu de trabajador o de cliente

 **Cliente:
Si elegimos cliente se puede ver cómo aparecerá un submenú 

![cliente](https://user-images.githubusercontent.com/43043718/98460629-53412c80-21a6-11eb-8315-0592a6bfe0fe.png)

El objetivo principal es que el cliente pueda ver todos los hoteles disponibles con sus características para después reservar el número de habitaciones que desee y después en su cuenta se verá reflejado el dinero que se ha gastado.

 **Trabajador:
 Si hemos seleccionado esta opcion nos saldrá por pantalla un submenú con un inicio de seseión igual al del empleado, en el cual si el usuario y contraseña coinciden aparecerá otro submenú que nos preguntara si somos empleados o propietarios de un hotel.
 - Los EMPLEADOS pueden buscar empleados, mostrar todos los empleados o calcular el sueldo según el puesto de trabajo que tengan
 
 ![empleado](https://user-images.githubusercontent.com/43043718/98460663-9bf8e580-21a6-11eb-9c5d-a5ee9f8a6053.png)
 
 - Los PROPIETARIOS pueden ver a todos los empleados y a los hoteles, añadir nuevos hoteles, contratar o despedir empleados, buscar a un empleado en concreto y cambiar de idioma
 
 ![propietario](https://user-images.githubusercontent.com/43043718/98460674-b632c380-21a6-11eb-893c-126c6aad4da0.png)
 
 * Nota: el precio de las habitaciones tanto Suit cómo Standard es noche/persona.
 
 ## ¿Para qué mejorar la interface o la refactorización del código?
 
 Supongamos que debemos de enseñar nuestro código a unos clientes que nos han contratados pero debemos de explicarles por qué es necesaio mejorar la interface del código:
  * Ahora que llevamos nuestro proyecto de gestión de hoteles bastante avanzado de cara a un mantenimiento y actualización futuro, lo mejor sería dejar de hacer durante un tiempo código para centrarnos en mejorar la interface del mismo y pasar a la refactorización.
  * Esto quiere decir que tendremos algunos métodos de nuestro programa encapsulados haciendo que tengamos algunas ventajas cómo la de una mejor organización de la programación, si lo necesitamos en un futuro poder tener constantes para utilizarlas en cualquier clase, reutilizar código, es decir, tener en algunas clases los mismos métodos con nombre y parámetros iguales. Todo esto se lo ofrecemos para garantizar el mejor funcionamiento del programa.
  * Y para el tema de refactorización es simplemente poder ver el código de una manera más limpia y sencilla.

