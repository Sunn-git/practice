package Truck;

public class Truck_1st { // 완전 틀림 
	public static void main(String[] args) {
		int bridge_length = 2; 
		int weight = 10;
		int[] truck_weights = {7,4,5,6}; //8
		
//		int bridge_length = 100; 
//		int weight = 100;
//		int[] truck_weights = {10}; // 101
		
//		int bridge_length = 100; 
//		int weight = 100;
//		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10}; //110
		
		int answer = 0;
		int count = 0;
		
		int numOfTrucks = truck_weights.length;
		
		for(int i = 0; i < numOfTrucks; i++) {
			if(i == 0) {
				count++;
				continue;
			}

			if(truck_weights[i-1] + truck_weights[i] > weight) count++;
		}
		
		if(count == 1) {
			answer = bridge_length + numOfTrucks;
		}else if( count == 2) {
			answer = count*(bridge_length -1) + numOfTrucks*2 -1;
		}else {
			answer = count*(bridge_length -1) + numOfTrucks +1;
		}
		
		
		
		System.out.println(answer);
	}

}
