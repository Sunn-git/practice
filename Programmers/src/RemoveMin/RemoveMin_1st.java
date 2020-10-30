package RemoveMin;

import java.util.Arrays;

public class RemoveMin_1st {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		
		removeMin(arr);

		
	}
	
	private static int[] removeMin(int[] arr) {
		
		if(arr.length <= 1) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[arr.length-1];
		int[] temp = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		Arrays.sort(temp);
		int index = 0;
		
		System.out.println(temp[0]);

		
		for(int i : arr) {
			System.out.printf("%d, ", i);
		}
		
		for(int i : arr) {
			if(i != temp[0]) answer[index++] = i;
		}
		
		return answer;
	}

}
