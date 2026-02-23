# Write your MySQL query statement below
select contest_id,
ROUND(COUNT(user_id)*100.0/(SELECT COUNT(*) from Users),2) AS percentage
from register
group by contest_id
order by percentage DESC,contest_id ASC; 