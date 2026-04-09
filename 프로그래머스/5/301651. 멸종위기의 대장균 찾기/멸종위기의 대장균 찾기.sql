with recursive generations as(
    select id, parent_id, 1 as generation
    from ECOLI_DATA
    where parent_id is null
    
    union all
    
    select e.id, e.parent_id, g.generation+1
    from ECOLI_DATA as e
    join generations as g on e.parent_id=g.id
)
select count(*) as count, g.generation as generation
from generations as g
where not exists(
    select 1
    from ECOLI_DATA child
    where child.parent_id=g.id
)
group by generation
order by generation;