package Arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Intro57_fileNaming_1st { 
	public static void main(String[] args) {
		Intro57_fileNaming_1st thisClass = new Intro57_fileNaming_1st();
		

//		String[] names = {"doc", "doc", "image", "doc(1)", "doc"};
		String[] names = {"a(1)", 
				 "a(6)", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a", 
				 "a"};
//		String[] names = {"doc", 
//				 "doc", 
//				 "image", 
//				 "doc(1)", 
//				 "doc"};
		
		thisClass.fileNaming(names);
		
	}
	
	String[] fileNaming(String[] names) {
	   String[] result = new String[names.length];
	   HashSet<String> set = new HashSet<String>();
	   
	   for(int i = 0; i < names.length; i++) {
		   int cnt = 0;
		   for(int j = 0; j < i; j++) {
			   if(names[i].equals(names[j])) cnt++;
			   else {
				  if( names[i].equals(result[j])) cnt++;
			   }
			   
		   }
//		   System.out.println(i + "/" +cnt);
		   
		   if(cnt == 0) {
			   result[i] = names[i];
			   set.add(result[i]);
		   }else {
			   for(int k = 0; ; k++) {
				 if(set.add(names[i]+"("+(cnt+k)+")")) {
					 result[i] = names[i]+"("+(cnt+k)+")";
					 break;
				 }
			   } 
		   }
	   }
	    
//	    for(String s : result) {
//	    	System.out.println(s);
//	    }
	    
	    return result;
	}
	
	

//	pixelstorm's solution
	Object fileNaming_others(String[] names) {
//	    List<String> input = Arrays.asList(names);
	    List<String> result = new ArrayList<String>();
	    for( String s : names ){
	        if(result.contains(s)){ //중복인경우 이름을 변경해주는 if문
	            int i = 1; // 숫자를 세주기 위해 밖에 선언
	            for(; result.contains(s+"("+i+")") ;i++){ //i가 포함되는 동안 돌아가는 for문

	            }
	            s+="("+i+")";
	        }
	        result.add(s);
	    }
	    return result;
	}
	
	
}

/*



*/