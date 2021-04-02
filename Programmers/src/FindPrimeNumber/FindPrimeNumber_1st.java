package FindDecimal;

import java.util.HashSet;
import java.util.Set;

public class FindDecimal_1st {
	public static void main(String[] args) {
//		String numbers = "17"; // 3
		String numbers = "011"; // 2
		int answer = 0;
		
		int[] decimals = new int[(int)Math.pow(10, numbers.length())+1];
		
		for(int i = 2; i < decimals.length; i++) {
			decimals[i] = i;
		}
		
		for(int i = 2; i <= Math.sqrt(decimals.length); i++) {
			for(int j = i+i; j < decimals.length; j += i) {
				decimals[j] = 0;
			}
		}
		
//		for(int i : decimals) {
//			if(i != 0) {
//				System.out.println(i);	
//				answer++;
//			}
//		}
		
		char[] arr = numbers.toCharArray();
		boolean[] check = new boolean[arr.length];
		
		for(int i = 1; i <= arr.length; i++) {
			dfs(arr, check, new char[i], 0);
		}
		
		for(int i : set) {
			if(decimals[i] != 0) answer++;
		}
		
		
		System.out.println(answer);
	}
	static Set<Integer> set = new HashSet<Integer>();
	
	static void dfs(char[] arr, boolean[] check, char[] result, int depth) {
		if(depth == result.length) {
			if(String.valueOf(result).equals("1")) return;
			
			set.add(Integer.parseInt(String.valueOf(result)));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(!check[i]) {
				check[i] = true;
				result[depth] = arr[i];
				dfs(arr, check, result, depth+1);
				check[i] = false;
			}
		}
		return;
	}
}


/*
 소수 배열 미리 만들기
 주어진 숫자를 dfs로 순열로 만들기 
 set으로 중복값 걸러내기 
 set에 담긴 숫자 중 소수 개수 세기
 
*/
