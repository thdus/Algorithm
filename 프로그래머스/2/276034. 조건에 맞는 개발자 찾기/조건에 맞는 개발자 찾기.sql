-- 코드를 작성해주세요
# SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
# FROM DEVELOPERS 
# WHERE SKILL_CODE NOT IN (4) OR SKILL_CODE IN (1024)
# ORDER BY ID;

SELECT distinct(id), email, first_name, last_name
FROM developers as A JOIN skillcodes as B ON A.skill_code & B.code = B.code
where name in ('Python', 'C#')
order by id;