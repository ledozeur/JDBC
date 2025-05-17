-- liquibase formatted sql
-- changeset vladimir:1
SELECT product_name
FROM netology.ORDERS
JOIN netology.CUSTOMERS ON ORDERS.customer_id = CUSTOMERS.id
WHERE customers.name = :name;