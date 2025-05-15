-- 코드를 입력하세요
SELECT a.category, SUM(b.SALES) AS "TOTAL_SALES"
FROM BOOK a
JOIN BOOK_SALES b ON a.BOOK_ID = b.BOOK_ID
WHERE TO_CHAR(b.SALES_DATE, 'YYYY-MM') =  '2022-01'
group by a.CATEGORY
order by a.category ASC