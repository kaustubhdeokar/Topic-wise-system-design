no of rows > select count(*) from customers;

update > update customers set name='kaustubh deokar' where id=1

add column > alter table customers add column (identity varchar(32) not null);

create index > create index customers_identity_idx on customers (identity);

Well choosen index speeds up read queries, but every index slows down write queries. 

secondary index means a created index other than the primary key.


> Aggregations
- mysql> select sum(population) from city where state = 'Maharashtra';
- mysql> select avg(population) from city where state = 'Maharashtra';


- Rounding upto 2 places.
> select round(sum(lat_n),2), round(sum(long_w),2) from station;

> [left join](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/?envType=study-plan-v2&envId=top-sql-50)
- select EmployeeUNI.unique_id,Employees.name from Employees left join EmployeeUNI on Employees.id = EmployeeUNI.id;

