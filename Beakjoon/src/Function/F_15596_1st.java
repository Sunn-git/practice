package Function;

public class F_15596_1st { //���� N���� ��

	public static void main(String[] args){
		int[] a = {3,4,5};
		long sum = 0;
		
		int index = 0;
		while(index < a.length) {
			sum += a[index++];
		}

		System.out.println(sum);
	}

}
