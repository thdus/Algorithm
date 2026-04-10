-- 코드를 작성해주세요
with recursive generations as(
    select id, PARENT_ID, 1 as generation
    from ECOLI_DATA
    where PARENT_ID	is null
    
    union all
    
    select a.id, a.parent_id, g.generation+1 
    from ECOLI_DATA as a 
    join generations as g
    on a.PARENT_ID = g.id
)
select count(*) as count, g.generation generation
from generations as g
where not exists(
    select 1
    from ECOLI_DATA child
    where child.PARENT_ID=g.id
)
group by g.generation
order by g.generation;