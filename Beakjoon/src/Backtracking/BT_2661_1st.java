package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BT_2661_1st { // 좋은 수열 9퍼에서 틀림..
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dfs(n, 0, 0, 0);
		
	}
	
	static void dfs(int n, int num, int result, int depth) {
		result *= 10;
		result += num;
		
		if(depth == n) {
			if(hasPalindrome(result)) return; // 이걸 return처리 안해주고 위에 if문과 합치면 stackOverFlow 에러 발생(dfs가 끝나지 않음)
			
			System.out.println(result);
			System.exit(0);
		}
		
		for(int i = 1; i <= 3; i++) { // for문으로 처리하니 훨씬 깔끔
			if(i != num) dfs(n, i, result, depth+1);
		}
		
		return;
	}
	
	static boolean hasPalindrome(int result) { //Palindrome아님.....
		String s = String.valueOf(result);
		
		for(int i = 2; i <= s.length()/2; i++) { // 묶을 길이 
			for(int j = 0; j < i; j++) { // 시작 인덱스 j++자리에 i++을 써놓고 안돼서 손놓고있었다...... 대박
				String reg = "(?<=\\G.{"+i+"})"; // i개씩 자르는 정규식
				String[] arr = s.substring(j).split(reg); // 인덱스 j부터 i개씩 묶어서 배열로 만들기
				
				for(int k = 0; k < arr.length-1; k++) { // 배열값에 중복있는지 확인
					if(arr[k].equals(arr[k+1])) return true;
				}
			}
		}
		
		return false;
	}
}


/*
 
 */
