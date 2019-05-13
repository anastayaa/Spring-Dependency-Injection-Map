# Spring-Dependency-Injection-Map
Spring Dependency Injection with Map + Maven

Constructor Injection with Map

If there is HAS-A relationship between the classes, we create the instance of dependent object (contained object) first then pass it as an argument of the main class constructor. Here, our scenario is one question can have multiple answers. The Answer class object will be termed as the dependent object.

In this project, we are using map as the answer that have Answer and User. Here, we are using key and value pair both as an object. Answer has its own information such as answerId, answer and postedDate, User has its own information such as userId, username, emailId.
