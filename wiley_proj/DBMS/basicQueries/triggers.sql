--Records changes made in table

CREATE TABLE emp_audit (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employeeNumber INT NOT NULL,
    lastNAme VARCHAR(28) NOT NULL,
    firstNAme VARCHAR(28) DEFAULT NULL,
    action VARCHAR(50) DEFAULT NULL
);

CREATE TRIGGER before_emp_update
    BEFORE UPDATE ON employees
    FOR EACH ROW
INSERT INTO emp_audit
SET action = 'uodate',
    employeeNumber = OLD.employeeNumber,
    lastName = OLD.lastName;


UPDATE employees SET lastname = 'steve' WHERE employeeNumber=1056;
--SHOW Triggers

-------------------------
DROP TRIGGER IF EXISTS dbname.trigger_name;
DROP TRIGGER IF EXISTS willeyclassic.emp_audit;

-------------------------
--exercise

CREATE TABLE members(
    name VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL PRIMARY KEY,
    d_o_b varchar(30)
);

INSERT INTO members(name, email)
VALUES('Raj','craj@gmail.com');

CREATE TABLE reminder(
    id INT AUTO_INCREMENT PRIMARY KEY,
    member_id INT,
    message VARCHAR(40)
);

ALTER TABLE members
ADD id  INT;

ALTER TABLE reminder
MODIFY member_id  INT;



DELIMITER $$
CREATE TRIGGER after_member_update
    AFTER INSERT ON members
    FOR EACH ROW
BEGIN
    IF NEW.d_o_b IS NULL THEN
        INSERT INTO reminder(member_id,message)
        VALUES( NEW.id,CONCAT('Hii ',NEW.name,', Please update your dob'));
    END IF;
END $$
DELIMITER;


SELECT * FROM members;


--------------------------------------------------

CREATE TABLE customersOne(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    email VARCHAR(40) NOT NULL,
    phone INT,
    extra_payment INT,
    emi_amount INT
);

CREATE TABLE limit_Emi(
    id INT AUTO_INCREMENT PRIMARY KEY,
    extra_payment INT,
    name VARCHAR(40) NOT NULL,
    emi_amount INT
);

DELIMITER $$
CREATE TRIGGER after_emi_update
    AFTER UPDATE ON customersOne
    FOR EACH ROW
BEGIN
    IF NEW.extra_payment>2*emi_amount IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'error'; 
    END IF;
END $$
DELIMITER;


INSERT INTO customersOne(name,email,phone,extra_payment,emi_amount)
VALUES('Raj','craj',9893,12000,5000);