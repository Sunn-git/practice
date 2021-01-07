package Arcade;

import java.util.Arrays;
import java.util.HashSet;

public class Intro07_almostincreasingSequence_1st { // 테스트케이스 통과하지만 시간초과로 4개 통과 못함.
	public static void main(String[] args) {
		int[] sequence = {1, 3, 2}; 
//		int[] sequence = {1, 1, 2}; 
//		int[] sequence = {1, 2, 1, 2}; 
//		int[] sequence = {1, 1, 1, 2}; 
//		int[] sequence = {1, 3, 2, 1}; //false 
//		int[] sequence = {3, 6, 5, 8, 10, 20, 15}; //false
//		int[] sequence = {1, 4, 10, 4, 2}; //false
//		int[] sequence = {40, 50, 60, 10, 20, 30}; //false
//		int[] sequence = {10, 1, 2, 3, 4, 5, 6, 1}; //false
		
		
		System.out.println(fx(sequence));

	}
	
	public static boolean fx(int[] sequence) {
		int length = sequence.length;
		
		if(length == 2) return true; //길이
		
		HashSet<Integer> set = new HashSet<Integer>(); //중복 2개 이상
		int f = 0;
		for(int i : sequence) {
			if(!set.add(i)) f++;
		}
		if(f > 1) return false;
		
		int[] temp = new int[length-1];
		int[] sorted = new int[length-1];
		int idx = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(i != j) {
					temp[idx] = sequence[j];
					sorted[idx++] = sequence[j];
				}
			}
			
			Arrays.sort(sorted);
			
			for(int j = 0; j < temp.length; j++) {
				if(temp[j] != sorted[j]) break;
				if(j == temp.length-1) return true;
			}
			
			idx = 0;
		}
		
		return false;
	}
}
