select month(start_date) as month, car_id, count(*) as record
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE BETWEEN '2022-08-01' AND '2022-10-31'and car_id in

(select car_id
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date between '2022-08-01' and '2022-10-31'
group by car_id
having count(*)>=5)
group by month(start_date), car_id
order by month asc, car_id desc;