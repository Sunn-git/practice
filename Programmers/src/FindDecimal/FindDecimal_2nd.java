package FindDecimal;

public class FindDecimal_2nd {
	public static int[] decimals;
	public static int answer = 0, idx;
	public static void main(String[] args) {
		String numbers = "17"; // 3
//		String numbers = "011"; // 2
		
		decimals = new int[(int)Math.pow(10, numbers.length())+1];
		
		for(int i = 2; i < decimals.length; i++) {
			decimals[i] = i;
		}
		
		for(int i = 2; i <= Math.sqrt(decimals.length); i++) {
			for(int j = i+i; j < decimals.length; j += i) {
				decimals[j] = 0;
			}
		}
		
		char[] arr = numbers.toCharArray();
		boolean[] check = new boolean[arr.length];
		
		for(int i = 1; i <= arr.length; i++) {
			dfs(arr, check, new char[i], 0);
		}
		
		System.out.println(answer);
	}
	
	static void dfs(char[] arr, boolean[] check, char[] result, int depth) {
		if(depth == result.length) {
			idx = Integer.parseInt(String.valueOf(result));
			if(idx == 1) return;
			
			if(decimals[idx] > 0) {
				answer++;
				decimals[idx] = -1;
			}
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
	set 사용하지 않고 바로 소수 여부 판별하기
*/
