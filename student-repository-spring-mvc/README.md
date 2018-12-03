# Student Repository using Spring MVC

## Introduction to Spring Web MVC framework

The Spring Web model-view-controller (MVC) framework is designed around a **DispatcherServlet** that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler is based on the **@Controller** and **@RequestMapping** annotations, offering a wide range of flexible handling methods. After **Spring 3.0**, the @Controller mechanism also allows you to create **RESTful** Web sites and applications, through the **@PathVariable** annotation and other features.  

> **“Open for extension...”**  
A key design principle in Spring Web MVC and in Spring in general is the **“Open for extension, closed for modification” principle**.  
Some methods in the core classes of Spring Web MVC are marked **final**. As a developer you cannot override these methods to supply your own behavior. This has not been done arbitrarily, but specifically with this principle in mind.  
You cannot add advice to final methods when you use Spring MVC. For example, you cannot add advice to the AbstractController.setSynchronizeOnSession() method.  

![Spring MVC](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Spring%20MVC%20Architecture.png)

* **Model :** The Model encapsulates the application data and in general they will consist of POJO.
* **View :** The View is responsible for rendering the model data and in general it generates HTML output that the client's browser can interpret.
* **Controller :** The Controller is responsible for processing user requests and building an appropriate model and passes it to the view for rendering.
* **Dispatcher Servlet :** The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that handles all the HTTP requests and responses.  

Other components, i.e. **HandlerMapping** and **ViewResolver** are parts of **WebApplicationContext**. Which is an extension of the **plainApplicationContext** with some extra features necessary for web applications.

## About Project
This project demonstrates uses of SpringMVC in StudentRepository Web Application.

## Technologies Used
* Spring MVC v5.1.3.RELEASE
* JDK v1.8
* Servlet v3.0.1
* JSP v2.3.1
* JSTL v1.2
* MSSql JDBC Driver v6.2.2.jre8
* Maven 3.5 or later
* Junit v4.11
* Lombok v1.18.4

## How to Run
* Change the database credentials in **JdbcConnection.java**
* Create required table. Script is available in **src/main/resources/student.sql** file.
* Build the project using maven build command.  
**mvn clean install**
* Copy the WAR file from **target** folder and deploy on any server (tomcat, jboss, wild-fly etc).
* After deploying, open browser and type **localhost:8080/StudentRepository** and press Enter.