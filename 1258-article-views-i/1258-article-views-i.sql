# Write your MySQL query statement below
select distinct author_id as id 
from Views 
where author_id=viewer_id
order by id
#order by used for sorting nubrs in ascending order 
# in order to avoid retriving duplicate values like 4 as occured 2 times so we take "distinct"