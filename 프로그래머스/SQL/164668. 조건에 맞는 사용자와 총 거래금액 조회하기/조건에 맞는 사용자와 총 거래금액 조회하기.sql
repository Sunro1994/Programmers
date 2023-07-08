select B.user_id as USER_ID
, B.nickname    as nickname
, total_sales   
from
(select sum(price) as total_sales
, writer_id
from USED_GOODS_BOARD
where status='DONE'
group by writer_id
having sum(price) >=700000) A
left join
USED_GOODS_USER  B
on A.writer_id = B.user_id
order by total_sales