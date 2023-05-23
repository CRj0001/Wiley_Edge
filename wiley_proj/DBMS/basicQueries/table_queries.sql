
--------GENERATED COLUMNS

CREATE TABLE IF NOT EXISTS contacts(
     id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    full_name VARCHAR(40) GENERATED ALWAYS AS (CONCAT (first_name, " ", last_name))
);

ALTER TABLE contacts
    ADD COLUMN full_name VARCHAR(50)
    GENERATED ALWAYS AS (CONCAT (first_name, " - ", last_name);


ALTER TABLE products
    ADD COLUMN total_price INT
    GENERATED ALWAYS AS (quantityInStock+buyPrice) STORED;

 --STORED can add unique constraint   
 ALTER TABLE products
    ADD COLUMN total_price INT
    GENERATED ALWAYS AS (quantityInStock+buyPrice) VIRTUAL;
