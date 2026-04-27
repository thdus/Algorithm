-- 코드를 입력하세요

SELECT b.groupss as PRICE_GROUP, count(a.PRODUCT_ID) as PRODUCTS
from PRODUCT a join (select floor(price/10000)*10000 as groupss, PRODUCT_ID
    from PRODUCT) b on a.PRODUCT_ID = b.PRODUCT_ID
group by b.groupss
order by b.groupss;






