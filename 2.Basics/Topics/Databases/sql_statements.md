no of rows > select count(*) from customers;

update > update customers set name='kaustubh deokar' where id=1

add column > alter table customers add column (identity varchar(32) not null);

create index > create index customers_identity_idx on customers (identity);

Well choosen index speeds up read queries, but every index slows down write queries. 

secondary index means a created index other than the primary key.