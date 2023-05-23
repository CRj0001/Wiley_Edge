DROP tasks IF EXISTS;
CREATE TABLE tasks(
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    task_name varchar(30) NOT NULL
);
 INSERT INTO tasks(task_name) VALUES ('abc');

--primary KEY
--cannot add duplicate value in Primary KEY

 INSERT INTO tasks(task_id,task_name) VALUES (1, "cba");
--ERROR 1062 (23000): Duplicate entry '1' for key 'tasks.PRIMARY'



--NOT NULL
--while inserting you must add the field which is not NULL
INSERT INTO tasks(task_id) VALUES (3);
--ERROR 1364 (HY000): Field 'task_name' doesn't have a default value



--UNIQUE
--values inserted in column must be UNIQUE

 INSERT INTO tasks(task_id,task_name,task_type) VALUES (4,'Venkat',"Gaming");
--Query OK, 1 row affected (0.05 sec)

INSERT INTO tasks(task_id,task_name,task_type) VALUES (5,'Anmol',"Gaming");
--ERROR 1062 (23000): Duplicate entry 'Gaming' for key 'tasks.task_type'





--DEFAULT
--If you dont mention the value for field the default value will be given
 ALTER TABLE tasks ADD COLUMN task_owner varchar(40) DEFAULT 'OWNER';
--Query OK, 0 rows affected (0.07 sec)



--Disable foreign_key_checks
SET foreign_key_checks = 0;


--Enable foreign_key_checks
SET foreign_key_checks = 1;





--FOREIGN KEY
CREATE TABLE table_fk(
    table_id INT AUTO_INCREMENT PRIMARY KEY,
    table_name varchar(60) NOT NULL
);

--add FK in tasks
 MODIFY TABLE table_fk COLUMN table_fk varchar(40) DEFAULT 'OWNER';
