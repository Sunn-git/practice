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
	
	//��������(��������) :�־��� ������ �� �ּҰ��� ã��
//					 �ּҰ��� �� �տ� ��ġ�� ���� ��ȯ
//					 ���ĵ� �����͸� ������ ������ �����͸� ���� ������� ����
//					  �������� ���� ���� �� ���, 100�� �̻��� ��� ȿ���� �ް��� ��������.
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
	
	//��������(��������): ������ ���ϰ�
//					 �� ���غ��� ���� ���� �̹� ���ĵ� �κа� ���Ͽ� �˸´� ��ġ�� ����
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
	
	//��������
	private static void merge() {
		
	}
	
	//������
	private static void quick() {
		
	}
	

}
