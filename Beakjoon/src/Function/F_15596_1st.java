package Function;

public class F_15596_1st { //정수 N개의 합

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
