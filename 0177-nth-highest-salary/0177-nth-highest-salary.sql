CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      with r as(select salary,
      dense_rank()over (order by salary desc)as sal_rank
      from Employee)
      select  salary
      from r
      where sal_rank=N
      limit 1

  );
END