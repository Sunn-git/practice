package Interview_Arrays;

public class firstDuplicate_3rd {
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 3, 2};
		
		int duplicate = -1;

		for(int i = 0; i < a.length; i++) {
			int num = a[i];
			int abs = Math.abs(num)-1; //idx로 바꿔주기 ( 1 <= a[i] <= a.length)
			
			if(a[abs] < 0) { // 배열 값이 음수인 경우 (해당 인덱스를 이미 방문한 경우 !!!)
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

배열 값의 범위가   ( 1 <= a[i] <= a.length)이기 때문에 가능한 풀이.
배열 값을 index로 사용해서 해당 index의 값을 음수로 변경.
중복값이 등장해 이미 지나온 index를 다시 호출하는 경우 값이 음수이므로 중복임을 알 수 있다.
가장 처음 만나는 중복값을 구할 수 있는 방법.
첫 중복값을 만난 후에는 break로 반복문을 빠져나간다 


*/