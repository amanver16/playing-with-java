# Java 8: Closures
As per the Mozilla Developer Network (MDN),

> A closure is a special kind of object that combines two things: a function, and the environment in which that function was created.  

![Closures](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Closures%20Java%208.jpg)  

In other words, the closure remembers the variables in the environment in which it was created. In Java, closures can be implemented using Lambdas. Let us discuss this with an example. Suppose we have a class **ClosureExample** as follows: 

```Java
public class ClosureExample {
    public static Function<Integer, Integer> closure() {
        int a = 10;
        Function<Integer, Integer> function = t -> {
            return t * a; // a is available to be accessed in this function
        };
        return function;
    }
}
```

This class consists of a function **closure()**, which returns a type of **java.util.function.Function**. In the previous example, variable a is in the scope of the function **closure**, so it is available to be accessed inside this function.  

Then we have a nested function named **function** of type **java.util.function.Function**. This function takes an integer and multiplies it with **a** and returns the result. Then at last we are returning the nested function.  

So according to the rules of scope, the value of a should vanish once a **closure()** call is finished. However, it is not the case. Let's call this function another class:

```Java
public class ClosureDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> closure = ClosureExample.closure();
        list.stream().map(closure).forEach(n -> System.out.print(n + " "));
    }
}
```  

If you run it, it multiplies every value by 3 and produces the following output:  

```Text
10 20 30 40 50
```

So the nested function in the function **closure()** is an example where it has taken a snapshot of the environment it was created in and then it is able to access the variable **a** which was in scope when it was created.  

However, one interesting thing to note with closures is the Java. Any variable, which it uses and is defined outside its definition, it assumes that variable to be final or effectively final. So, in other words, in the example given previously, if you try to change the value of **a** inside the nested function, **function** then the compiler  will not allow it:  

```Java
int a=3;
Function<Integer, Integer> function = t->{
    // a++ // will not compile
    return t*a; // a is available to be accessed in this function
};
```

If you try to change the value compiler will throw an error saying: **Local variable a defined in an enclosing scope must be final or effectively final**.

## About Project
The project describes uses of Closures in different scenarios.  

## How to Run 
Compile and run using provided main class.