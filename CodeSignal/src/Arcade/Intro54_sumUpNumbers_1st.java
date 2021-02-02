package Arcade;

import java.util.Arrays;

public class Intro54_sumUpNumbers_1st { 
	public static void main(String[] args) {
		Intro54_sumUpNumbers_1st thisClass = new Intro54_sumUpNumbers_1st();
		
		
	}
	
	int sumUpNumbers(String inputString) {
	    String[] arr = inputString.split("\\D+");
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(!arr[i].isEmpty()){
	            sum += Integer.parseInt(arr[i]);
	        }
	    }
	    return sum;
	}

	
//	ben_w6's solution
	int sumUpNumbers_others(String inputString){
	    return Arrays.stream(inputString.split("\\D+"))
	    								.filter(s -> !s.isEmpty())
	    								.mapToInt(Integer::new).sum();
//	    stream을 사용하면 이렇게 표현할 수 있겠다.
	}
	
}

/*



*/