-- Create a new database called 'StudentDb'
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = N'StudentDb'
)
CREATE DATABASE StudentDb
GO

-- Use StudentDb

USE StudentDb

-- CREATE STUDENT TABLE
CREATE TABLE STUDENT 
(
    ID INT PRIMARY KEY NOT NULL,
    NAME VARCHAR(20) NOT NULL,
    GENDER VARCHAR(10) NOT NULL,
    COURSE VARCHAR(10),
    EMAIL VARCHAR(25),
    PHONE NUMERIC,
    USERNAME VARCHAR(20) NOT NULL,
    PASSWORD VARCHAR(16) NOT NULL
)

--DROP TABLE IF REQUIRED
DROP TABLE STUDENT

--INSERT DATA
INSERT INTO STUDENT
VALUES
(1,'Aman','Male','MCA','amanver16@gmail.com',8084528590,'aman','aman')

--VIEW DATA
SELECT *FROM STUDENT