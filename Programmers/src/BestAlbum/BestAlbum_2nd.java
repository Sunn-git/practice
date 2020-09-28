package BestAlbum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestAlbum_2nd {

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500}; // {4, 1, 3, 0}

		HashMap<String, Integer> count = new HashMap<String, Integer>();
		HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();
		
		int length = genres.length;
		
		for(int i = 0; i < length; i++) {
			if(count.containsKey(genres[i])) {
				count.put(genres[i], count.get(genres[i])+plays[i]);
			}else {
				count.put(genres[i], plays[i]);
			}
			
			number.put(i, plays[i]);
		}
		
		System.out.println(count);
		System.out.println(number);
		
		List<Integer> valueList = new ArrayList<Integer>(count.values());
		List<Integer> valueList2 = new ArrayList<Integer>(number.values());
		
		Collections.sort(valueList);
		Collections.reverse(valueList); // 두개 다 해줘야 내림차순이 된다

		Collections.sort(valueList2);
		Collections.reverse(valueList2); // 두개 다 해줘야 내림차순이 된다
		
		for(int i : valueList) {
			System.out.println(i);
		}
		
		for(int i : valueList2) {
			System.out.println(i);
			
		}
		
		
		for(int i = 0; i < valueList.size(); i++) {
			for(int j = 0; j < length; j++) {
			}
		}
	

		
		
		int[] answer = {};
		
//		System.out.println(answer);
	}

}
