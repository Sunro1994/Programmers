-- 코드를 입력하세요
/*
PATIENT
PT_NO, PT_NAME, GEND_CD, AGE, TLNO
환자번호, 환자이름, 성별코드, 나이, 전화번호를 의미합니다.

DOCTOR 
DR_NAME, DR_ID, LCNS_NO, HIRE_YMD, MCDP_CD, TLNO
의사이름, 의사ID, 면허번호, 고용일자, 진료과코드, 전화번호를 나타냅니다.

APPOINTMENT 
APNT_YMD,   APNT_NO,    PT_NO,  MCDP_CD,    MDDR_ID,   APNT_CNCL_YN,   APNT_CNCL_YMD
진료 예약일시, 진료예약번호, 환자번호, 진료과코드, 의사ID,     예약취소여부,     예약취소날짜를 나타냅니다.


** 
2022년 4월 13일 취소되지 않은 흉부외과(CS) 진료 예약 내역을 조회하는 SQL문을 작성해주세요. 
진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 항목이 출력되도록 작성해주세요. 
결과는 진료예약일시를 기준으로 오름차순 정렬해주세요.
*/

SELECT 
C.APNT_NO AS APNT_NO
, A.PT_NAME AS PT_NAME
, A.PT_NO AS PT_NO
, B.MCDP_CD AS MCDP_CD
, B.DR_NAME AS DR_NAME
, C.APNT_YMD AS APNT_YMD
FROM 
PATIENT A,
DOCTOR B,(
SELECT * 
 FROM APPOINTMENT
 WHERE MCDP_CD ='CS'
    AND TO_CHAR(APNT_YMD,'YYYY-MM-DD') = '2022-04-13'
    AND APNT_CNCL_YN != 'Y'
) C
 WHERE A.PT_NO = C.PT_NO
 AND B.DR_ID = C.MDDR_ID
 ORDER BY apnt_ymd