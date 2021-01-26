package Arcade;

public class Intro35_firstDigit_1st { 
	public static void main(String[] args) {
		Intro35_firstDigit_1st thisClass = new Intro35_firstDigit_1st();
		
		String inputString = "var_1__Int";
		
		System.out.println(thisClass.firstDigit2(inputString));
		
	}
	
	char firstDigit(String inputString) {
	    int i = 0;
	    for(i = 0; i < inputString.length(); i++){
	        if(inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') 
	        	break;
	    }   
	    return inputString.charAt(i);
	}

	char firstDigit2(String inputString) {
		inputString = inputString.replaceAll("\\D", "");
		return inputString.charAt(0);
	}
	
	
//	fal_rnd's solution
	char firstDigit_others(String inputString) {
	    return inputString.replaceAll("[^0-9]","").charAt(0);
	    //이렇게 한번에 리턴해도 되는구나!
	}
	
//	toan_t13's solution
	char firstDigit_others2(String inputString) {
		for (char c : inputString.toCharArray()) {
		            if (Character.isDigit(c)) {
		                return c;
		            }
		        }
		        return 0;
		}
}

/*

Character.isDigit(c) 처음보는 메소드 ! 이런 메소드도 있다 !!

*/