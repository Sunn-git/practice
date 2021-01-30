package Arcade;

public class Intro47_isMAC48Address_1st { 
	public static void main(String[] args) {
		Intro47_isMAC48Address_1st thisClass = new Intro47_isMAC48Address_1st();
		
		
	}
	
	boolean isMAC48Address(String inputString) {
	    String[] arr = inputString.split("-", 6);
	    
	    for(String s : arr){
	        if(!s.matches("[0-9A-F][0-9A-F]")) return false;
	    }
	    return true;
	}
	
	
//	pixelstorm's solution
	boolean isMAC48Address_others(String inputString) { 
	    return inputString.matches("^([0-9A-F][0-9A-F]-){5}[0-9A-F][0-9A-F]$");
	}

//	simon_s9's solution
	boolean isMAC48Address_others2(String s) {
	    return (s + "-").matches("([A-F0-9]{2}-){6}");
	}
	
}

/*

(reg){반복횟수} 형태 기억해두자 !

*/