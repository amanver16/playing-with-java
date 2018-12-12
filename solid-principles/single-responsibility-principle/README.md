# Single Responsibility Principle

The project demonstrates the popular software design principle i.e. Single Responsibility Principle. The SRP principle is a part of __S.O.L.I.D.__ principles which represents first letter S. SOLID principle was introduced by **Robert.C Martin** also known as **"Uncle Bob"**. More about [SRP](https://en.wikipedia.org/wiki/Single_responsibility_principle).

The principle states,

> A class should have only one reason to change. OR A class should have only one responsibility.

So, a class should perform only one task, which makes it easier to read, maintain, test, debug and many more benefits.

I have implemented a simple e-commerce application. This project is not about how an e-commerce web-site works, it just explains the idea behind Single Responsibility Principle. The application performs only two tasks:

1. Place an order.
2. Calculate bill for the placed order.

As you can see I have implemented both the services in separate classes i.e. **PlaceOrderService** and **CalculateBillService**. PlaceOrderService receives purchased items list as an input and places the order. So the class performs only one task. In other words, it has only one responsibility, just to place the order. Only one responsibility doesn't mean you should have only one method in a single class. If multiple methods are implemented to define a single functionality, such as "Placing the Order". Then the class design does not violate the rules of SRP.

If we talk about beans I have used. they also define only one task i.e. they define their properties and their behavior. There is no other business logic inside them.

Same thing we can say about the controller classes.
