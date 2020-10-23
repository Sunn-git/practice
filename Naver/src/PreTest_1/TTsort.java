package PreTest_1;

public class TTsort {

	public static void main(String[] args) {
		int[] a = {5, 10, 66, 77, 54, 32, 11,15};
		
//		choice(a);
		insert(a);
		
		for(int i : a) {
			System.out.printf("%d ", i);
		}

	}
	
	//선택정렬(오름차순) :주어진 데이터 중 최소값을 찾음
//					 최소값을 맨 앞에 위치한 값과 교환
//					 정렬된 데이터를 제외한 나머지 테이터를 같은 방법으로 정렬
//					  데이터의 양이 적을 때 사용, 100개 이상인 경우 효율이 급격히 떨어진다.
//					 O(n^2)
	private static void choice(int[] a) {
		int min = 0;
		int temp = 0;
		
		for(int i = 0; i < a.length; i++) {
			min = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[min] > a[j]) {
					min = j;
				}
			}
			
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	
	//삽입정렬(오름차순): 기준을 정하고
//					 그 기준보다 작은 수는 이미 정렬된 부분과 비교하여 알맞는 위치에 삽입
//					 O(n^2)
	private static void insert(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			
			while(j > 0 && a[j-1] > temp) {
				a[j] = a[j-1];
				--j;
			}
			a[j] = temp;
		}
		
	}
	
	//병합정렬
	private static void merge() {
		
	}
	
	//퀵정렬
	private static void quick() {
		
	}
	

}
