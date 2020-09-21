package Truck;

import java.util.ArrayList;
import java.util.HashMap;

public class Truck_2nd { //여기도 망
	public static void main(String[] args) {
		
//		int bridge_length = 2; 
//		int weight = 10;
//		int[] truck_weights = {7,4,5,6}; //8
		
		int bridge_length = 100; 
		int weight = 100;
		int[] truck_weights = {10}; // 101
		
//		int bridge_length = 100; 
//		int weight = 100;
//		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10}; //110
		
		
		int answer = 0;
		
//		ArrayList<Integer> bridge = new ArrayList<Integer>();
//		HashMap<Integer,Integer> bridge = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < truck_weights.length-1; i++) {

			int index = 0;
			
			for(int j = 0 ; j < bridge_length; j++) {
				index++;
				answer += index;
				
				if(truck_weights[i] + truck_weights[i+1] <= 10) {
					index = 0;
					break;
				}	
			}
			
			
		}


		
		
		System.out.println(answer);
	}
}
