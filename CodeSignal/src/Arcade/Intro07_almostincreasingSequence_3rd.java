package Arcade;

import java.util.Arrays;
import java.util.HashSet;

public class Intro07_almostincreasingSequence_3rd { 
	// youtube : https://www.youtube.com/watch?v=qNmmJRH5HhQ
	public static void main(String[] args) {
//		int[] sequence = {1, 3, 2}; 
//		int[] sequence = {1, 1, 2}; 
//		int[] sequence = {1, 2, 1, 2}; 
//		int[] sequence = {1, 1, 1, 2}; 
//		int[] sequence = {1, 3, 2, 1}; //false 
//		int[] sequence = {3, 6, 5, 8, 10, 20, 15}; //false
//		int[] sequence = {1, 4, 10, 4, 2}; //false
		int[] sequence = {40, 50, 60, 10, 20, 30}; //false
//		int[] sequence = {10, 1, 2, 3, 4, 5, 6, 1}; //false
		
		
		System.out.println(fx(sequence));

	}
	
	public static boolean fx(int[] sequence) {
		int size = sequence.length;
		int counter = 0;
		
		if(size == 2) return true;
		
		for(int i = 0; i < size-1; i++) {
			if(sequence[i+1] <= sequence[i]) {
				counter++;
				boolean skipNeighbor = i+2 < size && sequence[i+2] <= sequence[i];
				boolean skipBack = i-1 >= 0 && sequence[i+1] <= sequence[i-1];
				if(skipNeighbor && skipBack || counter>= 2) return false;
			}
		}
		return true;
	}
}
