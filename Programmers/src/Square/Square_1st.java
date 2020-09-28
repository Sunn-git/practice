package Square;

public class Square_1st { //(0.05ms, 52.2MB)

	public static void main(String[] args) {
		long n = 121; //144
		
//		long n = 3; // -1
		
		long answer = 0;
		
		double root = Math.sqrt(n);
		
		int temp = (int)root;
		
		answer = (root == temp) ? (long) Math.pow(temp+1, 2) : -1;
		
		System.out.println(answer);

	}

}
