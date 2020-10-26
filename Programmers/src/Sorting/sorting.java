package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sorting {

	public static void main(String[] args) {
//		String[] strings = {"sun", "bed", "car"};
//		int n = 1; // "car", "bed", "sun"
		
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2; // abcd, abce,cdx
		
		String[] answer = new String[strings.length];
		
		HashMap<String, Character> map = new HashMap<String, Character>();
		
		for(String s : strings) {
			map.put(s, s.charAt(n));
		}
		
//		System.out.println(map);
		
		List<String> keySetList = new ArrayList<String>(map.keySet());
		
		Collections.sort(keySetList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o1).compareTo(map.get(o2));
			}	
		}); // value기준 오름차순 정렬
		
		for(int i = 0; i < keySetList.size(); i++) {
			answer[i] = keySetList.get(i);
		}
		
		
		for(String s : answer) {
			System.out.printf("%s, ", s);
		}


	}

}
