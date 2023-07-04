SELECT user_id ,product_id 
from (
    select user_id,product_id,count(*) as cnt
    from ONLINE_SALE
    group by user_id, product_id
    )
where cnt>=2
order by user_id asc, product_id desc;