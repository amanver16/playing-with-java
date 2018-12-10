-- Create a new database called 'Library'
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = N'Library'
)
CREATE DATABASE Library
GO

-- Use Library Database

USE Library

-- CREATE ADMIN TABLE
CREATE TABLE ADMIN 
(
    USERNAME VARCHAR(20) NOT NULL,
    PASSWORD VARCHAR(16) NOT NULL
)

--DROP TABLE IF REQUIRED
DROP TABLE ADMIN

--INSERT DATA
INSERT INTO ADMIN
VALUES
('admin','admin')

--VIEW DATA
SELECT *FROM ADMIN