-- 1378. Replace Employee ID With The Unique Identifier

SELECT 
    unique_id, name
FROM
    Employees e
        LEFT JOIN
    EmployeeUNI e1 ON e.id = e1.id; 
