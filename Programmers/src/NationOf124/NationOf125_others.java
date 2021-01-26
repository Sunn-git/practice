package NationOf124;

public class NationOf125_others {
	public static void main(String[] args) {
		NationOf125_others thisClass = new NationOf125_others();
		
//		int n = 12;
		int n = 3;
		
		 String[] num = {"4","1","2"}; // 3으로 나눈 나머지가 0, 1, 2 >> 인덱스가 된다 대박
	      String answer = "";

	      while(n > 0){
	          answer = num[n % 3] + answer;
	          n = (n - 1) / 3; // 위처럼 했기 때문에 (n - 1) / 3;를 할 수 있다.
	      }
        
        System.out.println(answer);
	}
}
