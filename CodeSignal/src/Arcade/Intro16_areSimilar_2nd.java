package Arcade;

import java.util.Arrays;

public class Intro16_areSimilar_2nd { // Arrays.sort 사용하지 않은 풀이
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {3, 2, 1};
		
		System.out.println(areSimilar(a, b));
		System.out.println(areSimilar2(a, b));
	}
	
	static boolean areSimilar(int[] a, int[] b) {
		int rs = 0, s1 = 1, s2 = 1;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != b[i])
	            rs++;
	        s1 *= a[i]; // a[i]-b[i]는 오류가 생길 수 있었는데, 곱하기는 생각못했다.. 대단
	        s2 *= b[i];
	    }
	    return rs <= 2 && s1 == s2;
	}
	
	static boolean areSimilar2(int[] a, int[] b) {
		int sum = 0;
	    for (int i = 0; i < a.length; i++) {
	    	if (a[i] != b[i]) sum++;
    	}
	    Arrays.sort(a);
	    Arrays.sort(b);
	    return Arrays.equals(a, b) && sum < 3; 
	    // for문 돌릴 필요 없이 두 배열이 같은지 비교하는 방법
	}
}
