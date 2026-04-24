# select writer_id as user_id, sum(PRICE) as total_sales 	
# from USED_GOODS_BOARD
# group by writer_id;
select a.USER_ID as USER_ID, a.NICKNAME as NICKNAME, b.total_sales as TOTAL_SALES
from USED_GOODS_USER a join (select writer_id, sum(PRICE) as total_sales 	
from USED_GOODS_BOARD
where status = 'DONE'
group by writer_id) b on a.USER_ID=b.writer_id
where b.total_sales>=700000
order by b.total_sales;