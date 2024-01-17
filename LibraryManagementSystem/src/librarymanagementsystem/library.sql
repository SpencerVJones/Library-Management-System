# Creating ADMIN table
CREATE TABLE ADMIN
   (USER_ID VARCHAR(50) PRIMARY KEY,
    NAME VARCHAR(50), 
    PASSWORD VARCHAR(50));

# Creating BOOKS table
CREATE TABLE BOOKS
    (BOOK_ID VARCHAR(15) PRIMARY KEY,
    NAME VARCHAR(50), 
    CATEGORY VARCHAR(50),
    AUTHOR VARCHAR(50),
    PRICE DOUBLE(10),
    COPIES INT(10);
    

# Creating STAFF table
CREATE TABLE STAFF
    (STAFF_ID VARCHAR(10) PRIMARY KEY,
    NAME VARCHAR(50),
    PHONE VARCHAR(15),
    DEPARTMENT VARCHAR(20),
    SALARY INT(10);
    

# Insert values into ADMIN table
INSERT INTO ADMIN VALUES ('admin', 'Spencer Jones', '1234');

#  Insert values into BOOKS table
INSERT INTO BOOKS VALUES ('9780128226742','Computer Organization and Design MIPS Edition', 'Education', 'David Patterson', 89.95, 3);
INSERT INTO BOOKS VALUES ('9781284089097','Object-Oriented Data Structures Using Java', 'Education', 'Nell Dale', 77.52, 1);
INSERT INTO BOOKS VALUES ('9781782745419','Dinosaurs', 'Education', 'Amber Books', 33.59, 4);
INSERT INTO BOOKS VALUES ('9780895772206','ABCs of the Human Mind', 'Education', 'Readers Digest Association', 13.09, 2);
INSERT INTO BOOKS VALUES ('9780895773531','How in the World', 'Education', 'Readers Digest Association', 27.11, 1);
INSERT INTO BOOKS VALUES ('9780593677865','Spare', 'Memoir', 'Prince Harry The Duke of Sussex', 21.49, 7);

# Insert values into STAFF table
INSERT INTO STAFF VALUES ('74WA3X6E21', 'Cassandra Pierre', '215-555-9890', 'Sales', 65000);
INSERT INTO STAFF VALUES ('TJ2HQ0NZPS', 'Jose Marchand', '610-555-7665', 'Customer Service', 55000);
INSERT INTO STAFF VALUES ('A20W97M2JN', 'Tiffany Connor', '610-555-1526','Librarian ', 70000);
INSERT INTO STAFF VALUES ('KSU4JKRYUE', 'Frank Poole', '215-555-0264', 'Marketing', 60000);
INSERT INTO STAFF VALUES ('P2GUQI4ABA', 'Ivan Jones', '215-555-7612','Customer Service',55000);
INSERT INTO STAFF VALUES ('D3Y3OXW8AC', 'Jeremy Smith', '610-555-3345','Human Resources', 60000);

# Checks rows in ADMIN table     
SELECT * FROM ADMIN;

# Checks rows in BOOKS table
SELECT * FROM BOOKS;

# Checks rows in STAFF table
SELECT * FROM STAFF;
