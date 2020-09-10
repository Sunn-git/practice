package CodeChallenges;

import java.util.ArrayList;

public class programing3 { // 완료시간 22:36 ... 맞았는지 궁금하다
	public static void main(String[] args) {
		int[] a = {-16, 27, -2, -92, -71, -68, -61, -33};
//		int[] a = {-9,1,2};
		
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			temp.add(a[i]);
		}
		
		for(int i = a.length-1; i > 1; i--) {
			if(temp.get(i-1) > temp.get(i)) temp.remove(i-1);
		}

		for(int i : temp) {
			System.out.println(i);
		}
		
		int answer = temp.size();
		
		System.out.println(answer);
	}
}
