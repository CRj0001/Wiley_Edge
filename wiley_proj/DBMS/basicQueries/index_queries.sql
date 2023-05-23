
--create index explicitely
CREATE INDEX index_name
ON table_name (column_list);
--by default B-Tree index is created


----------------------------------------
SELECT
    employeeNumber,
    lastName,
    firstName
FROM
    employees
WHERE
    jobtitle = 'Sales Rep';

EXPLAIN SELECT --explains about the query
    employeeNumber,
    lastName,
    firstName
FROM
    employees
WHERE
    jobtitle = 'Sales Rep' \G;



EXPLAIN FORMAT=JSON SELECT 
    employeeNumber,
    lastName,
    firstName
FROM
    employees
WHERE
    jobtitle = 'Sales Rep' \G;
    --QUERY COST = 2.55


CREATE INDEX emp_idx ON employees(jobTitle);
--QUERY COST = 2.27


--LIST INDEX
show indexes from Employees;

--when we dont connect to any db
show indexes from Employees IN db_name;
OR
show indexes from db_name.tb_name;

--KEYS==INDEX


--DROP INDEX
DROP INDEX idx_name ON tab_name;

DROP INDEX email ON leads ALGORITHM = INPLACE LOCK = DEFAULT;

DROP INDEX 'PRIMARY' ON tab_name;



--FILTER INDEX INFO
SHOW INDEXES FROM tab_name WHERE visible='NO';

CREATE TABLE contacts(
    contact_id INT AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20),
    PRIMARY KEY(contact_id),
    UNIQUE(email),
    INDEX phone(phone) INVISIBLE,
    INDEX name(first_name, last_name) comment 'By first name and/or last name'
);


SHOW INDEXES FROM contacts;
--index phone is not visible
SHOW INDEXES FROM contacts WHERE visible='NO';
--index phone is visible


-----PREFIX INDEX
--Take prefix of string as a INDEX



--using products table
--Find the products whose name starts with String
EXPLAIN FORMAT=JSON SELECT
    productName,
    buyPrice,
    msrp
FROM
    products
WHERE
    productName LIKE '1970%';

--compare with different string lengths
SELECT
    COUNT(DISTINCT LEFT(productName, 20)) unique_row
FROM
    products;

--creating index to reduce the cost
CREATE INDEX pro_idx ON products(productName(20));




-----------------------------------------

--COMPOSITE INDEX

SELECT
    firstName,
    lastName
FROM 
    employees
WHERE lastName like 'Patterson';

EXPLAIN FORMAT =JSON SELECT
    firstName,
    lastName
FROM 
    employees
WHERE lastName like 'Patterson';

CREATE INDEX name ON employees(firstNAme,lastName);

-----
--INVISIBLE

CREATE INDEX name ON employees(firstNAme,lastName) VISIBLE|INVISIBLE;
--for existing index
ALTER TABLE tab_name ALTER INDEX idx_name [ VISIBLE|INVISIBLE];



-------------------------------------------
--DESCENDING INDEX

CREATE TABLE t(
    a INT,
    b INT
    KEY a_asc_b_desc (a,b DESC)
) ENGINE = InnoDB;


--------------------
SELECT
    productName,
    buyPrice
FROM
    products
WHERE
    buyPrice BETWEEN 10 AND 80;
ORDER BY
    buyPrice;

EXPLAIN FORMAT=JSON SELECT
    productName,
    buyPrice
FROM
    products
WHERE
    buyPrice BETWEEN 10 AND 80;
ORDER BY
    buyPrice;

CREATE INDEX idx_buyPrice ON products(buyPrice);
