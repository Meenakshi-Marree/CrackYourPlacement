# Write your MySQL query statement below
select query_name,
ROUND(AVG(rating * 1.0/position),2) As quality,
ROUND(SUM(CASE when rating<3 then 1 else 0 end) *100.0/Count(*),2)
As poor_query_percentage
from Queries 
group by query_name;