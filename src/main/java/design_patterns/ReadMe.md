### Design Pattern

* Design patterns are typical solutions to commonly occurring problems in software design. 
* They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.


## History Of Design Pattern

* Who invented patterns? That’s a good, but not a very accurate, question. 
* Design patterns aren’t obscure, sophisticated concepts—quite the opposite.
* Patterns are typical solutions to common problems in object-oriented design. 
* When a solution gets repeated over and over in various projects, someone eventually puts a name to it and 
describes the solution in detail.  That’s basically how a pattern gets discovered.

* The concept of patterns was first described by Christopher Alexander in A Pattern Language: Towns, Buildings, Construction. 
* The book describes a “language” for designing the urban environment. The units of this language are patterns. 
* They may describe how high windows should be, how many levels a building should have, 
* how large green areas in a neighborhood are supposed to be, and so on.

* The idea was picked up by four authors: Erich Gamma, John Vlissides, Ralph Johnson, and Richard Helm.
* In 1994, they published Design Patterns: Elements of Reusable Object-Oriented Software, 
* in which they applied the concept of design patterns to programming. 
* The book featured 23 patterns solving various problems of object-oriented design and became a best-seller very quickly.
* Due to its lengthy name, people started to call it “the book by the gang of four” which was soon shortened to 
* simply “the GoF book”.

* Since then, dozens of other object-oriented patterns have been discovered. 
* The “pattern approach” became very popular in other programming fields, 
* so lots of other patterns now exist outside of object-oriented design as well.

## Advantages - 

* Design patterns are a toolkit of tried and tested solutions to common problems in software design.
* Even if you never encounter these problems, knowing patterns is still useful because
* it teaches you how to solve all sorts of problems using principles of object-oriented design.

* Design patterns define a common language that you and your teammates can use to communicate more efficiently.
* You can say, “Oh, just use a Singleton for that,” and everyone will understand the idea behind your suggestion.
* No need to explain what a singleton is if you know the pattern and its name.


## Criticism of patterns

### Kludges for a weak programming language
Usually the need for patterns arises when people choose a programming language or a 
technology that lacks the necessary level of abstraction.
In this case, patterns become a kludge that gives the language much-needed super-abilities.

For example, the Strategy pattern can be implemented with a simple anonymous (lambda) function 
in most modern programming languages.

### Inefficient solutions
Patterns try to systematize approaches that are already widely used.
This unification is viewed by many as a dogma, and they implement patterns “to the letter”,
without adapting them to the context of their project.

### Unjustified use
If all you have is a hammer, everything looks like a nail.
This is the problem that haunts many novices who have just familiarized themselves with patterns.
Having learned about patterns, they try to apply them everywhere, even in situations where simpler code would do just fine.



### Types of Pattern 

* The most basic and low-level patterns are often called idioms. They usually apply only to a single programming language.

* The most universal and high-level patterns are architectural patterns. Developers can implement these patterns in virtually any language. Unlike other patterns, they can be used to design the architecture of an entire application.

* In addition, all patterns can be categorized by their intent, or purpose.
* Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code.
* Structural patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.
* Behavioral patterns take care of effective communication and the assignment of responsibilities between objects.



### Questions? 

#### Difference between design pattern and algorithms?
Answer :


#### Should we know all design Pattern?
Sol: Yes

#### Should we use all design Pattern in one project?
Sol: NO

* Design Pattern Should be used as per the requirement.

* If You want to get the object, and need help with creating the object [ Creational Design Pattern]
* If you want to compose object, that is say you have one object, and you want to include one more object
  inside it, Obj1 have some features, Obj2 have some feature, and you want to use Obj1's feature from Obj2
  [Structural Design Pattern]
* Communication Between Different Objects [ Behavioral Design Pattern.]

