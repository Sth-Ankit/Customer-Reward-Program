DROP TABLE IF EXISTS CUSTOMER;
DROP TABLE IF EXISTS TRANSACTION;

CREATE TABLE CUSTOMER(
        CUSTOMER_ID int,
        CUSTOMER_NAME VARCHAR(50)
        );
CREATE TABLE TRANSACTION(
        TRANSACTION_ID int,
        CUSTOMER_ID int,
        TRANSACTION_DATE DATE,
        AMOUNT int
        );

INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME) VALUES (100,'John Doe');
INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME) VALUES (101,'Jane Doe');

INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,TRANSACTION_AMOUNT) VALUES (1000,100,'2022-05-25',120);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,TRANSACTION_AMOUNT) VALUES (1001,100,'2022-06-28',200);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,TRANSACTION_AMOUNT) VALUES (1002,101,'2022-01-01',113);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,TRANSACTION_AMOUNT) VALUES (1003,101,'2022-02-22',80);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,TRANSACTION_AMOUNT) VALUES (1004,101,'2022-03-20',362);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,TRANSACTION_AMOUNT) VALUES (1007,100,'2022-07-28',150);
