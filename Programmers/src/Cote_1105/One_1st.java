package Cote_1105;

public class One_1st {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		
		int answer = dotProduct(a, b);
		
		System.out.println(answer);

	}
	
	private static int dotProduct(int[] a, int[] b) {
		int dp = 0;
		
		for(int i = 0; i < a.length; i++) {
			dp += a[i] * b[i];
		}
		
		return dp;
	}

}
