-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, TO_CHAR(DATETIME,'YYYY-MM-DD') AS DATETIME
    FROM ANIMAL_INS
        ORDER BY ANIMAL_ID ASC;