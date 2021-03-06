package FunctionDevelopment;

import java.util.ArrayList;

public class FunctionDev_3rd { // 코드는 짧아졌지만 소요시간이 더 길어졌음 	통과 (8.91ms, 52.1MB)
	public static void main(String[] args) {
//		int[] progresses = {93, 30, 55};
//		int[] speeds = {1, 30, 5}; // 2,1
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1}; // 1,3,2
		
		int[] required = new int[progresses.length];
		
		for(int i = 0; i < progresses.length; i++) {
			int left = 100 - progresses[i];
			required[i] = ((left % speeds[i]) == 0) ? 
					left / speeds[i] : (left / speeds[i]) + 1;
		}
		
		ArrayList<Integer> complete = new ArrayList<Integer>();
		
		for(int i = 0; i < required.length; i++) {
			int length = 0;
			int sum = 0;
			
			for(int s : complete) {
				sum += s;
			}
			
			if(sum == progresses.length) break;
			
			for(int j = i; j < required.length; j++) {
				System.out.printf("i= %d [i]= %d / j= %d [j]= %d\n", i, required[i] , j, required[j]);
				
				if(required[i] < required[j]) {
					i = j-1;
					break;
				}else {
					length++;
				}
			}
			complete.add(length);
		}
		
		System.out.println(complete);
		
		int[] answer = complete.stream().mapToInt(Integer::intValue).toArray();
//		이부분이 시간 왕창 잡아먹음
//		이렇게 변환 안하고 그냥 ArrayList로 리턴하면  0.0x 대에 다 끝남
		
	}

}
