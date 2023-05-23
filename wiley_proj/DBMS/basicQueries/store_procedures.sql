

-- Return all rows from customers

SELECT
    customerName,
    city,
    state,
    postalCode,
    country
FROM
    customers
ORDER BY
    customerName;


--CREATE STORE PROCEDURE
DELIMITER $$
CREATE PROCEDURE getCustomer()
BEGIN
    SELECT
    customerName,
    city,
    state,
    postalCode,
    country
FROM
    customers
ORDER BY
    customerName;
END $$
DELIMITER ;


--call delimiter FUNCTION
CALL getCustomer();

------------------------------------------

--CHANGE DELIMITER
DELIMITER delimeter_character

--RESET DELIMETER
DELIMITER ;

-------------------------------------------


--create procedudure to get all products

DELIMITER $$
CREATE Procedure getAllProducts()
BEGIN
    SELECT * FROM products;
END $$ 
DELIMITER ;

------------------------------------------


--CREATE Parmeterized store PROCEDURE

CREATE Procedure procedure_name(parameter)
BEGIN
    SSTATEMENT
END //

----------------------------------------

DELIMITER $$
USE 'db_name'
CREATE Procedure 'procedure_name'()
BEGIN
    SELECT * FROM products;
END $$ 


------------------------------------
--DROP PROCEDURE

DROP procedure if EXISTS 'getAllProducts';

-------------------------------------

--Create procedure using parameter
[IN | OUT | INOUT procedure_name data_type(length)]

DELIMITER $$
CREATE Procedure getOfficesByCountry(
    IN customerName VARCHAR(255)
)
BEGIN
    SELECT * FROM offices WHERE country = customerName;
END $$ 
DELIMITER ;


--CREATE procedure to return number of orders by order status
-- INPUT = order status
-- output = total ORDER

DELIMITER $$
CREATE Procedure getOrderByStatus(
    IN orderStatus VARCHAR(255)
    OUT total INT
)
BEGIN
    SELECT COUNT(*) INTO total
    FROM orders 
    WHERE status = orderStatus;
END $$ 
DELIMITER ;

--to CALL
CALL getOrderByStatus('in processs', @in_process);

---------------------------------

DELIMITER $$
CREATE Procedure setCounter(
    INOUT counter INT,
    IN inc INT
)
BEGIN
   SET counter = counter + inc;
END $$ 
DELIMITER ;

SET @counter = 1;
CALL setCounter(@counter, 2);

-------------------------------------------
--UPDATE PROCEDURE

DELIMITER $$
CREATE DEFINER=`root`@`localhost` Procedure getOrderByStatus(
    IN orderStatus VARCHAR(255)
    OUT total INT
)
BEGIN
    SELECT COUNT(*) INTO total
    FROM orders 
    WHERE status = orderStatus;
END $$ 
DELIMITER ;

--------------------------------------------------
--Using variables
DECLARE var_name data_type DEFAULT value;

DECLARE @totals AS INT(5);

DELIMITER $$
CREATE Procedure getTotalOrder()
BEGIN
    DECLARE totalOrder INT default 0;

    SELECT COUNT(*) INTO totalOrder
    FROM orders;
   
   SELECT totalOrder;
END $$ 
DELIMITER ;

CALL getTotalOrder();

-------------------------------------------

--List procedures

SHOW PROCEDURE STATUS;

SHOW PROCEDURE STATUS WHERE db = 'willeyclassic';

SHOW PROCEDURE STATUS LIKE = '%order%';


--Assign values to the vars

SET var_name = value;


----------------------------------------------

--STORED PROCEDURES WITH ERROR HANDLING

DECLARE action HANDLER FOR condition_value statement;

CONTINUE OR EXIT ..?


DECLARE action HANDLER FOR condition_value statement;

--CREATE

CREATE TABLE SupplierProducts(
    supplierId INT,
    productId INT,
    PRIMARY KEY(supplierId, productId)
)


DELIMITER $$
CREATE PROCEDURE insertSupplierProduct(
    IN inSupplierId INt,
    IN inProductId INT
)
BEGIN
--exit if duplicate key
    DECLARE EXIT HANDLER FOR 1062
    BEGIN
        SELECT CONCAT('Duplicate key (',inSupplierId,'
        ,',inProductId,') Occured') AS message;
    END;

    --insert new row in supplier Id
    INSERT INTO insertSupplierProduct(supplierId, productId) 
    VALUES (inSupplierId, inProductId)

    --return product supplied by productId
    SELECT COUNT(*)
    FROM SupplierProducts
    WHERE supplierId=inSupplierId;

END $$
DELIMITER ;
---------------------------------------------

--SQL Exception

DELIMITER $$
CREATE PROCEDURE insertSupplierProduct(
    IN inSupplierId INt,
    IN inProductId INT
)
BEGIN
--exit if duplicate key
    DECLARE EXIT HANDLER FOR 1062 SELECT 'DUPLICATE KEYS ENCOUNTERED' MESSAGE;
    DECLARE EXIT HANDLER SQLEXception SELECT 'DUPLICATE KEYS ENCOUNTERED' MESSAGE;
    DECLARE EXIT HANDLER SQLSTATE '230000' SELECT 'SQLSTATE ERROR' ErrorCode;



    BEGIN
        SELECT CONCAT('Duplicate key (',inSupplierId,'
        ,',inProductId,') Occured') AS message;
    END;

    --insert new row in supplier Id
    INSERT INTO insertSupplierProduct(supplierId, productId) 
    VALUES (inSupplierId, inProductId)

    --return product supplied by productId
    SELECT COUNT(*)
    FROM SupplierProducts
    WHERE supplierId=inSupplierId;

END $$
DELIMITER ;




----------------------
DELIMITER $$
CREATE PROCEDURE
BEGIN

END $$ 
DELIMITER ;




---------------------------------------

--working with FUNCTION

DELIMITER $$
CREATE FUNCTION func_name(
    para 1,
    para 2
)
RETURN data_TYPE 
BEGIN
    STATEMENTS
END $$
DELIMITER ;

--CREATE a function that retuen the customer level based on credit

DELIMITER $$
CREATE FUNCTION customerLevel(
    credit Decimal(10,2)
)
RETURNS VARCHAR(20)
DETERMINISTIC 
BEGIN
    DECLARE customerLevel VARCHAR(30);
    IF credit>50000 THEN
        SET customerLevel = 'PLATINUM';
    ELSEIF (credit<=50000 AND credit>=10000)
    SET customerLevel = 'GOLD';
      ELSEIF (credit<10000 AND )
    SET customerLevel = 'SILVER';
    END IF;

    RETURN(customerLevel)

END $$
DELIMITER ;

--Show FUNCTION
SHOW FUCTION STATUS WHERE dB = 'wileyclassic';