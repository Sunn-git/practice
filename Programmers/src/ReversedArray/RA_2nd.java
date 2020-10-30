package ReversedArray;

import java.util.LinkedList;
import java.util.Queue;

public class RA_2nd {

	public static void main(String[] args) { //(0.17ms, 53.1MB)
		long n = 12345;
		Queue<Integer> queue = new LinkedList<Integer>();
		long temp = 0;
		
		while(n  >= 1) {
			temp = n % 10;

			queue.offer((int)temp);
			
			n /= 10;
		}
		
		int size = queue.size();
		int[] answer = new int[size];
		
		for(int i = 0; i < size; i++) {
			answer[i] = queue.poll();
		}
		
		for(int i : answer) {
			System.out.printf("%d, ", i);
		}

	}

}
