# Prompts associés à la formation

## Interaction classique à l'aide de commentaires

```SQL
// Q : What are SOLID principles ?
```

## Utilisation pour créer une table de clients

```SQL
/*
Create a table for customers named customer with : 
- id as a primary, auto-incrementing key
- first name
- last name 
- age as integer
*/
```

## Ajouter des données dans la base

### Exemple 1 :

```SQL
/*
Insert into the database 6 customers with :
- French first name 
- English last name
- Different first and last names
- age between 18 and 65
*/
```

### Exemple 2 :

```SQL
/*
Insert into the database 3 customers with : first name and last name that matches the last 3 presidents of the USA and their age when they were elected
*/
```

## Utiliser le Chat Local

### Création d'un fichier Java depuis une table SQL

```md
Create a java class from this code using Spring JPA annotations
```

### Modification du code produit

```md
Using Jakarta import instead
```

```md
Transform the code to use lambok
```

## Utiliser le Chat

### Pour obtenir des informations générales

```Python
What are the SOLID principles ?
```

### Générer un repository en utilisant une classe Java

```Python
Generate a spring repository for Customer using CRUD Repository
```

### Générer un controller Rest en utilisant une classe Java

```Python
Create a Spring REST API Controller for customer using CustomerRepository
```

## Debug avec Copilot

### Correction en précisant le code qui n'est pas bon

```Python
@workspace /fix #selection with #file:Customer.java
```

### Correction à partir de logs

```Python
2024-03-18T19:08:07.924+01:00  INFO 51304 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-03-18T19:08:07.924+01:00  INFO 51304 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.19]
2024-03-18T19:08:08.000+01:00  INFO 51304 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext 2024-03-18T19:08:08.019+01:00  INFO 51304 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1489 ms
2024-03-18T19:08:08.093+01:00  WARN 51304 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'dataSourceScriptDatabaseInitializer' defined in class path resource [org/springframework/boot/autoconfigure/sql/init/DataSourceInitializationConfiguration.class]: Unsatisfied dependency expressed through method 'dataSourceScriptDatabaseInitializer' parameter 0: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception with message: Failed to determine a suitable driver class
2024-03-18T19:08:08.096+01:00  INFO 51304 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2024-03-18T19:08:08.112+01:00  INFO 51304 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2024-03-18T19:08:08.152+01:00 ERROR 51304 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
```

```Python
Correct with h2 database
```

## Génération de la documentation avec Copilot

### Java Doc

```Python
/doc
```

```Python
/doc for the class and all methods
```

### Documentation

```Python
@workspace /explain like I am 5 years old
```

## Utilisation des agents

```Python
@workspace Where should I add the attribute weight ?
```

```Python
@terminal run a spring application
```

## Mise en place de tests unitaires

```Python
/tests
```

## Génération d'un code Angular

```Python
Generate Angular Service that calls the endpoints in #file:CustomerController.java
```