------------SQL SERVER DATABASE SCRIPT-----------------

-- Run this script before using the application --

-- DATABASE CREATION SCRIPT
IF NOT EXISTS
(
  SELECT *FROM MASTER..SYSDATABASES WHERE NAME = 'EmployeeDb'
)
CREATE DATABASE EmployeeDb
GO

USE EmployeeDb

-- TABLE CREATION SCRIPT
CREATE TABLE employeePersonalDetails
(
  empId INT NOT NULL PRIMARY KEY,
  empName VARCHAR(10),
  empAge INT,
  empGender VARCHAR(6),
  empDesig VARCHAR(10),
  empAddress VARCHAR(10),
  empSalary INT
)

INSERT INTO employeePersonalDetails VALUES
(1,'Aman',22,'Male','Trainee','Chennai',5000)

CREATE TABLE employeeAcademicDetails
(
  empid INT NOT NULL PRIMARY KEY,
  empDegree VARCHAR(10),
  empPassYear VARCHAR(4),
  empPercentage FLOAT
)

ALTER TABLE employeeAcademicDetails
   ADD CONSTRAINT FK_Personal_Academic_Cascade
   FOREIGN KEY (empId) REFERENCES employeePersonalDetails(empId) ON DELETE CASCADE

-- To drop constraint 
-- alter table employeeAcademicDetails drop constraint FK_Personal_Academic_Cascade

INSERT INTO employeeAcademicDetails VALUES
(1,'MCA','2018',9.9)

CREATE TABLE employeePreviousEmployementDetails
(
  empId INT NOT NULL PRIMARY KEY,
  empCompany VARCHAR(10),
  empDesig VARCHAR(10),
  empJoinDate DATE,
  empRelieveDate DATE
)

INSERT INTO employeePreviousEmployementDetails VALUES
(1,'College','Student','2015-6-4','2017-12-12')

ALTER TABLE employeePreviousEmployementDetails
   ADD CONSTRAINT FK_Personal_Previous_Cascade
   FOREIGN KEY (empId) REFERENCES employeePersonalDetails(empId) ON DELETE CASCADE
