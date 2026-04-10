-- 코드를 입력하세요
SELECT a.history_id, floor(
case
    when datediff(a.end_date,a.start_date)+1>=90 then
    b.daily_fee*(datediff(a.end_date,a.start_date)+1)*(100-(
        select discount_rate
        from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
        where car_type = '트럭' and duration_type = '90일 이상'
                                                          ))/100
    when datediff(a.end_date,a.start_date)+1>=30 then
    b.daily_fee*(datediff(a.end_date,a.start_date)+1)*(100-(
        select discount_rate
        from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
        where car_type = '트럭' and duration_type = '30일 이상'
                                                          ))/100
    when datediff(a.end_date,a.start_date)+1>=7 then
    b.daily_fee*(datediff(a.end_date,a.start_date)+1)*(100-(
        select discount_rate
        from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
        where car_type = '트럭' and duration_type = '7일 이상'
                                                          ))/100
    else
        b.daily_fee*(datediff(a.end_date,a.start_date)+1)
    end
)as fee
from CAR_RENTAL_COMPANY_RENTAL_HISTORY AS A
JOIN CAR_RENTAL_COMPANY_CAR AS B 
ON a.car_id = b.car_id
where b.car_type='트럭'
order by fee desc, a.history_id desc;
