

### Adapter Design Pattern 

* It is a bridge between existing interface and expected interface. 

* An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".

* In other words, to provide the interface according to client requirement while using the services of a class with a 
* different interface.

* The Adapter Pattern is also known as Wrapper.


### Advantage of Adapter Pattern
* It allows two or more previously incompatible objects to interact.
* It allows re-usability of existing functionality.

### Usage of Adapter pattern:
It is used:

* When an object needs to utilize an existing class with an incompatible interface.
* When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
* When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.



### FLOW - 

- Client   

- AdapterInterface 
  - ConcreteAdapter  has an ExistingInterface 

- ExistingInterface (Adaptee)



### Examples- 
* Power Adapter (client) and Socket (Exisiting Interface or adaptee )
* XML to Json Parser 
    * Client wants Json 
    * Adapter Conversion of XML to Json. 
    * Server Return XML  

* Weight Machine 
  * Weight Machine return weights in pound.
  * Client wants to see weight in KG. 
  * Bring an Adapter to convert pound to KG .. 
  * Client Talks to Adapter , adapter talks to server. 
  * 

