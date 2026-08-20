/* Write your PL/SQL query statement below */
select customer_number from (select customer_number,row_number() over (order by count(*) Desc) rn from orders group by customer_number)q  where rn = 1;