# Dependency Inversion Principle

The project demonstrates the popular software design principle i.e. Dependency Inversion Principle. The DIP principle is a part of __S.O.L.I.D.__ principles which represents fifth letter D. SOLID principle was introduced by **Robert.C Martin** also known as **"Uncle Bob"**. More about [DIP](https://en.wikipedia.org/wiki/Dependency_inversion_principle).   

As a Java programmer, you’ve likely heard about code coupling and have been told to avoid tightly coupled code. Ignorance of writing “good code” is the main reason of tightly coupled code existing in applications. As an example, creating an object of a class using the new operator results in a class being tightly coupled to another class. Such coupling appears harmless and does not disrupt small programs. But, as you move into enterprise application development, tightly coupled code can lead to serious adverse consequences.  

When one class knows explicitly about the design and implementation of another class, changes to one class raise the risk of breaking the other class. Such changes can have rippling effects across the application making the application fragile. To avoid such problems, you should write “good code” that is loosely coupled, and to support this you can turn to the Dependency Inversion Principle.  

The principle states,  

> **A.** High-level modules should not depend on low-level modules. Both should depend on abstractions.   
> **B.** Abstractions should not depend on details. Details should depend on abstractions.  

Conventional application architecture follows a top-down design approach where a high-level problem is broken into smaller parts. In other words, the high-level design is described in terms of these smaller parts. As a result, high-level modules that gets written directly depends on the smaller (low-level) modules.  

What Dependency Inversion Principle says is that instead of a high-level module depending on a low-level module, both should depend on an abstraction. Let us look at it in the context of Java through this figure.  

![Dependency Inversion Principle](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Dependency%20Inversion%20Principle.png)

**Problem :**  
In this project, if we hardcode JavaEditor class into IDE class. Then the IDE is bound to only edit Java specific code. We don't want that. The IDE must be able to edit any language code.

**Solution :**  
So, the solution is to make an abstraction of Editor as an interface and both IDE and JavaEditor or CppEditor depends on Editor interface. Now IDE is able to edit any code.