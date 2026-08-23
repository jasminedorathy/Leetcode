/* Write your PL/SQL query statement below */
/*select e.employee_id from employees e 
full join salaries s on e.employee_id = s.employee_id
where name Is null or salary is null 
order by employee_id;*/

Select T.employee_id from (select * from employees 
left join salaries using(employee_id)
UNION
select * from employees
right join salaries using(employee_id))T
where T.name Is null or T.salary is null 
order by employee_id;