# Hotel management
_Hotel management simulator for Spain_

## Introducción
_In this repository the Java practices of the Advanced Programming Techniques course._

For this fourth practice I have added file reading using the "ReadBossHotels" class, which reads an example of some of the hotel owners stored in a text file. I have also added the crypto library; in which the owner's menu is encrypted and then decrypted to see its options. I have modified the IRegister class (interface) and I have put it with generics to be able to introduce any type of data. Finally I have added Threads to make a simulation of how long it would take to complete the reservation of several rooms a receptionist with a client, with their execution times.

There is also a parent class (Ecommerce) and it inherits from a child (Hotel), both with their corresponding getters and setters.
I have created another parent class (Worker) and it inherits from a daughter (Employee), just like the previous one, with its corresponding getters and setters.
It also has a class "BookRoom" and another "PersonMethods" where the main functions are made.
Other classes that I have also used are "Date", "Internationalization", "Read", "Cities".
So that the main is better organized I have created a class "Menus" where I have all the necessary menus.

I have added an interface class (IRegister) that serves to create a login for the client and workers now with generics.
And the Register class where it is verified that the ID of an already registered user matches the password assigned by the same, if so you can log in as a client or as a worker.

I also added a MathHotel class that calculates the total money of the app.
And a client class that stores the name of the client used for the Threads and the purchase times.

The hotels are stored in an Array in the BookRoom class and are instantiated in the main, thus loading all the attributes of the hotels.
The employees is similar to the previous one except that they are stored in a PersonMethods class.

In addition, since it has internationalization, it has the possibility of changing to other languages.
(The photo has a piece of each language to visualize quickly how it would look like):

* Spanish
* English
* German
* French

![trozos_menu](https://user-images.githubusercontent.com/43043718/98460803-b4b5cb00-21a7-11eb-8582-aee66961c0bd.png)

### Code
_The code includes the following:_

* Clases: Ecommerce (Hotel), BookRoom, Read, Menus, PrincipalMenu, Cities, Date, Employee, Internacionalization, PersonMethods, Worker, IRegister, MathHotel, Register, AESSymetricCrypto, Client, HiloWork, ReadBossHotels
* Tests: BookRoomTest, EcommerceTest, HotelTest, CitiesTest, DateTest, PersonMethodsTest, WorkerTest, InternacionalizationTest, MathHotelTest, RegisterTest, AESSymetricCryptoTest, ClientTest, HiloWorkTest
* Ficheros: MessagesBundle_de_DE, MessagesBundle_en_US, MessagesBundle_es_ES, MessagesBundle_fr_FR, MyFileReader

### Main

When running the program the first thing that comes up is an informative menu with what the program can do and the current date:

![menu_principal_nuevo](https://user-images.githubusercontent.com/43043718/101259689-9d2c1c80-372a-11eb-9ba0-121cc3a5510b.png)

First, a menu appears with the login options.

![menu de registro](https://user-images.githubusercontent.com/43043718/100026953-0ab38100-2dec-11eb-8819-704e437d3e94.png)

 * I have tried entering several usernames and this is the display list of them:
 
 ![lista de usuarios](https://user-images.githubusercontent.com/43043718/100026985-1acb6080-2dec-11eb-9383-4456e5e0d5e4.png)
 
 If the user and password match any of the registered users, enter the employee or customer menu.

### * Option 1

 ** Client:
If we choose customer, we can see how a submenu will appear 

![cliente](https://user-images.githubusercontent.com/43043718/98460629-53412c80-21a6-11eb-8315-0592a6bfe0fe.png)

The main goal is that the customer can see all available hotels with their details and then book the number of rooms you want and then in your account will be shown the money you have spent.

### * Option 2

 ** Worker:
 If we have selected this option we will get by screen a submenu with a login equal to that of the employee, in which if the user and password match will appear another submenu that will ask us if we are employees or owners of a hotel. 
 - EMPLOYEES can search for employees, show all employees or calculate the salary according to their job position.
 
 ![empleado](https://user-images.githubusercontent.com/43043718/98460663-9bf8e580-21a6-11eb-9c5d-a5ee9f8a6053.png)
 
 - OWNERS can view all employees and hotels, add new hotels, hire or fire employees, search for a specific employee, change language and view a list of owners saved in a text file. The menu is first encrypted and then decrypted.
 
 ![menu_encriptado_propietario](https://user-images.githubusercontent.com/43043718/101259796-61de1d80-372b-11eb-81a0-13a5c25b424a.png)
 
 List of owners:
 
 ![lista_propietarios](https://user-images.githubusercontent.com/43043718/101259977-d9f91300-372c-11eb-9fae-ea193ecba967.png)
 
 * Note: the price of both Suit and Standard rooms is per night/person.
 
 ### * Option 3
 
 * Simulation of shopping times when a customer books a room:
 
 ![tiempos_hilos](https://user-images.githubusercontent.com/43043718/101259925-60f9bb80-372c-11eb-90be-07d2ec6752b4.png)
  
  ## Class diagram
_Visualization of how the diagram of the class diagram of practice 3 would look like:_
![esquema diagrama de clases practica3_page-0001](https://user-images.githubusercontent.com/43043718/100024921-0a18eb80-2de8-11eb-937e-0c8903167a26.jpg)

* To see the attributes of each class you can see it in the following link:
https://github.com/mgh99/Practica-Java/tree/main/images/Diagrama_de_clases
 
 ## Why improve the interface or code refactoring?
 
Let's suppose that we have to show our code to some clients who have hired us but we have to explain to them why it is necessary to improve the code interface:
* Now that we have our hotel management project well advanced for future updates and maintenance, the best thing to do would be to stop coding for a while to focus on improving the interface of the code and refactoring.
* This means that we will have some methods of our program encapsulated making us have some advantages such as a better organization of programming, if we need in the future to have constants for use in any class, reuse code, ie, have in some classes the same methods with the same name and parameters. All this we offer to ensure the best performance of the program.
* And for the refactoring issue is simply to be able to see the code in a cleaner and simpler way.
