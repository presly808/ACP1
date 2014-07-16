DROP SCHEMA IF EXISTS new_schema;

CREATE SCHEMA new_schema;

use new_schema;

DROP TABLE IF EXISTS Citys;
DROP TABLE IF EXISTS Employees;
DROP TABLE IF EXISTS Companies;

CREATE TABLE Companies (
	c_id int(11) NOT NULL AUTO_INCREMENT,
	c_name VARCHAR(30),
	c_money FLOAT,
	bithday DATE,
	PRIMARY KEY(c_id)
);

CREATE TABLE Employees (
   u_id int(11) NOT NULL AUTO_INCREMENT,
   user_name CHAR(20),
   user_age int(11),
   company_id int(11),
   PRIMARY KEY(u_id),
   FOREIGN KEY (company_id) REFERENCES companies(c_id)
);


CREATE TABLE Citys (
	c_id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	city_name varchar(50),
	user_id int(11) UNIQUE,
	FOREIGN KEY(user_id) REFERENCES Employees(u_id)
)

INSERT INTO companies (c_name, c_money, bithday)
 VALUES ('Cheburek', 100000, '1999-02-22');

INSERT INTO companies (c_name, c_money, bithday)
 VALUES ('PuzataHata', 50000, '2008-03-11');

INSERT INTO companies (c_name, c_money, bithday)
 VALUES ('InventC', 1233456, '2010-08-15');

INSERT INTO IF employees (user_name, user_age)
 VALUES ('Vova', 27);

INSERT INTO employees (user_name, user_age)
 VALUES ('Serhii', 22);

INSERT INTO employees (user_name, user_age)
 VALUES ('Oleg', 25);

INSERT INTO employees (user_name, user_age)
 VALUES ('Serhu', 27);

INSERT INTO employees (user_name, user_age)
 VALUES ('Micha', 27);

INSERT INTO citys (city_name, user_id)
 VALUES ('Odesa', 2);

INSERT INTO citys (city_name, user_id)
 VALUES ('Slavans', 3);