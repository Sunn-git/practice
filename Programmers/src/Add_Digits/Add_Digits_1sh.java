package Add_Digits;

public class Add_Digits_1sh { //(0.03ms, 54.5MB)

	public static void main(String[] args) {
//		int n = 123; // 6
		
		int n = 987; // 24
		
		int answer = 0;
		
		while(n > 0) {
			answer += (n % 10);
			n /= 10; 
		};
		
		
		
		System.out.println(answer);
		

	}

}
