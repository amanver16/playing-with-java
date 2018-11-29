# Java 8: Method References

Method refrences are very useful feature introduced in Java 8. Method references are used to refer a method using lambda expression. A functional interface can be referenced to other methods instead providing implementation in the lambda expression itself.

> The method references make use of simplified version of lambda expression, which uses **::** delimeter instead of **->** operator.  

The method references are catogerized in following: 

**Static Method Reference :**  
Static method refrence provide refrence to a static methods.  

**Syntax:** ContainingClassName::staticMethodName

**Instance Method Reference :**  
Instance method reference provide reference to non-static methods.  

**Syntax:** containingClassObjectName::nonStaticMethodName  

**Constructor Reference :**  
Constructor reference provide reference to constructor of the containing class.  

**Syntax:** ContainingClassName::new  

![Method References in Java 8](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Method%20Refrences%20in%20Java%208.jpg)  

## About Project
The project describes uses of Method References in different scenarios.  

## How to Run 
Compile and run using provided main classes.
