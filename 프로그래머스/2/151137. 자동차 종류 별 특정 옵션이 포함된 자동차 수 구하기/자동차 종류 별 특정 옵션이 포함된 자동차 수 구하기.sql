-- 코드를 입력하세요
SELECT CAR_TYPE, count(*) as cars
from CAR_RENTAL_COMPANY_CAR
where options like '%통풍%' or options like '%열선%' or options like '%가죽%'
group by CAR_TYPE	
order by CAR_TYPE;



# 트럭 3
# 세단 6
# suv 6
# 승합차 3
# 리무진 2
