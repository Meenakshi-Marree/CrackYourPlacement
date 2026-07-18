# Write your MySQL query statement below
select
    c.category,
    COALESCE(a.accounts_count,0) as accounts_count
    from 
    (
        #here we are using category table temporarily so we can with other table 
            SELECT 'Low Salary' AS category
            UNION
            SELECT 'Average Salary'
            UNION
            SELECT 'High Salary'
    )c
    left join
   ( 
    SELECT
    Case
        when income <20000 then 'Low Salary'
        WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'
        ELSE 'High Salary'
    end as category,
    count(*) as accounts_count
    from accounts
    group by category
    #here we get the l.s as 1 an dh.s as 3 . but a.s mi9ssing so we are using joins
   )a
   on c.category=a.category;
