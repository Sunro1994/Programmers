-- 코드를 입력하세요
select A.id, A.name, A.host_id
from
places A,
(
select host_id,count(host_id) A
from places
group by host_id
having count(host_id) >=2 
) B
where A.host_id = B.host_id
order by id