package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_15650_1st { // N과 M (2)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[Integer.parseInt(st.nextToken())];
		
		dfs(n, 0, 1, nums, sb);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(int n, int depth, int at, int[] nums, StringBuffer sb) {
		if(depth == nums.length) {
			for(int i : nums) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;			
		}
		
		for(int i = at; i <= n; i++) {
			nums[depth] = i;
			dfs(n, depth+1, i+1, nums, sb);
		}
		return;
	}		
}


/*
 
 N과 M (1)과 똑같은 문제가 아님
 이 문제는 숫자의 순서가 상관없다. >> 조합
 
 https://st-lab.tistory.com/115?category=862595 블로그 참고.
 for문이 시작할 위치를 인자로 넘겨주는 것이 포인트.
 이미 지나간 순서의 숫자는 다시 나타날 일이 없기 때문에 boolean배열로 확인해주지 않아도 된다.
 
 
 
 

 */
