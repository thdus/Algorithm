-- 코드를 입력하세요
# select year(SALES_DATE) as year,  month(SALES_DATE) as month, count(distinct user_id) as purchased_users
# from ONLINE_SALE
# where year(SALES_DATE)='2022'
# group by month;

# SELECT year(joined) as year, month(joined) as month, count(*) as j
# from USER_INFO
# where year(joined)='2021'
# group by month;

SELECT
    YEAR(O.SALES_DATE) AS YEAR,
    MONTH(O.SALES_DATE) AS MONTH,
    COUNT(DISTINCT O.USER_ID) AS PURCHASED_USERS,
    ROUND(
        COUNT(DISTINCT O.USER_ID) / (
            SELECT COUNT(*)
            FROM USER_INFO
            WHERE YEAR(JOINED) = 2021
        ),
        1
    ) AS PURCHASED_RATIO
FROM USER_INFO U
JOIN ONLINE_SALE O
  ON U.USER_ID = O.USER_ID
WHERE YEAR(U.JOINED) = 2021
GROUP BY YEAR(O.SALES_DATE), MONTH(O.SALES_DATE)
ORDER BY YEAR, MONTH;