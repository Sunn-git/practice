package Arcade;

public class Intro28_alphabeticShift_1st { 
	public static void main(String[] args) {
		Intro28_alphabeticShift_1st thisClass = new Intro28_alphabeticShift_1st();
		
		String inputString = "crazy";
		
		System.out.println(thisClass.alphabeticShift(inputString));
	}
	
	String alphabeticShift(String inputString) {
	    char[] arr = inputString.toCharArray();
	    
	    for(int i = 0; i < arr.length; i++){
	        arr[i] += (arr[i] == 'z')? -25 : 1;
	    }
	    
	    return String.valueOf(arr);
	}
	
	//viet_tran's solution
	String alphabeticShift_others(String inputString) {
	    char[] ss = inputString.toCharArray();
	    for (int i = 0; i < ss.length; ++i) {
	        ss[i]++;
	        if (ss[i] > 'z')
	            ss[i] = 'a';
	    }
	    return new String(ss);
	}
	
	//ben_w6's solution
	String alphabeticShift_others2(String inputString){
	    return new String(inputString.chars().map(
	    				x -> (x - 'a' + 1) % 26 + 'a').toArray(),
	    				0,
	    				inputString.length());
	}
}

/*

new String(ss);
이런식으로 String을 return할 수도 있구나 !

*/