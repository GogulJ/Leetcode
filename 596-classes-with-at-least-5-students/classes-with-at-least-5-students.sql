select class
from(
select class ,count(*) as cnt
from courses
group by class)t 
where cnt >=5