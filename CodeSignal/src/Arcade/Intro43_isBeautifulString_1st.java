package Arcade;

public class Intro43_isBeautifulString_1st { 
	public static void main(String[] args) {
		Intro43_isBeautifulString_1st thisClass = new Intro43_isBeautifulString_1st();
		
		
	}
	
	boolean isBeautifulString(String inputString) {
	    int[] arr = new int[26];
	    
	    for(int i = 0; i < inputString.length(); i++){ //여기는 향상된 for문을 써줘도 된다.
	        arr[inputString.charAt(i)-'a']++;
	    }
	    
	    for(int i = 0; i < arr.length-1; i++){
	        if(arr[i] < arr[i+1]) return false;
	    }
	    
	    return true;
	}
}

/*

a부터 순서대로 하나라도 없으면 false이다.
inputString에 주어진 알파벳만으로 하는게 아니었음

*/