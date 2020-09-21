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
		
		
		int answer = 0;
		ArrayList<Integer> bridge = new ArrayList<Integer>(); 
		
		for(int i = 0; i < truck_weights.length; i++) {
			
			if(bridge.size() >= bridge_length) {
				bridge.remove(0);
			}
			
			bridge.add(truck_weights[i]);
			
			if(i == 0) {
				answer++;
			}
			
			if(i > 0) {
				int sum = 0;
				for(int s : bridge) {
					sum += s;
				}
				
				if(sum > weight) {
					bridge.remove(0);
					answer += bridge_length;
				}else {
					answer++;
				}
			}
		}
		
		answer += bridge_length;
		

		

		
		
		System.out.println(answer);
	}
}
