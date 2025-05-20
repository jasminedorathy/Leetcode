# Write your MySQL query statement below
SELECT MAX(SALARY) AS SecondHighestSalary
From Employee
WHERE salary < (SELECT MAX(salary) From employee);