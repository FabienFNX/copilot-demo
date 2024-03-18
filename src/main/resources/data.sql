/*
Create a table for customers named customer with : 
- id as a primary, auto-incrementing key
- first name
- last name 
- age as integer
*/
CREATE TABLE customer (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INT
);

/*
Insert into the database 6 customers with :
- French first name 
- English last name
- Different first and last names
- age between 18 and 65
*/
INSERT INTO customer (first_name, last_name, age) VALUES ('Jean', 'Doe', 25);
INSERT INTO customer (first_name, last_name, age) VALUES ('Pierre', 'Smith', 30);
INSERT INTO customer (first_name, last_name, age) VALUES ('Paul', 'Johnson', 40);
INSERT INTO customer (first_name, last_name, age) VALUES ('Jacques', 'Williams', 50);
INSERT INTO customer (first_name, last_name, age) VALUES ('Marie', 'Brown', 60);
INSERT INTO customer (first_name, last_name, age) VALUES ('Sophie', 'Taylor', 18);

/*
Insert into the database 3 customers with : first name and last name that matches the last 3 presidents of the USA and their age when they were elected
*/
INSERT INTO customer (first_name, last_name, age) VALUES ('Donald', 'Trump', 70);
INSERT INTO customer (first_name, last_name, age) VALUES ('Barack', 'Obama', 47);
INSERT INTO customer (first_name, last_name, age) VALUES ('George', 'Bush', 54);


