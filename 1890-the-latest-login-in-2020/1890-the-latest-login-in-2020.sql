
select user_id, time_stamp last_stamp
from (
    select user_id, time_stamp, row_number() over(partition by user_id order by time_stamp desc) as rnk
    from logins
    where extract(year from time_stamp)=2020
)
where rnk=1