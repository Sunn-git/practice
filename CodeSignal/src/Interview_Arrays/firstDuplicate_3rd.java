package Interview_Arrays;

public class firstDuplicate_3rd {
	public static void main(String[] args) {
		int[] a = {2, 1, 5, 3, 3, 2};
		
		int duplicate = -1;

		for(int i = 0; i < a.length; i++) {
			int num = a[i];
			int abs = Math.abs(num)-1; //idx로 바꿔주기 ( 1 <= a[i] <= a.length)
			
			if(a[abs] < 0) { // 배열 값이 음수인 경우
				duplicate = Math.abs(num);
				break;
			}else {
				a[abs] = -a[abs]; // 배열 값이 양수면 음수로 바꿔주기
			}
			
			for(int k : a) {
				System.out.printf("%d ", k);
			}
			System.out.println();
			
		}

		System.out.printf("duplicate : %d\n", duplicate);
	}
}

/* 

다른 사람의 답. 
아직 이해 못함.

*/