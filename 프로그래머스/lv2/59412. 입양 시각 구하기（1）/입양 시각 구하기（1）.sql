-- 코드를 입력하세요
SELECT extract(hour from datetime) as HOUR, count(*)
from animal_outs
group by extract(hour from datetime)
having HOUR between 9 and 19
order by HOUR asc;
