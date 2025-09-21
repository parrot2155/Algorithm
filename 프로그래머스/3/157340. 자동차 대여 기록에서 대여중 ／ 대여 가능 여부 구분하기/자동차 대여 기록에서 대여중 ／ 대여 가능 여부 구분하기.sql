-- 코드를 입력하세요
SELECT car_id, MAX(CASE WHEN TO_DATE('20221016', 'YYYYMMDD') 
                   BETWEEN start_date AND end_date 
                   THEN '대여중' ELSE '대여 가능' END) AS availability
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC;
