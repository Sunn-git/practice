/*
날짜, 이름, 제목이 MISCHIEF 테이블에 주어진다.
요일(월요일 0 부터 일요일 6 까지), 날짜, 이름, 제목을 출력하되 
이름 (Huey, Dewey, Louie 순), 날짜, 제목 사전순으로 정렬하기.
*/

SELECT WEEKDAY(MISCHIEF_DATE) AS WEEKDAY, MISCHIEF_DATE, AUTHOR, TITLE
FROM MISCHIEF
ORDER BY WEEKDAY, FIELD(AUTHOR, 'Huey', 'Dewey', 'Louie'), MISCHIEF_DATE, TITLE;


-- ================================================================== 
-- kitcat's solution
SELECT
	WEEKDAY(mischief.`mischief_date`) AS `weekday`,
	mischief.*
FROM
	mischief
ORDER BY
	`weekday` ASC,
	FIELD(mischief.`author`, 'Huey', 'Dewey', 'Louie'),
	mischief.`mischief_date`,
	mischief.`title` ASC;

-- ================================================================== 

/*
MySQL에서 date타입 요일 확인하기 :   DAYOFWEEK('2021-02-11'), 정수(일 1 ~ 토 7)
								WEEKDAY(date), 정수 (월 0 ~ 일 6)
								DAYNAME(date), 영어 요일
                                
My SQL 날짜 관련 함수 참고 : https://jang8584.tistory.com/7

*/

-- ================================================================== 