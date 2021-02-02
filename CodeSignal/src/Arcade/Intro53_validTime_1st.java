package Arcade;

public class Intro53_validTime_1st { 
	public static void main(String[] args) {
		Intro53_validTime_1st thisClass = new Intro53_validTime_1st();
		
		System.out.println(Integer.parseInt("00"));
		
		System.out.println(thisClass.validTime_others("12:55"));
		
	}
	
	boolean validTime(String time) {
	    String[] arr = time.split(":");
	    boolean hour = (0 <= Integer.parseInt(arr[0])) && (Integer.parseInt(arr[0])<= 23);
	    boolean minute = (0 <= Integer.parseInt(arr[1])) && (Integer.parseInt(arr[1]) <= 59);
	    return hour && minute;
	}
	
	
//	nguyen_k9's solution
	Object validTime_others(String s) {
	    return s.matches("([01]\\d|2[0-3]):[0-5]\\d");
	    
	    //return type을 boolean으로 해도 이상없다.
	}
}

/*

이런 문제는 정규식을 사용하는게 훨씬 깔끔한 것 같다.

*/