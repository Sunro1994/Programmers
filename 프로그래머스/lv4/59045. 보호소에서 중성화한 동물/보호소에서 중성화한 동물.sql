-- 코드를 입력하세요
-- 보호소 리스트에 이름이 있고, 성별이 중성화되지 않은 테이블
-- 입양리스트에 이름이 있고, 성별이 중성화된 테이블
-- 두 테이블 모두에 중복되는 이름이 있고 위의 조건을 충족하는 테이블
SELECT 
ANIMAL_ID, 
ANIMAL_TYPE, 
NAME
FROM ANIMAL_OUTS
WHERE 
ANIMAL_ID IN 
(SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE SEX_UPON_INTAKE LIKE 'Intact%')
AND
ANIMAL_ID IN
(SELECT ANIMAL_ID
FROM ANIMAL_OUTS
WHERE SEX_UPON_OUTCOME LIKE 'Neutered%' OR SEX_UPON_OUTCOME LIKE 'Spayed%')
ORDER BY ANIMAL_ID