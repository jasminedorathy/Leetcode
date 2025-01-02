# Write your MySQL query statement below
Select name
from customer
where coalesce(referee_id,"") != 2 