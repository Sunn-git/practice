package Sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class sorting_2nd {

	public static void main(String[] args) { //(0.74ms, 52.8MB)
//		String[] strings = {"sun", "bed", "car"};
//		int n = 1; // "car", "bed", "sun"
		
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2; // abcd, abce,cdx
		
		String[] answer = new String[strings.length];
		
		ArrayList<Character> a = new ArrayList<Character>();
		
		for(String s : strings) {
			if(!a.contains(s.charAt(n)))
			a.add(s.charAt(n));
		}
		
		a.sort(null);
		
		Queue<Character> queue = new LinkedList<Character>();
		
		for(Character c : a) {
			queue.offer(c);
		}
		
		ArrayList<String> words = new ArrayList<String>();
		
		int index = 0;

		while(!queue.isEmpty()) {
			Character c = queue.poll();
			
			for(int i = 0; i < strings.length; i++) {
				if(strings[i].charAt(n) == c) {
					words.add(strings[i]);
				}
				
				if(i == strings.length-1) {
					words.sort(null);
					
					for(String s : words) {
						answer[index++] = s;
					}
					
					words = new ArrayList<String>();
				}
			}
				
		}
		
		
		for(String s : answer) {
			System.out.printf("%s, ", s);
		}
		
		
	}

}





/*

해당 인덱스의 글자만 모아서 배열을 만듦.
배열을 오른차순으로 정렬  >> queue생성

큐에서 하나씩 꺼낼 때마다 for문을 돌면서 단어를 꺼내 arrayList에 넣고  다 담기면 그 안에서 정렬
정렬된 단어들을 순서대로 배열에 담고 arrayList 리셋 후 queue가 빌 때까지 반복

*/