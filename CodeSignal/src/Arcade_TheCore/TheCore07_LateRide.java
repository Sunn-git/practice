package Arcade_TheCore;

public class TheCore07_LateRide {
	public static void main(String[] args) {
		TheCore07_LateRide thisClass = new TheCore07_LateRide();
		
		
		int answer = thisClass.lateRide(808);
		System.out.println(answer);
	}
	
	int lateRide(int n) {
	    int hours = n/60;
	    int minutes = n%60;
	    
	    int answer = 0;
	    while(hours != 0 || minutes != 0){
	        answer += (hours%10 + minutes%10);
	        
	        hours /= 10;
	        minutes /= 10;
	    }
	    return answer;
	}
	
//	mikeconig's solution
	int lateRide_others(int n) {
	    int hours = n/60;
	    int minutes = n%60;
	    return hours/10 + hours%10 + minutes/10 + minutes%10;
	    // 어차피 00:00이기 때문에(길이가 짧고 정해져있다.) 이렇게 해줘도 된다.
	}



	
	
}

/*


*/