package Truck;

import java.util.ArrayList;

public class Truck_3rd { //구글 검색하고 힌트만 봌(진입시간 확인) 코드안봄
	public static void main(String[] args) {
		
		int bridge_length = 5; 
		int weight = 5;
		int[] truck_weights = {2, 2, 2, 2, 1, 1, 1, 1, 1}; //19
		
//		int bridge_length = 2; 
//		int weight = 10;
//		int[] truck_weights = {7,4,5,6}; //8
		
//		int bridge_length = 100; 
//		int weight = 100;
//		int[] truck_weights = {10}; // 101
		
//		int bridge_length = 100; 
//		int weight = 100;
//		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10}; //110
		
		ArrayList<Integer> bridge = new ArrayList<Integer>();
		int[] indexes = new int[truck_weights.length];
		int entry = 0;
		int length = 0;
		
		for(int i = 0; i < truck_weights.length; i++) {
			length = 0;
			
			int sum = 0;
			for(int s : bridge) {
				sum += s;
			}
			

			if(i == 0) {
				entry++;
				continue;
			}
			System.out.println("========");
			System.out.println(sum);
			if(sum + truck_weights[i] > weight) {
				bridge = new ArrayList<Integer>();
				entry += bridge_length;
			}else {
				System.out.println(i);
				length++;
			}
			
			
			bridge.add(truck_weights[i]);
			
//			for(int j = 1; j <= bridge_length; j++) {
//				indexes[i]++;
//			}
			System.out.println(bridge);
		}
		
		
		System.out.println(entry);
		System.out.println(length);
		

	}
}
