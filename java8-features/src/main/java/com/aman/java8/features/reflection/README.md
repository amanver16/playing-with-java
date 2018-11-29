# Java 8: Method Parameter Reflection
Java provides a new feature in which you can get the names of formal parameters of any method or constructor. The java.lang.reflect package contains all the required classes like Method and Parameter to work with parameter reflection.  

![Method Parameter Reflection](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Method%20Parameter%20Reflection%20Java%208.jpg)  
 
## About Project
The project describes uses of **Method Parameter Reflection** in different scenarios.  

## How to Run 
1. Compile the **Calculator.java** by using **-parameters** compiler option.  
**_javac -parameters Calculator.java_**  
> **_-parameters_** flag in the above command is used to store parameters in the Calculate class file. By default .class does not store parameters and returns argsN as parameter name, where N is a number of parameters in the method.  
2. Run the main class **MethodParemeterReflection.java**.  

## Method Class
It provides information about single method on a class or interface. The reflected method may be a class method or an instance method.
### Method Class Methods
| **Method** | **Description** |
| ------------- | --------------- |
| public boolean equals(Object obj) | It compares this Method against the specified object. It returns true if the objects are the same. Two Methods are the same if they were declared by the same class and have the same name and formal parameter types and return type. |
| public AnnotatedType getAnnotatedReturnType() | It returns an AnnotatedType object that represents the use of a type to specify the return type of the method/constructor. |
| public <T extends Annotation> T getAnnotation(Class<T> annotationClass) | It returns this element's annotation for the specified type if such an annotation is present otherwise returns null. NullPointerException - if the given annotation class is null |
| public Annotation[] getDeclaredAnnotations() | It returns annotations that are directly present on this element. This method ignores inherited annotations. If there are no annotations directly present on this element, the return value is an array of length 0. The caller of this method is free to modify the returned array. it will have no effect on the arrays returned to other callers. |
| public Class<?> getDeclaringClass() | It returns the Class object representing the class or interface that declares the executable represented by this object. |
| public Object getDefaultValue() | It returns the default value for the annotation member represented by this Method instance. |
| public Class<?>[] getExceptionTypes() | It returns an array of Class objects that represent the types of exceptions declared to be thrown by the underlying executable represented by this object. |
| public Type[] getGenericExceptionTypes() | It returns an array of Type objects that represent the exceptions declared to be thrown by this executable object. It returns an array of length 0 if the underlying executable declares no exceptions in its throws clause. It throws following exceptions: GenericSignatureFormatError - if the generic method signature does not conform to the format specified in The Java Virtual Machine Specification. TypeNotPresentException - if the underlying executable's throws clause refers to a non-existent type declaration. MalformedParameterizedTypeException - if the underlying executable's throws clause refers to a parameterized type that cannot be instantiated for any reason. |
| public Type[] getGenericParameterTypes() | It returns an array of Type objects that represent the formal parameter types. It throws following exceptions: GenericSignatureFormatError - if the generic method signature does not conform to the format specified in The Java Virtual Machine Specification. TypeNotPresentException - if any of the parameter types of the underlying executable refers to a non-existent type declaration. MalformedParameterizedTypeException - if any of the underlying executable's parameter types refer to a parameterized type that cannot be instantiated for any reason. |
| public int getModifiers() | It returns the Java language modifiers for the executable represented by this object. |
| public String getName() | It returns the name of the method represented by this Method object as a String. |
| public Annotation[][] getParameterAnnotations() | It returns an array of arrays that represent the annotations on the formal and implicit parameters, in declaration order, of the executable represented by this object. |
| public int getParameterCount() | It returns the number of formal parameters for the executable represented by this object. |
| public Class<?>[] getParameterTypes() | It returns an array of Class objects that represent the formal parameter types. in declaration order, of the executable represented by this object. It returns an array of length 0 if the underlying executable takes no parameters. |
| public Class<?> getReturnType() | It returns a Class object that represents the formal return type of the method represented by this Method object. |
| public TypeVariable<Method>[] getTypeParameters() | It returns an array of TypeVariable objects that represent the type variables declared by the generic declaration represented by this GenericDeclaration object, in declaration order. It throws GenericSignatureFormatError, if the generic signature of this generic declaration does not conform to the format specified in The Java Virtual Machine Specification |
| public int hashCode() | It returns a hashcode for this Method. The hashcode is computed as the exclusive-or of the hashcodes for the underlying method's declaring class name and the method's name. |
| public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException | It invokes the underlying method represented by this Method object, on the specified object with the specified parameters. If the underlying method is static, the specified obj argument is ignored. It may be null. If the number of formal parameters required by the underlying method is 0, the supplied args array may be of length 0 or null. If the underlying method is an instance method, it is invoked using dynamic method lookup as documented in The Java Language Specification. If the underlying method is static, the class that declared the method is initialized if it has not already been initialized. If the method completes normally, the value it returns is returned to the caller of invoke. |
| public boolean isBridge() | It returns true if this method is a bridge method. otherwise returns false. |
| public boolean isDefault() | It returns true if this method is a default method otherwise returns false. A default method is a public non-abstract instance method, that is, a non-static method with a body, declared in an interface type. |
| public boolean isSynthetic() | It returns true if this executable is a synthetic construct; returns false otherwise. |
| public boolean isVarArgs() | It returns true if this executable was declared to take a variable number of arguments; returns false otherwise. |
| public String toGenericString() | It returns a string describing this Method, including type parameters. |
| public String toString() | It returns a string. |

## Parameter Class
Parameter class provides information about method parameters, including its name and modifiers. It also provides an alternate means of obtaining attributes for the parameter.
### Parameter Class Methods
| **Method** | **Description** |
| ------------- | --------------- |
| public boolean equals(Object obj) | It compares based on the executable and the index. |
| public AnnotatedType getAnnotatedType() | It returns an AnnotatedType object that represents the use of a type to specify the type of the formal parameter represented by this Parameter. |
| public <T extends Annotation> T getAnnotation(Class<T> annotationClass) | It returns this element's annotation for the specified type if such an annotation is present, else null. It throws NullPointerException, if the given annotation class is null. |
| public Annotation[] getAnnotations() | It returns annotations that are present on this element. If there are no annotations present on this element, the return value is an array of length 0. |
| public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) | It returns annotations that are associated with this element. If there are no annotations associated with this element, the return value is an array of length 0. The difference between this method and AnnotatedElement.getAnnotation(Class) is that this method detects if its argument is a repeatable annotation type (JLS 9.6), and if so, attempts to find one or more annotations of that type by "looking through" a container annotation. It throws NullPointerException, if the given annotation class is null. |
| public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) | It returns this element's annotation for the specified type if such an annotation is directly present, else null. This method ignores inherited annotations. It throws NullPointerException, if the given annotation class is null. |
| public Annotation[] getDeclaredAnnotations() | It returns annotations that are directly present on this element. This method ignores inherited annotations. If there are no annotations directly present on this element, the return value is an array of length 0. |
| public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) | It returns this element's annotations for the specified type if such annotations are either directly present or indirectly present. This method ignores inherited annotations. If there are no specified annotations directly or indirectly present on this element, the return value is an array of length 0. The difference between this method and AnnotatedElement.getDeclaredAnnotation(Class) is that this method detects if its argument is a repeatable annotation type (JLS 9.6), and if so, attempts to find one or more annotations of that type by "looking through" a container annotation if one is present. The caller of this method is free to modify the returned array; it will have no effect on the arrays returned to other callers. It throws NullPointerException, if the given annotation class is null |
| public Executable getDeclaringExecutable() | It returns the Executable which declares this parameter. |
| public int getModifiers() | It returns the modifier flags for the parameter represented by this Parameter object. |
| public String getName() | It returns the name of the parameter. If the parameter's name is present, this method returns the name provided by the class file. Otherwise, this method synthesizes a name of the form argN, where N is the index of the parameter in the descriptor of the method which declares the parameter. |
| public Type getParameterizedType() | It returns a Type object that identifies the parameterized type for the parameter represented by this Parameter object. |
| public Class<?> getType() | It returns a Class object that identifies the declared type for the parameter represented by this Parameter object. |
| public int hashCode()mul int arg0 int arg1 add int arg0 int arg1 | It returns a hash code based on the executable's hash code and the index. |
| public boolean isImplicit() | It returns true if this parameter is implicitly declared in source code. Otherwise, returns false. |
| public boolean isNamePresent() | It returns true if the parameter has a name according to the class file, otherwise, returns false. |
| public boolean isSynthetic() | It returns true if this parameter is neither implicitly nor explicitly declared in source code. Otherwise returns false. |
| public boolean isVarArgs() | It returns true if this parameter represents a variable argument list; returns false otherwise. |
| public String toString() | It returns a string describing this parameter. The format is the modifiers for the parameter, if any, in canonical order as recommended by The Java? Language Specification. |