-- 코드를 입력하세요
select b.YEAR as YEAR, b.MONTH as MONTH, a.gender as GENDER, count(distinct(b.user_id)) as USERS
from USER_INFO a join (SELECT year(SALES_DATE) as YEAR, month(SALES_DATE) as MONTH, USER_ID
from ONLINE_SALE) b on a.USER_ID=b.USER_ID
where a.gender =1 or a.gender=0
group by b.YEAR, b.MONTH, a.gender
order by b.YEAR, b.MONTH, a.gender;



# 98	1
# 70	0
# 170	1
# 68 2번	1
# 140	0
# 126	0
# 103


