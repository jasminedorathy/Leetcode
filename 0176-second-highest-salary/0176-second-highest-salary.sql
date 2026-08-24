
select MAX(salary) as SecondHighestSalary from
(select salary,dense_rank() over(order by salary desc) as rnk from employee) temp
where rnk = 2;