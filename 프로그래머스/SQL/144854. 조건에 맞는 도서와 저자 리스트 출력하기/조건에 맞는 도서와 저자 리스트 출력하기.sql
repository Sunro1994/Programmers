-- 코드를 입력하세요
SELECT 
 A.book_id                   as BOOK_ID
,B.author_name             as AUTHOR_NAME
,TO_CHAR(A.PUBLISHED_DATE,'YYYY-MM-DD')          as PUBLISHED_DATE
from BOOK A join AUTHOR B
ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE A.CATEGORY = '경제'
ORDER BY A.PUBLISHED_DATE ASC;