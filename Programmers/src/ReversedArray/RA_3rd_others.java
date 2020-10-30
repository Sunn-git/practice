package ReversedArray;

public class RA_3rd_others {

	public static void main(String[] args) { // (15.65ms, 53.3MB)
		// 배열의 길이를 구하기 위해 queue를 사용할 필요가 없는 풀이
		// 코드는 훨씬 간단한데 소요시간은 거의 100배 차이나네.. 왜지
		long n = 12345;

		String s = "" + n; // String으로 변환하여 길이를 구해준다.
		int[] answer = new int[s.length()];
		
		int cnt = 0; // index
		
		while(n > 0) {
			answer[cnt++] = (int)(n%10);
			n /= 10;
		}
		
		for(int i : answer) {
			System.out.printf("%d, ", i);
		}

	}

}
