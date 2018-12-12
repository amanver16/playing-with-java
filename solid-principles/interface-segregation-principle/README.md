# Interface Segregation Principle

The project demonstrates the popular software design principle i.e. Interface Segregation Principle. The ISP principle is a part of __S.O.L.I.D.__ principles which represents fourth letter I. SOLID principle was introduced by **Robert.C Martin** also known as **"Uncle Bob"**. More about [ISP](https://en.wikipedia.org/wiki/Interface_segregation_principle).  

When we design an application we should take care how we are going to make abstract module which contains several submodules. Considering the module implemented by a class, we can have an abstraction of the system done in an interface. But if we want to extend our application adding another module that contains only some of the submodules of the original system, we are forced to implement the full interface and to write some dummy methods. Such an interface is named fat interface or polluted interface. Having an interface pollution is not a good solution and might induce inappropriate behavior in the system.

The principle states,  

> Clients should not be forced to implement interfaces they don't use. Instead of one fat interface many small interfaces are preferred based on groups of methods, each one serving one submodule.  

**Problem :**  
In this project, if all three interfaces i.e. Jumpers, Racers and Swimmers were in a single interface. Then the Classes which are implmenting this single interface would have to implement the methods they don't require. For example, Racers class had to implement methods like jump() and swim() which is not needed.

**Solution :**  
So, in this project, the single interface is separated into 3 more interfaces i.e. Jumpers, Swimmers and Racers.