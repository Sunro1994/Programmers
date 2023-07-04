-- 코드를 입력하세요
SELECT
price_group * 10000 as price_group,
count (price_group)
from
(select substr(price,0,1) as price_group from product)
group by price_group * 10000
order by price_group