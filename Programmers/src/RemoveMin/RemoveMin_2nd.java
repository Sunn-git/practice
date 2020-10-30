package RemoveMin;

public class RemoveMin_2nd {

	public static void main(String[] args) { 
		// (2.61ms, 66.9MB) import 없을때
		// (1.71ms, 64.2MB) import java.util.Arrays;가 있으면 실행시간이 더 줄어든다 
		// 왜지? 원래 필요한걸 명시해줘서 그런가?
		int[] arr = {4,3,2,1};
		
		removeMin(arr);
	}
	
	private static int[] removeMin(int[] arr) {
		
		if(arr.length <= 1) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[arr.length-1];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		
		int index = 0;
				
//		for(int i : arr) {
//			System.out.printf("%d, ", i);
//		}
//		System.out.println();
		
		for(int i : arr) {
			if(i != min) answer[index++] = i;
		}
		
//		for(int i : answer) {
//			System.out.printf("%d, ", i);
//		}
		
		return answer;
	}

}
