-- 코드를 작성해주세요
select case when a.SKILL_CODE&b.fe>0 and a.SKILL_CODE&b.py>0 then 'A'
            when a.SKILL_CODE&b.c>0 then 'B'
            else 'C' end as GRADE, a.id as ID, a.email as EMAIL
from DEVELOPERS a join (select 
                        sum(case when category='Front End' then code end) as fe,
                        max(case when name='Python' then code end) as py,
                        max(case when name='C#' then code end) as c
                       from SKILLCODES) as b
where b.fe&a.SKILL_CODE>0 or a.SKILL_CODE&b.c>0
order by grade, id;