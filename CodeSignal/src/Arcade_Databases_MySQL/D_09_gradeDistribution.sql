-- SELECT version();

/*
성적을 산출하는 방법 3가지가 있고
이름, ID, 중간점수1, 중간점수2, 기말점수 가 GRADES테이블에 주어진다.
세번째 방법(기말100%) 의 점수가 가장 높은 세사람의 이름과 ID를 출력하되
이름 첫 세글자를 기준으로 사전순 정렬 후 ID 오름차순으로 정렬하기.
*/
 
SELECT NAME, ID
FROM GRADES
WHERE (Midterm1*0.25+Midterm2*0.25+Final*0.5) < FINAL 
		AND (Midterm1*0.5+Midterm2*0.5) < FINAL
ORDER BY LEFT(NAME, 3), ID;


-- ================================================================== 

/*
MySQL에서 문자열 자르기 : LEFT(string, length),
					  RIGHT(string, length), 
                      SUBSTRING(string, startIndex, length),
                      SUBSTRING(string FROM startIndex FOR length),
                      SUBSTRING_INDEX(string, delimiter, count) >> 구분자로 문자열 자르기
*/

SELECT SUBSTRING_INDEX("www.mysql.com",".",2);
-- 결과 : www.mysql  >> count번째의 구분자 바로 앞 까지 자른다.

-- 참고 : https://yeahvely.tistory.com/89 

-- ================================================================== 
--  hgminh's solution
	select Name, ID from Grades
    where 2 * final > midterm1 + midterm2
    order by left(name, 3) asc, id asc;