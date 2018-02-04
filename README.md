This is the repository maintained as a part of CS5200(Database Management System) spring course at Northeastern University.

It is a Java based web application built using Spring framework.

Repo is hosted online at : [Amazon Elastic Beanstalk](http://cs5200-spring2018-singh.us-east-1.elasticbeanstalk.com/)

* Note: Do create an application.properties file in src/main/resources folder with the credentials before running the application. Below is the code snippet that might help :

```
spring.datasource.url=jdbc:mysql://SERVER/SCHEMA
spring.datasource.username=USERNAME
spring.datasource.password=PASSWORD
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.datasource.testWhileIdle=true
spring.datasource.validationQuery=SELECT 1
```


