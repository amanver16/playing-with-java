# Junit Demo

Junit is a tool to **Unit Test** java code.

# Steps to Unit Test

* Add the maven dependency for Junit.  
	```xml
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>4.11</version>
		<scope>test</scope>
	</dependency>
	```
* Write unit tests in **src/test** directory.
* The unit test file name should be **ClassNameTest.java**. Where ClassName is class under test. It is not mandatory, but a best practice to easily recognize unit test for a particular class. For example, if class under test name is **MyClass.java**, then name the junit test file name as **MyClassTest.java**
* Tests are annotated with **@Test** annotations.
* Run the test to see the results.