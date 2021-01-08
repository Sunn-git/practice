package Arcade;

import java.util.Arrays;
import java.util.HashSet;

public class Intro07_almostincreasingSequence_2nd { 
	public static void main(String[] args) {
//		int[] sequence = {1, 3, 2}; 
//		int[] sequence = {1, 1, 2}; 
//		int[] sequence = {1, 2, 1, 2}; //false
//		int[] sequence = {1, 1, 1, 2}; 
//		int[] sequence = {1, 3, 2, 1}; //false 
//		int[] sequence = {3, 6, 5, 8, 10, 20, 15}; //false
//		int[] sequence = {1, 4, 10, 4, 2}; //false
//		int[] sequence = {40, 50, 60, 10, 20, 30}; //false
//		int[] sequence = {10, 1, 2, 3, 4, 5, 6, 1}; //false

//		int[] sequence = {1, 2, 4, 1}; //true
//		int[] sequence = {1, 3, 2, 1}; //false
//		int[] sequence = {5, 1, 2, 3, 4}; //true
//		int[] sequence = {3, 6, 9, 1, 2}; //false
		int[] sequence = {1, 2, 3, 4, 99, 5, 6}; //true
		
		
		
		System.out.println(fx(sequence));

	}
	
	public static boolean fx(int[] sequence) {
		int length = sequence.length;		
		if(length == 2) return true; //길이
		
		int falseCnt = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				
			}
		}
		
		return true;
	}
	
	public static boolean fx1(int[] sequence) {
		int length = sequence.length;		
		if(length == 2) return true; //길이
		
		int falseCnt = 0;
		for(int i = 1; i < length; i++) {

			if(sequence[i-1] > sequence[i]) {
				if(falseCnt == 1) return false;
				falseCnt++;
			}
			
			if(falseCnt == 1 && i < length-1 && i > 1) {
				if(sequence[i-1] > sequence[i+1]) return false;
			}
		}
		
		return true;
	}
}
