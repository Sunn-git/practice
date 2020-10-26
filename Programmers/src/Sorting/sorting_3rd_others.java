package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_3rd_others {

	public static void main(String[] args) { // 이렇게 간단하게 하는 것도 가능..
//		String[] strings = {"sun", "bed", "car"};
//		int n = 1; // "car", "bed", "sun"
		
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2; // abcd, abce,cdx
		
		String[] answer = {};
		
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(arr);
        
        answer = new String[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
		
		
	}

}

