package Function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class F_4673_1st { // ¼¿ÇÁ ³Ñ¹ö

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int[] array = new int[10001];

		for(int i = 1; i < array.length; i++) {
			if(array[i] == 1) continue;
			
			array = d(i, array);
		}
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] == 0) bw.write(i+"\n");
		}
		
		bw.flush();
				
	}
	
	private static int[] d(int n, int[] array) {
		int temp = n;
		int[] arr = array;
		int sum = n;
		
		if(n >= 10000) return arr;
		
		while(temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		
		if(sum <= 10000) arr[sum] = 1;
		
		return d(sum, arr);
	}

}
