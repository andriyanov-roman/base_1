CREATE DATABASE mydb;
CREATE TABLE Employees (
	EmployeeID MEDIUMINT NOT NULL AUTO_INCREMENT,
    EmployeeName VARCHAR(100) NOT NULL,
    EmployeeSecondName VARCHAR(100) NOT NULL,
    Age SMALLINT,
    PRIMARY KEY(EmployeeID)
); 
INSERT INTO Employees (EmployeeName, EmployeeSecondName, Age)
VALUES ('John','Smith', 30),
	   ('Jack','Woker', 59),
       ('Antonio','Moreno', 27),
       ('Ana','Schmidt', 30),
       ('Thomas','Hardy', 30);

UPDATE  Employees
SET Age = 35, Age = 24 WHERE  EmployeeID  = 4 OR EmployeeID  = 5;#WHERE EmployeeID IN (1,2);


SELECT * FROM Employees; 

ALTER TABLE Employee ADD salary DECIMAL(16,4);

UPDATE Employees e SET e.salary=5000; # e - alies

SELECT NOW() FROM dual;#