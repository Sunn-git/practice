package Max;

public class Max_1st { // 예제만 통과하고 테스트케이스 통과못함

	public static void main(String[] args) {
//		int[] numbers = {6, 10, 2}; // "6210"

		int[] numbers = {3, 30, 34, 5, 9}; // "9534330"
		
		String answer = "";
		
		int temp = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i; j < numbers.length; j++) {
				
				int a = numbers[i];
				while(a >= 10) {
					a /= 10;
				}
				
				int b = numbers[j];
				while(b >= 10) {
					b /= 10;
				}
				
				if(a < b) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}else if(a == b) {
					if(numbers[i] < numbers[j]) {
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;	
					}
				}
				
			}
		}
		
		for(int i : numbers) answer += i;
		
		
		System.out.println(answer);
	}

}
