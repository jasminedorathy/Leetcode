/* Write your PL/SQL query statement below */
select employee_id,
Case 
when MOD(employee_id,2) <> 0 and name NOT LIKE 'M%' then salary
else 0
end as bonus
from employees order by employee_id;