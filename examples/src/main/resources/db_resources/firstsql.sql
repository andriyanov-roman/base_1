CREATE DATABASE mydb;
CREATE TABLE employee(
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	name_employee VARCHAR(100) NOT NULL,
    second_name VARCHAR(100) NOT NULL,
    age SMALLINT,
     PRIMARY KEY (id)
);
insert into employee (name_employee, second_name,age) 
values ('Ruslan','Vankevich',21);

insert into employee values (2, 'Igor','Matviichuk',25);
SELECT * FROM employee WHERE name_employee='Ira' OR 1=1;

ALTER TABLE employee ADD salary DECIMAL(16,4);
UPDATE employee e SET e.salary=500;
UPDATE employee e SET e.salary=1500 WHERE e.id=1;
UPDATE employee e SET e.salary=1500 WHERE e.id IN(1,2);

SELECT NOW() FROM dual;

insert into employee (name_employee, second_name,age) values (Ivan,Ivanov,21);

insert into employee (name_employee, second_name,age) values (Ivan,Ivanov,21);
insert into employee (name_employee, second_name,age) values ('Dima','Lisunov',35);

SELECT * FROM employee WHERE second_name='Ira' OR true;
