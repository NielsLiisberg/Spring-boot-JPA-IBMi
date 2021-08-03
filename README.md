# Spring-boot-JPA-IBMi
Example of Spring boot microservice with JPA and IBM i as datasource


This is basically an initial project created by spring.io, however I have added all the 
boilerplate for getting you up and running with Spring Boot and the IBM i as 
the datasource which will showcase access to a very old "file" on the IBM i.

This is a Gradle project so all required dependencies are being setup and ready in 
the **build.gradle** file.

You can also take a closer look at **/resources/application.properties** 
and see what it takes to configure your runtime environment.


## Project outline
In that Java source root you will find **Application**. Spring Boot is so kind to read all 
subdirectories and instantiate classes assisted by the annotations you will find in 
classes in the subdirectories.

Lets go through these classes - bottom up.

## Models
Here we have the mapping layer between Db2 and the JPA - The Java Persistence 
Architecture. You will find the old names, and the mapped names used in Java.

by purpose, I have used the old and ugly *QCUSTCDT* file, so you can see you can use 
my git project for transformation projects in the future. 

## Repositories
In the repositories you find the I/O functionality - the queries. The basic repo 
inherits from a CRUD ( Create/Read/Update/Delete) - functionality, however you 
can extend with all kind of you own access. I have here showcased 
JPQL - which is almost SQL but using the entity model. That means - 
you can use all the nice names.

## Controller
The controller is where you describe your endpoints - the URL you are referring 
to from your client code.

## Try it out 

You have to set environment variables according to your
system like this:

```
HOST=MYIBMI;USERID=MYNAME;PASSWORD=mysecret;PORT=8888;LIBL=QIWS
```

Then you can start the service. When you open your browser 
then you can refer to this URL and see if it works:
```
http://localhost:8888/api/customerSearch?search=
```
Notice that the logging is set to a level so you can examine what real SQL statements 
running against the Db2 database. That ofcause can be changed if you open the **/resources/application.properties**
and modify the **SQL logging**  tag


