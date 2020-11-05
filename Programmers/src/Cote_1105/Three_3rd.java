package Cote_1105;

import java.util.HashMap;

public class Three_3rd { // 순서를 바꾸면 안되나봄...

	public static void main(String[] args) {
//		int[] a = {0}; //	0
		int[] a = {5,2,3,3,5,3}; //	4
//		int[] a = {0,3,3,0,7,2,0,2,2,0}; //	8
//		int[] a = {1,2,1,3,4,1,1,3}; //
		
		
		int answer = -1;
		
		String temp = "";
		
		for(int i = 0; i < a.length-1; i+= 2) {
			temp += a[i];
			if(a[i] != a[i+1]) {
				temp += a[i+1];
			}
		}
		
		
		System.out.println(temp);
		

	}

}
