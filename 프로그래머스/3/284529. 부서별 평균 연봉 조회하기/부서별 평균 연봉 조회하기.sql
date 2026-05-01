-- 코드를 작성해주세요\
select a.DEPT_ID as DEPT_ID, a.DEPT_NAME_EN	as DEPT_NAME_EN, b.AVG_SAL as AVG_SAL
from HR_DEPARTMENT a join (select round(avg(sal),0) as avg_sal, DEPT_ID
from HR_EMPLOYEES
group by DEPT_ID) b on a.DEPT_ID=b.DEPT_ID
order by AVG_SAL desc;