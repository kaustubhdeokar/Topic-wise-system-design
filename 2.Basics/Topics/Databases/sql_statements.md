no of rows > select count(*) from customers;

update > update customers set name='kaustubh deokar' where id=1

add column > alter table customers add column (identity varchar(32) not null);

create index > create index customers_identity_idx on customers (identity);

Well choosen index speeds up read queries, but every index slows down write queries. 

secondary index means a created index other than the primary key.


> Aggregations
- mysql> select sum(population) from city where state = 'Maharashtra';
- mysql> select avg(population) from city where state = 'Maharashtra';

> Joins
- mysql> select a.*, b.* from city a join country b on a.country = b.name where b.continent='Asia';
    
