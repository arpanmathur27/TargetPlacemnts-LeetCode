# Write your MySQL query statement below
with cte as(select num, lead(num,1)over() num1, lead(num,2)over() num2
from Logs)
select distinct num as ConsecutiveNums
from cte
where num1=num and num2=num