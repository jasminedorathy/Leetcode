# Write your MySQL query statement below
Select u.name, sum(t.amount) as balance 
from users u join transactions  t
using(account)
group by t.account
having balance > 10000