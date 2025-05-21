-- 코드를 입력하세요
SELECT ANIMAL_ID,NAME
FROM ANIMAL_INS
WHERE ANIMAL_type = 'Dog'AND upper(NAME) LIKE '%EL%'
ORDER BY NAME 

-- 대소문자 구별안하려고 다 대문자로 바꿔버리는 전략