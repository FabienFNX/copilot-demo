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

