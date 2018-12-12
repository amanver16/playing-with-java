# Liskov Substitution Principle

The project demonstrates the popular software design principle i.e. Liskov Substitution Principle. The LSP principle is a part of __S.O.L.I.D.__ principles which represents third letter L. SOLID principle was introduced by **Robert.C Martin** also known as **"Uncle Bob"**. More about [LSP](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Java/Liskov%20Substitution%20Principle%20-%20SOLID%20Principles.pdf).

The principle states,

> In a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S (i.e., objects of type S may substitute objects of type T) without altering any of the desirable properties of that program (correctness, task performed, etc.)   

LSP also can be described as,

> Methods that use references to the base classes must be able to use the objects of the derived classes without knowing it. In simple words, derived classes must be substitutable for the base class.  

The project demonstrates the principle using an example of dancers and non dancers where there super class is people. If we define the dance() method in People class then the class will break when Non Dancers instantiate it. So, the solution is to separate the properties and create a hierarchy in such way so that Super Class shouldn't be modified later. Violation of LSP is also violation of Open closed Principle. 