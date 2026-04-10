SELECT DR_NAME,DR_ID,MCDP_CD, date_format(HIRE_YMD,'%Y-%m-%d') as HIRE_YMD
from doctor
where MCDP_CD='cs' or MCDP_CD='gs'
order by HIRE_YMD desc, dr_name;