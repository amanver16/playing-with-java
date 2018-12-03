# Student Repository using Vaadin Framework

## Vaadin

**Vaadin** (Finnish pronunciation: **_ˈʋɑːdin_**) is an open-source platform for **Web Application** development. The Vaadin platform includes a set of web components, a Java web framework, and a set of tools and application starters. Its flagship product, **Vaadin Flow** (previously **Vaadin Framework**) allows the implementation of HTML5 web user interfaces using the Java Programming Language.  

![Vaadin](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Vaadin%20Banner.png)

## About Project
This project uses Vaadin Frameowrk to build UI for **StudentRepository**.

## Technologies Used
* Vaadin v8.6.2
* JDK v1.8
* Servlet v3.0.1
* MSSql JDBC Driver v6.2.2.jre8
* Maven 3.5 or later
* Junit v4.11

## How to Run
* Change the database credentials in **JdbcConnection.java**
* Create required table. Script is available in src/main/resources/student.sql file.
* Build the project using maven build command.  
**mvn clean install**
* Copy the WAR file from **target** folder and deploy on any server (tomcat, jboss, wild-fly etc).
* After deploying, open browser and type **localhost:8080/StudentRepository-1.0** and press Enter.