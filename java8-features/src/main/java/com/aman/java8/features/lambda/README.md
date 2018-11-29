# Java 8 Lambda Expression

Lambda Expression was introduced in Java 8. It represents a functional interface with an expression. It is very powerful feature when used with collections. It can easily filter, sort, iterarte data in collections. Lambda expression can be used for any purpose. It saves a lot of code and time.

> A lambda expression is just an anonymous function, i.e. a function with no name and is not bound to any identifier, so can be used anywhere like an expression.  

![Lambda Expressions Java 8](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Lambda%20Expressions%20Java%208.jpg)  

**Functional Interface :**  
Functional Interface is an interface which has exactly one method. In java, a functional interface can be represented using @FunctionalInterface annotation. However this annotation is optional, because Java automatically detects an interface as functional interface if it has only one method.

**Higher Order Functions :**  
Higher order functions are functions are functions, which either accepts function as argument or return a function. Lambda expressions are required to implement higher order functions.

**Syntax :**  
> (arguments-list) -> { body }  
OR  
> (argument-list) -> (statement)  
OR  
> () -> {body}

1. **Argument List** represents the arguments of the funcion body. It can be empty or non empty.
2. **Arrow symbol** is used to link *Argument List* and *Body*
3. **Body** it contains expression, business logic, or statements of Lambda Expresion.

## Characteristics of Lambda Expression

**Optional Type Declaration :**
The data type of argument list is optional. If not provided, compiler automatically determines the data type from arguments value.

> (a,b) -> (a+b)

**Optional Paranthesis around Argument List :**
The paranthesis around argument list is optional, if and only if the argument list has exactly one argument. If it has no argument or multiple arguments, then the paranthesis are required.

> a -> (a*a)   
> (int a, int b) -> {return a+b; }    

**Optional Curly Braces :**
The lambda expression body does not require curly braces if the expression body has only one statement. One statement can be defined within paranthesis. The paranthesis for one line statement expression body is also optional. For multiple statement in body, the curly braces are required.

> (int a, int b) -> (a+b)  
> (int a, int b) -> a+b

**Optional Return Keyword :**
The expression body may or may not declare return keyword. If the body with multiple starement returns a value, then the body must be defined within curly braces. For single line statement within paranthesis, the lambda expression automatically returns the value.

> (int a, int b) -> (a+b)  
> (int a, int b) -> {return a+b; }

## History of Lambdas
The lambda expressions in Java 8 make use of [Lambda Calculas](https://en.wikipedia.org/wiki/Lambda_calculus), which was introduced by mathematician [Alonzo Church](https://en.wikipedia.org/wiki/Alonzo_Church) as part of the research on foundations of mathematics. The lambda calculas is base for functional programming or computation. The idea of **Higher Order Functions** accepting other functions came from lambda calculas. Lambda calculas is a **Turing Complete** formal way to represent a mathematical computation. Turing complete means any mathemtical computation can be represented using lambdas.

## About Project
The project describes uses of Lambda expression in different scenarios.  

## How to Run 
Compile and run using provided main classes.
