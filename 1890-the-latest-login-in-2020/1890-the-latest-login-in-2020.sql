SELECT user_id,
       MAX(time_stamp) AS last_stamp
FROM logins
WHERE time_stamp >= TO_TIMESTAMP('2020-01-01 00:00:00',
                                 'YYYY-MM-DD HH24:MI:SS')
  AND time_stamp < TO_TIMESTAMP('2021-01-01 00:00:00',
                                'YYYY-MM-DD HH24:MI:SS')
GROUP BY user_id;