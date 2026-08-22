

WITH customer_orders AS (
    SELECT customer_number,
           COUNT(*) AS order_count,
           DENSE_RANK() OVER (ORDER BY COUNT(*) DESC) AS rnk
    FROM Orders
    GROUP BY customer_number
)
SELECT customer_number
FROM customer_orders
WHERE rnk = 1;