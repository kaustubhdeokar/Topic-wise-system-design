-- Order by city name (lexographically) and length of city.
select name, length(name) from city order by length(name), name;

-- - substr starts with, like where 
select distinct state from city where substr(upper(state), 1,1) in ('A','E','I','O','U');

-- substr ends with
select distinct state from city where substr(upper(state),-2) in ('RA','HI','AL')

-- distinct, count
select count(state) - count(distinct(state)) from city;

-- time query, employee time of serving between 1 and 4 years
select name from employee where starting_date between date_sub(CURDATE(), interval 4 year)and date_sub(curdate(), interval 1 year)

-- switch case in sql
    select 
        case 
            when A + B - C <=0 then 'Not A Triangle'
            when A + B - C <=0 then 'Not A Triangle'
            when A + B - C <=0 then 'Not A Triangle'
            when A=B and B=C then 'Equilateral'
            when A!=B and B!=C and A!=C then 'Scalene'
            else 'Isosceles' 
        end
        from TRIANGLES;

    -- Binary tree node type print (Binary Tree Nodes)
select node, case when parent is null then 'root' when node not in (select parent from bst where parent is not null) then 'leaf' else 'inner' end from bst order by node;


-- concat and print
select concat(name,'(',substr(upper(occupation),1,1),')') from occupations;
-- +----------------------------------------------------+
-- | concat(name,'(',substr(upper(occupation),1,1),')') |
-- +----------------------------------------------------+
-- | Ashley(P)                                          |
-- | Samantha(A)                                        |
-- | Julia(D)        


-- The PADS: count, order by, group by, concat
select concat(name, '(',substr(upper(occupation),1,1),')') from occupations order by name;

select concat('There are a total of ', count(*), ' ', lower(occupation),'s.') from occupations
group by occupation
order by count(*), occupation;

-- basic join
select a.name from city a join country b on a.countrycode = b.code where b.continent = 'Africa';

-- floor, join, group by
select b.continent, floor(avg(a.population)) from city a join country b on a.countrycode = b.code group by b.continent;

-- THE REPORT: https://www.hackerrank.com/challenges/the-report/problem?isFullScreen=true
-- join, case, order by
select case 
    when b.grade  < 8 then 'NULL'
    else a.name 
    end, b.grade, a.marks
    from students a join grades b on a.marks >= b.min_mark and a.marks <= b.max_mark order by b.grade desc, a.name asc;

-- advanced joins.
select s.name from students s join packages p on s.id = p.id join friends f on s.id = f.id 
join packages p2 on f.friend_id = p2.id where p.salary < p2.salary order by p2.salary;