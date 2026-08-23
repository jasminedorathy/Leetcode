WITH cte AS(
    select o.sales_id
    from orders o 
    join company c 
    on c.com_id = o.com_id and c.name = 'RED'
) 
select name 
from SalesPerson 
where sales_id not in (
    select sales_id from cte
);