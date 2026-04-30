-- 코드를 작성해주세요
select b.tot, b.EMP_NO, a.EMP_NAME, a.POSITION, a.EMAIL
from HR_EMPLOYEES a join (select sum(SCORE) as tot,EMP_NO
                    from HR_GRADE 
                    group by EMP_NO, YEAR) b on a.EMP_NO=b.EMP_NO
where b.tot=(select max(tot) from (select sum(SCORE) as tot,EMP_NO
                    from HR_GRADE 
                    group by EMP_NO, YEAR) c);
