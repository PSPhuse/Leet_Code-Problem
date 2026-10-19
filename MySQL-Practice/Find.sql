-- Find Customers Who Never Order

select name as Customers
from Customers c
left join Orders o
on o.customerId = c.id
where c.id not in (select customerId from Orders);
