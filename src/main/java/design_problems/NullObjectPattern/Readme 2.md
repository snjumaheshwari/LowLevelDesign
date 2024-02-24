### Null Object patten [Complete]

* In order to avoid null checks, we can use this pattern.
* Create a dummy null class, with default behaviour or doing nothing implementation. 
* Inherit the original class and dummy null class form same parent class.
* A null object replaces NULL return type.
* 
* Problem statement - 

* You have a car (vehicle ) class with some seating capacity. 
* This object can be null, but you don't want to add null checks everywhere, instead have default behaviour for the same.
* How would you do it? 


* Solution - 
* Create a Parent Vehicle Interface with the required methods. 
* Create the concrete child class for car and for null object and implement methods in both. 
* Create a Factory having getVehicle method, For producing cars or nullobject. 
