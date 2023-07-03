-- 코드를 입력하세요
SELECT substr(product_code,1,2) AS CATEGORY, COUNT(*) AS PRODUCTS 
FROM PRODUCT
GROUP BY substr(product_code,1,2)
ORDER BY CATEGORY;