# Write your MySQL query statement below
SELECT lefft.unique_id,e.name
FROM Employees e 
left join EmployeeUNI lefft 
on e.id = lefft.id