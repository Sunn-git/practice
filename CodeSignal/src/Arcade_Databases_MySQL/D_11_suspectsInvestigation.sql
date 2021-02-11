/*
ID, 이름, 성, 신장, 체중이 SUSPECT 테이블에 주어진다.
신장 170이하, 이름이 'Gre*n', 성이 'B'로 시작하는 사람의 ID, 이름, 성을 출력하되 
ID 오름차순으로 정렬하기.
*/

SELECT ID, NAME, SURNAME
FROM SUSPECT
WHERE HEIGHT <= 170 
	AND NAME LIKE 'B%' 
	AND SURNAME LIKE 'Gre%n' 
	AND LENGTH(SURNAME) = 5
ORDER BY ID;


-- ================================================================== 
-- guardsmanbob's solution
SELECT id, name, surname FROM Suspect
WHERE height <= 170 
	AND LOWER(name) LIKE 'b%'
	AND LOWER(surname) LIKE 'gre_n'
ORDER BY id;

-- ================================================================== 

/*
MySQL에서 대소문자 변경하기 :   LOWER(string),
						   UPPER(string)
LIKE 에서 와일드카드 % : 어떤 길이든 상관 없음 (0 ~ 무한)
				 _ : 어떤 글자든 한 글자
*/

-- ================================================================== 