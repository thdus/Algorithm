select a.EMP_NO as EMP_NO, a.EMP_NAME as EMP_NAME, case when b.mins>=96 then "S"
                                                        when b.mins>=90 then "A" 
                                                        when b.mins>=80 then "B"
                                                        else "C" end as GRADE, 
                                                    case when b.mins>=96 then a.sal*0.2
                                                        when b.mins>=90 then a.sal*0.15
                                                        when b.mins>=80 then a.sal*0.1
                                                        else 0 end as BONUS
from HR_EMPLOYEES a join (select EMP_NO, sum(score)/2 as mins
                        from HR_GRADE
                        group by EMP_NO, YEAR) b 
                        on a.EMP_NO=b.EMP_NO
order by a.EMP_NO;