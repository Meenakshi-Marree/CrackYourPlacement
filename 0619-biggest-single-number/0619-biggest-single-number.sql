# Write your MySQL query statement below
select Max(num) as num
From(
select num 
from MyNumbers
group by num
having count(1)=1
) t;
