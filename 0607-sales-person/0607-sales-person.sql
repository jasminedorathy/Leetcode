WITH temp1 AS (
    SELECT com_id
    FROM Company
    WHERE name = 'RED'
),
temp2 AS (
    SELECT DISTINCT o.sales_id
    FROM Orders o
    JOIN temp1 t
        ON o.com_id = t.com_id
)
SELECT s.name
FROM SalesPerson s
WHERE s.sales_id NOT IN (
    SELECT sales_id
    FROM temp2
);