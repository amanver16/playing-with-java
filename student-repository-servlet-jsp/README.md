# Student Repository using Servlet/JSP

## Servlet

A servlet is a Java programming language class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers. For such applications, Java Servlet technology defines HTTP-specific servlet classes.  

The **javax.servlet** and **javax.servlet.http** packages provide interfaces and classes for writing servlets. All servlets must implement the Servlet interface, which defines life-cycle methods. When implementing a generic service, you can use or extend the **GenericServlet** class provided with the Java Servlet API. The **HttpServlet** class provides methods, such as **doGet** and **doPost**, for handling HTTP-specific services.

## JSP

Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases.  

An HTML page that contains a link to a Java servlet is sometimes given the file name suffix of **.JSP**.  


![Servlet JSP](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Servlet%20JSP.PNG)  


## About Project
The project demonstrates a web application using Servlet/JSP and JDBC using Student Repository Example.


## Technology Used

* JDK v1.8
* Servlet v3.1.0
* JSP v2.3.1
* MSSql JDBC Driver v6.2.2.jre8
* Maven 3.5 or later

## How To Run

* Change the database credentials in **JdbcConnection.java**
* Create required table. Script is available in **src/main/resources/student.sql** file.
* Build the project using maven build command.  
**mvn clean install**
* Copy the WAR file from **target** folder and deploy on any server (tomcat, jboss, wild-fly etc).
* After deploying, open browser and type **localhost:8080/StudentRepository-1.0** and press Enter.