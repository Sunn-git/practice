package Arcade;

public class Intro17_arrayChange_1st { 
	public static void main(String[] args) {
		int[] inputArray = {};
		
		System.out.println(arrayChange(inputArray));
	}
	
	static int arrayChange(int[] inputArray) {
	    int cnt = 0;
	    int temp = inputArray[0];
	    for(int i = 1; i < inputArray.length; i++){
	        if(temp < inputArray[i]) {
	            temp = inputArray[i];
	            continue;
	        }
	        
	        if(temp >= inputArray[i]){
	            inputArray[i]++;
	            cnt++;
	            i--;
	        } 
	    }
	    return cnt;
	}
}
