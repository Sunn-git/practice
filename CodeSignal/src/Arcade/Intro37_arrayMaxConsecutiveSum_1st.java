package Arcade;

public class Intro37_arrayMaxConsecutiveSum_1st { 
	public static void main(String[] args) {
		Intro37_arrayMaxConsecutiveSum_1st thisClass = new Intro37_arrayMaxConsecutiveSum_1st();
		
		int[] inputArray = {2, 3, 5, 1, 6};
		int k = 2;
		
		System.out.println(thisClass.arrayMaxConsecutiveSum(inputArray, k));
	}
	
	int arrayMaxConsecutiveSum(int[] inputArray, int k) {
	    int sum = 0;
	    for(int i = 0; i < inputArray.length-k+1; i++){
	        int temp = 0;
	        for(int j = 0 ; j < k; j++){
	            temp += inputArray[j+i];
	        }
	        if(temp > sum) sum = temp;
	    }
	    return sum;
	}
}

/*



*/