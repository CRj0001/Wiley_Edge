--CASE




--return the customers and their orders(order count);
SELECT COUNT(orderNumber) total_order,
customerName
FROM customers
INNER JOIN 
orders ON customers.customerNumber=orders.customerNumber
GROUP BY
customerName;




--using CASE 
WITH ttbl AS(
    SELECT COUNT(orderNumber) total_order,
customerName
FROM customers
INNER JOIN 
orders ON customers.customerNumber=orders.customerNumber
GROUP BY
customerName
)
SELECT customerName,
total_order,
CASE total_order
WHEN 1 THEN 'one-time customer'
WHEN 2 THEN 'Repeated customer'
WHEN 3 THEN 'Frequent customer'
END customerType
from
ttbl 
ORDER BY customerName;

--------------------------------------------

--IF

--sort the customer by state IF NULL 
--sort by country
SELECT 
    customerName,
    state,
    country
FROM
    customers
ORDER BY(
    CASE state
    WHEN NOT NULL then state
    WHEN NULL then country
    END)
    limit 5;
            OR
    CASE
    WHEN state IS NULL THEN country
    ELSE state
    END


    --------------------------------
--sum to calc total sales orders by order status
SELECT
    SUM (
        WHEN status='Shipped' THEN 1
        ELSE 0
        END
    ) AS 'total_Shipped',
    SUM (
        WHEN status='On hold' THEN 1
        ELSE 0
        END
    ) AS 'total_hold',
    COUNT(*) AS total
FROM
    orders;


    --------------------------------------
--IF
SELECT IF(1=2, 'T', 'F');




--IFNULL
IFNULL(exp1,exp2);
IFNULL(NULL,'sdd');







--NULLIF
NULLIF(exp1,exp2);

WHEN exp1=exp2 THEN NULL
ELSE exp1;


--get all orders created
SELECT 
    orderNumber, orderDate, requireDate, shippedDate, status
FROM orders
WHERE
    oerderDate BETWEEN '2003-06-01'AND '2003-06-30';