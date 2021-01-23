package Arcade;

import java.util.Arrays;

public class Intro25_arrayReplace_1st { 
	public static void main(String[] args) {
		Intro25_arrayReplace_1st thisClass = new Intro25_arrayReplace_1st();
		int[] inputArray = {1, 2, 1};
		int elemToReplace = 1;
		int substitutionElem = 3;
		
		thisClass.arrayReplace(inputArray, elemToReplace, substitutionElem);
		thisClass.arrayReplace_others(inputArray, elemToReplace, substitutionElem);
	}
	
	//내 풀이
	int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
	    for(int i = 0; i < inputArray.length; i++){
	        if(inputArray[i] == elemToReplace) inputArray[i] = substitutionElem;
	    }
	    
	    return inputArray;
	}
	
	//다른 사람의 풀이 stream 사용 dariusz_k1's solution
	int[] arrayReplace_others(int[] inputArray, int elemToReplace, int substitutionElem) {
	    return Arrays.stream(inputArray)
	    .map(o -> o == elemToReplace ? substitutionElem : o)
	       .toArray();
	}
}

/*



*/