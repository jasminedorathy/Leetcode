/* Write your PL/SQL query statement below */
with temp as (select id,visit_date,people,id - row_number() over(order by id) as rnk
from stadium where people >= 100) 
select id,to_char(visit_date, 'YYYY-MM-DD') as visit_date,people from temp 
where rnk in(select rnk from temp group by rnk having count(*) >= 3) 
order by visit_date;