package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BT_2661_2nd { // 좋은 수열 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dfs(n, 0, "", 0);
		
	}
	
	static void dfs(int n, int num, String result, int depth) { // int 나 long으로 처리하기엔 너무 숫자가 커져서 string으로 변경
		if(num != 0) result = result.concat(String.valueOf(num));
		if(hasPalindrome(result)) return; // 이걸 마지막에 처리하면 완전탐색이 되기 때문에 처리시간이 너무 길어진다.
		
		if(depth == n) {
			System.out.println(result);
			System.exit(0);
		}
		
		for(int i = 1; i <= 3; i++) { // for문으로 처리하니 훨씬 깔끔
			if(i != num) dfs(n, i, result, depth+1);
		}
		
		return;
	}
	
	static boolean hasPalindrome(String result) {
		for(int i = 2; i <= result.length()/2; i++) { // 묶을 길이 
			for(int j = 0; i*2+j <= result.length(); j++) { // 배열로 만드는 방법이 너무 오래걸리나 싶어서 for문으로 비교하는 방법으로 대체
				String temp = result.substring(j, i+j);
				String temp2 = result.substring(i+j, i*2+j);
				
				if(temp.equals(temp2)) return true;
			}
		}
		
		return false;
	}
}


/*

현재 (21360	200)
hasPalindrome을 처음에 시도한 것처럼 정규식으로 i개씩 나눈 다음에 비교하면 (56228KB	608ms)로 메모리도 시간도 대략 3배씩 더 소요된다.

= 놓친 부분 = 
숫자의 범위를 생각 안하고 결과를 int로 만들었다.
문제의 시간제한은 생각 안하고 먼저 생각난 방법으로 풀려고 했다.
함수를 따로 만들지 않고 한번에 넣으려고 했다.
코드 확인을 제대로 하지 않았다!! >> for문에서 j++을 i++로 잘못 작성한거.

 
 */
