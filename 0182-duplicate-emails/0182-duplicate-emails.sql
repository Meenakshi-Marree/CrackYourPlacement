# Write your MySQL query statement below
select email from person
Group by email
Having count(email)>1;