# Open Closed Principle

The project demonstrates the popular software design principle i.e. Open Closed Principle. The OCP principle is a part of __S.O.L.I.D.__ principles which represents second letter O. SOLID principle was introduced by **Robert.C Martin** also known as **"Uncle Bob"**. More about [OCP](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle).

The principle states,

> Software entities like modules, classes, functions should be Open For Extension but Closed for Modification. 

Which means a software entities should be designed in such a way, so the existing code should not be modified rather it can be scaled. That means we must provide abstract implementation rather than concrete such as make use of interfaces.

Before explaining the project, let's take an example

The project demonstrates the principle using an example of shapes. There is an interface **ShapeArea** which have a method named calculateArea(). The job of this method is to calculate the area, no matter what kind of shape it is.  

In this project, the method calculateArea() can be used to calculate area of any shape. A class just need to provide the definition of calculateArea() according to the shape. So, the interface ShapeArea is open for extension but closed for modification.  