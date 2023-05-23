SELECT 
    lastName, 
    firstName, 
    jobTitle
FROM
    employees;


SELECT * 
FROM employees;

SELECT 1 + 1;    

SELECT NOW();

SELECT CONCAT('John',' ','Doe');

-- column alias
SELECT expression AS column_alias;
SELECT CONCAT('John',' ','Doe') AS name;
SELECT CONCAT('Jane',' ','Doe') AS 'Full name';
