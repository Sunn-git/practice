package Arcade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Intro33_stringsRearrangement_1st { // 입력값별로 한글자가 없는 정규표현식을 만들어 비교하려했으나 실패
	public static void main(String[] args) {
		Intro33_stringsRearrangement_1st thisClass = new Intro33_stringsRearrangement_1st();
		
//		String[] inputArray = {"abc", 
//							   "bef", 
//							   "bcc", 
//							   "bec", 
//							   "bbc", 
//							   "bdc"};
		
		String[] inputArray = {"aba", 
				 "bbb", 
				 "bab"};
		
//		String[] inputArray = {"ab", 
//				 "bb", 
//				 "aa"};
		
//		String[] inputArray = {"ab", 
//				 "aa"};
//		String[] inputArray = {};
		
		System.out.println(thisClass.stringsRearrangement(inputArray));
		
	}
	
	boolean stringsRearrangement(String[] inputArray) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashSet<String> set = new HashSet<String>();
//		int[] arr = new int[inputArray.length];
//	    String reg = "";
		
		Arrays.sort(inputArray);
		
		for(int i = 0; i < inputArray.length; i++){
			if(i > 0 && inputArray[i-1].equals(inputArray[i])) return false;
	        String temp = "";
	        for(int j = 0; j < inputArray[0].length(); j++) {
	        	//정규표현식 만들기
	        	if(j > 0) temp = temp.concat(inputArray[i].substring(0, j));
	        	temp = temp.concat(".");
	        	if(j < inputArray[0].length()-1) temp = temp.concat(inputArray[i].substring(j+1));
	        	
	        	set.add(temp);
	        	temp = ""; // reg 초기화
	        } // j for end
	    } // i for end
		
		String[] regs = new String[set.size()];
		set.toArray(regs);
		set.clear();
		
		for(int i = 0; i < regs.length; i++) {
			int cnt = 0;
			for(int j = 0; j < inputArray.length; j++) {
				if(inputArray[j].matches(regs[i])) {
					cnt++;
				}
			}
			
			if(cnt > 1) set.add(regs[i]);
		}
		
		regs = new String[set.size()];
		set.toArray(regs);
		
//		for(int i = 1; i < regs.length; i++) {
//			for(int j = 0; j < inputArray.length; j++) {
//				if(!inputArray[j].matches(regs[i-1]) && !inputArray[j].matches(regs[i])) {
//					
//				}
//			}
//		}
		int num = (regs.length == 1)? 3 : regs.length;
		for(int i = 0; i < inputArray.length; i++) {
			int cnt = 0;
			for(int j = 0; j < regs.length; j++) {
				if(inputArray[i].matches(regs[j])) {
					cnt++;
					if(regs.length == 1) num--;
				}
			}
			if(cnt == 0) return false;
			if(cnt >= 2) num--;
		}
		
		
		System.out.println(set);
	    System.out.println(num);
		
	    return (num == 1)? true : false;
	}
}

/*



*/