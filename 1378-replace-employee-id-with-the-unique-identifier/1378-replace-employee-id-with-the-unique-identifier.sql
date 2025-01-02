# Write your MySQL query statement below
select eu.unique_id,name
from employees e
left join employeeuni eu
using(id)