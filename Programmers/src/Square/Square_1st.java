package Square;

public class Square_1st { //(0.05ms, 52.2MB)

	public static void main(String[] args) {
//		long n = 121; //144
		
		long n = 3; // -1
		
		long answer = 0;
		
		double root = Math.sqrt(n);
//		System.out.println(root);
		
		int temp = (int)root;
//		System.out.println(temp);
//		
//		double result = Math.pow(root, 2);
//		System.out.println(result);
//		제곱이 아니면 루트를 씌운 후 다시 제곱해도 실행 전과 같지 않다. 
//		java가 root값을 온전히 담지 못하는 듯 하다.
		
		answer = (root == temp) ? (long) Math.pow(temp+1, 2) : -1;
		
		System.out.println(answer);

	}

}
