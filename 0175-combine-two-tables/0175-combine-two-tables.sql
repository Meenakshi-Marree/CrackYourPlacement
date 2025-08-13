# Write your MySQL query statement below
select a.firstName,a.LastName,b.city,b.state
from Person as a
left join
Address as b on a.personId=b.personId;