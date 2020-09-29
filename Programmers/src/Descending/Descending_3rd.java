package Descending;

import java.util.Arrays;

public class Descending_3rd { // 다른사람의 풀이 (0.69ms, 51.9MB) 엄청빠르다

	public static void main(String[] args) {
		String str = "Zbcdefg";
		
		char[] sol = str.toCharArray();
	    Arrays.sort(sol);
	    
	    System.out.println(
	    	new StringBuilder(new String(sol)) 
	    	// char[]를 이렇게 간단히 String으로 바꿀 수 있다.
	    	.reverse()
	    	.toString()
	    	
	    	);
	}

}
