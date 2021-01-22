package Arcade;

public class Intro20_arrayMaximalAdjacentDifference_1st { 
	public static void main(String[] args) {
		Intro20_arrayMaximalAdjacentDifference_1st thisClass = new Intro20_arrayMaximalAdjacentDifference_1st();
		
		int[] inputArray = {2, 4, 1, 0};
		System.out.println(thisClass.arrayMaximalAdjacentDifference(inputArray));
	}
	
	int arrayMaximalAdjacentDifference(int[] inputArray) {
	    int max = 0;

	    for(int i = 1; i < inputArray.length; i++){
	        int difference = Math.abs(inputArray[i-1] - inputArray[i]);
	        if(max < difference) max =  difference;
	    }

	    return max;
	}
}

/*

참고 ) 배열의 최대, 최소값을 구하는 세가지 방법
- for문 사용
- Arrays.sort 사용

- Stream 사용***
Arrays.stream(arr).max().getAsInt();
Arrays.stream(arr).min().getAsInt();



*/