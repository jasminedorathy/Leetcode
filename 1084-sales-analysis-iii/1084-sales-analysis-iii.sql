/* Write your PL/SQL query statement below */
select p.product_id,p.product_name from sales s 
join product p on s.product_id = p.product_id 

group by p.product_id,p.product_name
Having min(s.sale_date) >= '2019-01-01' and 
max(s.sale_date) <= '2019-03-31';