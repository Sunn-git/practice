package H_Index;

import java.util.Arrays;

public class H_Index_1st { //(12.24ms, 53.5MB)

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5}; //3
//		int[] citations = {12, 11, 10, 9, 8, 1}; //5
//		int[] citations = {6, 6, 6, 6, 6, 1}; //5
//		int[] citations = {0, 0, 1, 1}; //1
		
		Arrays.sort(citations);
		
		for(int i : citations) System.out.printf("%d, ", i);
		System.out.println();
		
//		배열에서 n보다 큰 수가 n개 이상인 수 중에 가장 큰 수

		int hIndex = 0;
		int[] count = new int[citations.length];
		
		for(int i = 1; i <= citations.length; i++) { // 발표한 논문 수
			for(int j = 0; j < citations.length; j++) { //인용 수
				if(citations[j] >= i) {
					count[i-1]++;
				}
			}
			
			if(count[i-1] == i) {
				hIndex = i;
				System.out.printf("%d / %d", count[i-1], i);
				System.out.println();
			}else if(count[i-1] > i) {
				hIndex = i;
			}
		}
		
		for(int i : count)System.out.printf("%d, ", i);
		System.out.println();
		
		System.out.println(hIndex);
	}

}
