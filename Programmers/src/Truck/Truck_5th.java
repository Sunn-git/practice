package Truck;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_5th { // queue 사용해봤음. 시간이 훨씬 줄어들었다.
						 // 최대 소요시간 (32.27ms, 60.6MB)

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

		
		Queue<Integer> bridge = new LinkedList<Integer>();
		int sec = 0;
		int sum = 0;
		
		for(int i = 0; i < truck_weights.length; i++) {
			
			for(int j = 0; j < bridge_length; j++) {
				
				sec++;
				
				if(bridge.size() == bridge_length) 
					sum -= bridge.poll();
//					sum -= bridge.remove(); 
				//결과는 동일한데 최대 소요시간이 2.2초 정도 늘어남
				
				if(sum + truck_weights[i] > weight) {
					bridge.offer(0);
//					bridge.add(0);
				}else{
					bridge.offer(truck_weights[i]);
					sum += truck_weights[i];
					break;
				}
			}
		}
		
		sec += bridge_length;
		
		System.out.println(bridge);
		System.out.println(sec);
	}
}
