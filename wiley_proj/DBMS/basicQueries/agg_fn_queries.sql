-- MySQL aggregate function – AVG()
--The AVG() function calculates the average value of a set of values. It ignores NULL in the calculation.


-- calculate the average buy price of all products in the products
SELECT AVG(buyPrice) AS avg_buyPrice
FROM products;


-- calculate the average buy price for each product line:
SELECT productLine,AVG(buyPrice) AS avg_buyPrice
FROM products
GROUP BY productLine;




-----------------------------------------
-- MySQL aggregate function – COUNT()
--The COUNT() function returns the number of the value in a set.

-- Usecases:-
-- Get the number of products in the products table as total
SELECT COUNT(productCode) AS total
FROM products;


-- Use the COUNT() function with the GROUP BY clause to get the number of products for each product line order by product line

SELECT productLine,COUNT(productCode) AS total
FROM products
GROUP BY productLine;



-----------------------------------------
-- MySQL aggregate function – SUM()
--The SUM() function returns the sum of values in a set. The SUM() function ignores NULL. If no matching row found, the SUM() function returns NULL.

-- Usecases:-
-- Get the total order value of each product, you can use the SUM() function in conjunction with the GROUP BY clause
SELECT productCode,SUM(quantityOrdered*priceEach) AS total
FROM 
orderdetails
GROUP BY productCode
ORDER BY total 
DESC;



SELECT o.productCode,p.productName,o.SUM(quantityOrdered*priceEach) AS total
FROM products as p
INNER JOIN 
orderdetails as o ON USING(productCode);
GROUP BY productCode;


-- Get more detail using join the orderdetails table to the products
SELECT p.productCode,




-----------------------------------------
-- MySQL aggregate function – MAX()
--The MAX() function returns the maximum value in a set. 
-- MAX(expression)

-- Usecases:-
-- Use the MAX() function to get the highest buy price from the products table
SELECT MAX(buyPrice) AS highest_price
FROM products;

-- Use the MAX() function with the GROUP BY clause to get the highest price per product line
SELECT productLine,MAX(buyPrice)
FROM products
GROUP BY productLine;


---------------------------------------------
-- MySQL aggregate function – MIN()
--The MIN() function returns the minimum value in a set of values.
-- MIN(expression)

-- Usecases:-
-- Use the MIN() function to find the lowest price from the products table
SELECT MIN(buyPrice) AS highest_price
FROM products;

-- Use the MIN() function with the GROUP BY clause to get the lowest price per product line
SELECT productLine,MIN(buyPrice)
FROM products
GROUP BY productLine;




---------------------------------------------
-- MySQL aggregate function – GROUP_CONCAT() 
The GROUP_CONCAT() concatenates a set of strings and returns the concatenated string

-- ***USE employees and customers tables

-- Usecases:-

-- use the GROUP_CONCAT() function to return the sales staffs and list of customers that each sales staff is in charge of:
SELECT
firstName,lastName,
GROUP_CONCAT(
    DISTINCT customerName
    ORDER BY customerName
) customers
FROM
employees
INNER JOIN customers
ON customers.salesRepEmployeeNumber = employeeNumber
GROUP BY employeeNumber
ORDER BY firstName,lastName;





--Calculate avg of the avg buyPrice og productLine
SELECT 
AVG(pl_avg) 
FROM (
    SELECT AVG(buyPrice) pl_avg
    FROM products
    GROUP BY productLine
) avgs;







  SELECT AVG(AVG(buyPrice)) 
    FROM products
    GROUP BY productLine;
