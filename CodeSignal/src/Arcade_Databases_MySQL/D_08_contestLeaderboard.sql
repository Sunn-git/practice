/*
ID, 이름, 점수가 LEADERBOARD 테이블에 주어진다.
4위부터 8위 사이의 선수들의 이름을 출력하되 점수 내림차순으로 정렬하기.
*/

SELECT NAME
FROM LEADERBOARD AS O
WHERE ( SELECT COUNT(*)
		FROM LEADERBOARD
		WHERE SCORE >= O.SCORE) BETWEEN 4 AND 8
ORDER BY SCORE DESC;


-- ================================================================== 
-- Tigran's solution

SELECT name FROM leaderboard
ORDER BY score DESC
LIMIT 3,5;

-- ================================================================== 

/*
MySQL에서 결과값 n개 가져오기 :   LIMIT n,
							LIMIT startIndex, n >> startIndex(0부터 시작)부터 n개를 가져오기
*/

-- ================================================================== 