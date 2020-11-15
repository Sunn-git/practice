package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class S_1157_1st { // 단어 공부
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer();

		String s = br.readLine().toUpperCase();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {			
			map.put(s.charAt(i)	, (map.containsKey(s.charAt(i)) 
									? (map.get(s.charAt(i))+1) : 1));
		}

		Character[] keys = new Character[map.size()];
		map.keySet().toArray(keys);
		
		Arrays.sort(keys, new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
		});
		
		int max = 0;
		char C = '?';
		
		for(char c : keys) {
			if(map.get(c) > max) {
				max = map.get(c);
				C = c;
			}else if(map.get(c) == max) {
				C = '?';
			}else {
				break;
			}
		}
		
		sb.append(String.valueOf(C));
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
