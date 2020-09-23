package Truck;

import java.util.ArrayList;

public class Truck_4th { // 드디어 통과 근데 엄청 오래걸림 (5376.66ms, 62.5MB)
						 // 구글검색해서 힌트 봄. 근데 queue는 안씀...
/*
	1. queue가 비어있으면, 트럭의 무게를 넣는다.
	2. 트럭이 다리를 다 지났으면, queue 크기는 다리 길이와 동일하므로 queue에서 꺼내 최대 무게에서 빼준다.
	3. queue가 비어있지않고, 무게가 초과될때 0을 넣는다.
	4. queue가 비어있지않고, 무게가 충분할때 트럭의 무게를 넣는다.

 */
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
		int sec = 0;
		
		for(int i = 0; i < truck_weights.length; i++) {
			
			for(int j = 0; j < bridge_length; j++) {
				
				sec++;
				
				if(bridge.size() == bridge_length) 
					bridge.remove(0);
					System.out.printf("remove : %d\n", bridge.remove(0));
				
				int sum = 0;
				for(int s : bridge) sum += s;

				if(sum + truck_weights[i] > weight) {
					bridge.add(0);
					
				}else {
					bridge.add(truck_weights[i]);
					break;
				}
				
			}		
			System.out.println(bridge);
		}
		
		sec += bridge_length;
		
		System.out.println(sec);
		

	}
}
