package Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class M1_1011_1st { // Fly me to the Alpha Centauri
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		int x, y;
		
		for(int i = 0 ; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			int length = y - x;
			
			if(length < 3) {
				System.out.println(length);
			}else {
				
			}
			
		}
				
		bw.write(String.valueOf(""));		
		bw.flush();
		
		br.close();
		bw.close();	
	}
	
}


/*

이동거리 : 처음 +1 / 1-2 / 1-3 / 1-4 / 1-5 /  / 1-5 / 1-4 / 1-3 / 1-2 / 마지막+1
최대 이동거리는 1씩 늘어난다  >> 1 2 3 4 5 4 3 2 1

줄이 바뀌는 숫자의 개수 : 1(11) 2(1221) 3(123321) 4(12344321) 5 5 ...

1 >> 1					1 	증가량 : 1 4 6 8 10

2 >> 1 1				2

3 >> 1 1 1
4 >> 1 2 1  : 2 한번 등장
5 >> 1 2 1 1
6 >> 1 2 2 1 : 2 두번 등장	6

7 >> 1 2 2 1 1
8 >> 1 2 2 2 1
9 >> 1 2 3 2 1 : 3 한번 등장
10>> 1 2 3 2 1 1
11>> 1 2 3 2 2 1
12>> 1 2 3 3 2 1 : 3 두번 등장	12	

13>> 1 2 3 3 2 1 1
14>> 1 2 3 3 2 2 1
15>> 1 2 3 3 3 2 1
16>> 1 2 3 4 3 2 1 : 4 한번 등장
17>> 1 2 3 4 3 2 1 1
18>> 1 2 3 4 3 2 2 1
19>> 1 2 3 4 3 3 2 1
20>> 1 2 3 4 4 3 2 1 : 4 두번 등장	20

21>> 1 2 3 4 4 3 2 1 1
22>> 1 2 3 4 4 3 2 2 1
23>> 1 2 3 4 4 3 3 2 1
24>> 1 2 3 4 4 4 3 2 1
25>> 1 2 3 4 5 4 3 2 1 : 5 한번 등장	25

26>> 1 2 3 4 5 4 3 2 1 1

가운데 k+1번째 숫자가 끼어들 수 있도록 k번째 수가 3번 등장하면
그 다음 순서에서 k+1번째 숫자가 처음 등장하고
그 다음 순서에서 길이가 1 늘어난다.



  	
*/

