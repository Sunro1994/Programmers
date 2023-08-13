/*
가게의 상반기 주문 정보를 담은 FIRST_HALF
SHIPMENT_ID(FK),             FLAVOR(PK),    TOTAL_ORDER
 아이스크림 가게까지의 출하 번호, 아이스크림 맛,    상반기 아이스크림 총주문량

7월의 아이스크림 주문 정보를 담은 JULY 테이블
SHIPMENT_ID(PK), FLAVOR(FK),    TOTAL_ORDER
출하 번호,          아이스크림 맛, 7월 아이스크림 총주문량


7월에는 아이스크림 주문량이 많아 같은 아이스크림에 대하여 서로 다른 두 공장에서 아이스크림 가게로 출하를 진행하는 경우가 있습니다. 
이 경우 같은 맛의 아이스크림이라도 다른 출하 번호를 갖게 됩니다.
*/
SELECT A.FLAVOR
FROM
(
SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL
FROM FIRST_HALF
GROUP BY ROLLUP(FLAVOR)
) A
JOIN
(
SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL2
FROM JULY
GROUP BY ROLLUP(FLAVOR)
) B
ON A.FLAVOR = B.FLAVOR
ORDER BY (TOTAL+TOTAL2) DESC
FETCH NEXT 3 ROWS ONLY

