package BestAlbum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestAlbum_1st {

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500}; // {4, 1, 3, 0}

		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		int length = genres.length;
		
		for(int i = 0; i < length; i++) {
			if(count.containsKey(genres[i])) {
				count.put(genres[i], count.get(genres[i])+plays[i]);
			}else {
				count.put(genres[i], plays[i]);
			}
		}
		
		System.out.println(count);
		
		List<Integer> valueList = new ArrayList<Integer>(count.values());
		
		Collections.sort(valueList);
		Collections.reverse(valueList); // 두개 다 해줘야 내림차순이 된다
		
		for(int i : valueList) {
			System.out.println(i);
		}
		
		
		
		
		int[] answer = {};
		
//		System.out.println(answer);
	}

}
