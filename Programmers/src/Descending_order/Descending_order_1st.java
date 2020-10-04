package Descending_order;

import java.util.Arrays;
import java.util.Comparator;

public class Descending_order_1st { //  (3.47ms, 53.1MB)

	public static void main(String[] args) {
		long n = 118372;
		
		String N = Long.toString(n);
		
		String[] temp = new String[N.length()];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = String.valueOf(N.charAt(i));
		}
	
		
		Arrays.sort(temp, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		N = "";
		
		for(int i = 0; i < temp.length; i++) {
			N += temp[i];
		}
		
		long answer = Long.parseLong(N);
		
		
		System.out.println(N);
	}

}
