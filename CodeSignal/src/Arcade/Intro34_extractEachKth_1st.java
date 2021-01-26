package Arcade;

import java.util.stream.IntStream;

public class Intro34_extractEachKth_1st { 
	public static void main(String[] args) {
		Intro34_extractEachKth_1st thisClass = new Intro34_extractEachKth_1st();
		
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k = 3;
		
		for(int i : thisClass.extractEachKth(inputArray, k)) {
			System.out.printf("%d, ", i);
		}
		System.out.println();
	}
	
	int[] extractEachKth(int[] inputArray, int k) {
	    int[] result = new int[inputArray.length-(inputArray.length/k)];

	    int idx = 0;
	    for(int i = 0; i < inputArray.length; i++){
	        if((i+1)%k == 0) continue;
	        result[idx++] = inputArray[i];
	    }

	    return result;
	}
	
//	n28646's solution
	int[] extractEachKth_others(int[] inputArray, int k) {
	    return IntStream.range(0, inputArray.length) // 범위 지정
	    				.filter(i -> ((i + 1) % k) != 0) // 조건
	    				.map(i -> inputArray[i])  // 이렇게 하면 배열 길이가 유동적으로 변하나?
	    				.toArray();
	}
}

/*

Stream 공부하기 

*/