CREATE DATABASE mydb;
CREATE TABLE employee (
	id INT NOT NULL AUTO_INCREMENT,
    name_employee VARCHAR(100) NOT NULL,
    second_name VARCHAR (100) NOT NULL,
    age SMALLINT,
    PRIMARY KEY (id)
);