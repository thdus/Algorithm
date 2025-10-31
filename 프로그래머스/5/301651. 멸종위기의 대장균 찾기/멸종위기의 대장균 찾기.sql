-- 코드를 작성해주세요

WITH RECURSIVE generations AS (
    -- 1세대: 부모가 없는 개체들
    SELECT
        ID,
        PARENT_ID,
        1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL

    UNION ALL

    -- 그 다음 세대: 이전 세대의 자식들
    SELECT
        e.ID,
        e.PARENT_ID,
        g.GENERATION + 1
    FROM ECOLI_DATA e
    JOIN generations g
      ON e.PARENT_ID = g.ID
)
SELECT
    COUNT(*) AS COUNT,
    g.GENERATION AS GENERATION
FROM generations g
WHERE NOT EXISTS (
    -- 자식이 없는 개체만 선택
    SELECT 1
    FROM ECOLI_DATA child
    WHERE child.PARENT_ID = g.ID
)
GROUP BY g.GENERATION
ORDER BY g.GENERATION ASC;
