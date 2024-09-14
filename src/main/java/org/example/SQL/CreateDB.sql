--Create a new database
CREATE DATABASE bank;
--Use the database
    CREATE TABLE customers (
        customer_id INT PRIMARY KEY,
        first_name VARCHAR(50),
        last_name VARCHAR(50),
        email VARCHAR(50),
        phone_number VARCHAR(50),
        address VARCHAR(50),
        city VARCHAR(50),
        state VARCHAR(50),
        zip_code VARCHAR(50)
    );
-- Insert data into the customers table
    INSERT INTO customers (customer_id, first_name, last_name, email)
    VALUES (1, 'John', 'Doe', 'john.doe@example'),
           (2, 'Jane', 'Doe', 'jane.doe@example'),
           (3, 'Alice', 'Smith', 'alice.smith@example'),
           (4, 'Bob', 'Johnson', 'bob.johnson@example');

-- Query the customers table
    SELECT * FROM customers;

--Update the customers table
    UPDATE customers
    SET email = 'john.new@example'
    WHERE customer_id = 1;
--Delete a record from the customers table
    DELETE FROM customers
    WHERE customer_id = 4;

--Join Two Tables
    CREATE TABLE accounts (
        account_id INT PRIMARY KEY,
        customer_id INT,
        account_type VARCHAR(50),
        balance DECIMAL(10, 2),
        FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
    );

    INSERT INTO accounts (account_id, customer_id, account_type, balance)
    VALUES (1, 1, 'Savings', 1000.00),
           (2, 1, 'Checking', 500.00),
           (3, 2, 'Savings', 1500.00),
           (4, 3, 'Checking', 2000.00);

    SELECT * FROM accounts;

    SELECT customers.first_name, customers.last_name, accounts.account_type, accounts.balance
    FROM customers
    JOIN accounts ON customers.customer_id = accounts.customer_id;
--Use Transactions
    BEGIN;
    INSERT INTO accounts (account_id, customer_id, account_type, balance)
    VALUES (5, 2, 'Checking', 3000.00);
    UPDATE customers
    SET email = 'jane.transaction@example'
    WHERE customer_id = 2;
    COMMIT;
--Rollback a Transaction
ROLLBACK ;