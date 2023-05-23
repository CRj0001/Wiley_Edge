--CREATE TEMPORARY view of the table

--store a query in to file

CREATE VIEW custandemp AS
SELECT 
customerName,
checkNumber,
paymentDate,
amount
 FROM
customers 
INNER JOIN
payments ON 
customers.customerNumber=payments.customerNumber
;

OR

CREATE VIEW combined_viewww AS
  SELECT 
  * 
  FROM 
  customers 
  INNER JOIN 
  payments USING(customerNumber);