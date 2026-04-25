-- 코드를 입력하세요
SELECT hour(DATETIME) as HOUR, count(ANIMAL_ID) as COUNT
from ANIMAL_OUTS
where hour(DATETIME) between 9 and 19
group by hour(DATETIME)
order by hour(DATETIME);