/*
ID, 이름, 성, 신장, 체중이 SUSPECT 테이블에 주어진다.
신장 170이하, 이름이 'Gre*n', 성이 'B'로 시작하지 않는 사람의 ID, 이름, 성을 출력하되 
ID 오름차순으로 정렬하기.
*/

SELECT ID, NAME, SURNAME
FROM SUSPECT
WHERE HEIGHT <= 170 
	OR NAME NOT LIKE 'B%' 
	OR SURNAME NOT LIKE 'Gre_n' 
ORDER BY ID;


-- ================================================================== 
-- eric_noh's solution
select id, name, surname
from Suspect
where not (height > 170
			and name like 'B%'
			and surname like 'Gre_n')
order by id;


-- ================================================================== 

/*
WHERE NOT !
*/

-- ================================================================== 