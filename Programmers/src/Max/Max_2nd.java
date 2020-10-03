package Max;

import java.util.Arrays;
import java.util.Comparator;

public class Max_2nd { // 구글링 : 문자열을 내림차순 정렬하기(2978.15ms, 361MB)

	public static void main(String[] args) {
//		int[] numbers = {6, 10, 2}; // "6210"

		int[] numbers = {3, 30, 32, 5, 9}; // "9534330"
		
		
		
		String answer = "";
		
		String[] temp = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			temp[i] = Integer.toString(numbers[i]);
		}
		
//		String[] n = {"a", "A", "b", "B", "1", "5"};
		
		Arrays.sort(temp, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
//				문자열 내림차순 청렬 >> 9 5 3 32 30 / baBA51
				
//				return (o1+o2).compareTo(o1+o2);
//				문자열 오름차순 정렬 >> 3 30 32 5 9 / aAbB15
			}
		});
		
		if(temp[0].equals("0")) {
			answer = "0";
		}else {
			for(String s : temp) answer += s;			
		}

		
		System.out.println(answer);
	}

}
