# Student-Web Service (A Spring Restful Web Service)

Spring Restful Web Service is easy to implement and test. This project demonstrates spring rest and hibernate together.  
A restful application uses **HTTP Message Convertors** to send/receive request/response in various formats like **Json** etc.  

## Technology Used
* JDK 8
* Maven 3.5 or later
* Junit 4.11
* MsSql JDBC Driver 6.2.2
* Log4J2
* Spring 5.1.2
* Hibernate 3.6.0

## How To Run
* Change the database configuration based on what you are using in **hibernate.cfg.xml**, **hibernate.reveng.xml** and **StudentBean.hbm.xml**.  
* Create the required **Student** Database table.
* Create logs folder in parent directory of the project.
* Run below command to build the application :  
    **mvn clean install** // You can skip tests to avoid build failure
* Copy the .war file from target folder and deploy it on the server.

## Server Endpoints
* Add Student (RequestMethod = POST)  
    **localhost:8080/Student-Repository-Using-Spring-Rest-WebService-Maven/addStudent**

* Edit Student (RequestMethod = POST)  
    **localhost:8080/Student-Repository-Using-Spring-Rest-WebService-Maven/editStudent**

* Show Student (RequestMethod = POST)  
    **localhost:8080/Student-Repository-Using-Spring-Rest-WebService-Maven/showStudent**

* Remove Student (RequestMethod = POST)  
    **localhost:8080/Student-Repository-Using-Spring-Rest-WebService-Maven/removeStudent**

**Note :** Test the web service using **Postman** or **Curl**.