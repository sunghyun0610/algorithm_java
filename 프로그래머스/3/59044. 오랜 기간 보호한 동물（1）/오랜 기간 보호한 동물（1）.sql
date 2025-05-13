-- 코드를 입력하세요
SELECT NAME, DATETIME
FROM ANIMAL_INS 
WHERE ANIMAL_ID IN(SELECT *     
                    FROM(SELECT a.ANIMAL_ID
                      FROM ANIMAL_INS a
                      left JOIN ANIMAL_OUTS b ON a.ANIMAL_ID=b.ANIMAL_ID
                      WHERE b.ANIMAL_ID IS NULL
                      ORDER BY a.DATETIME ASC
                      fetch FIRST 3 ROWS ONLY)
                   )
ORDER BY DATETIME;
