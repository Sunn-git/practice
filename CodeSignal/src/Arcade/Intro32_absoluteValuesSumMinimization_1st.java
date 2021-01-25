package Arcade;

public class Intro32_absoluteValuesSumMinimization_1st { 
	public static void main(String[] args) {
		Intro32_absoluteValuesSumMinimization_1st thisClass = new Intro32_absoluteValuesSumMinimization_1st();
		int[] a = {2, 4, 7};
		System.out.println(thisClass.absoluteValuesSumMinimization(a));
	}
	
	int absoluteValuesSumMinimization(int[] a) {
	    int sum = Integer.MAX_VALUE;
	    int x = 0;
	    for(int i = 0; i < a.length; i++){
	        int temp = 0;
	        for(int j = 0; j < a.length; j++){
	            temp += Math.abs(a[i] - a[j]);
	        }
	        
	        if(temp < sum){
	            sum = temp;
	            x = a[i];
	        }
	    }
	    return x;
	}
	
//	thucnguyen's solution
	int absoluteValuesSumMinimization_others(int[] A) {
	    return A[(A.length-1)/2];

	}	
}

/*

1~6위 답이 다 똑같다..
정렬된 배열이라서 배열 가운데 값이 가장 편차가 적은 수 일 수 밖에 없었다.
왜 이런 생각을 못했지?
배열의 길이가 2인 경우, 두 수의 편차가 같다
*/