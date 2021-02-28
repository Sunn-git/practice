package Arcade_TheCore;

public class TheCore09_reachNextLevel {
	public static void main(String[] args) {
		TheCore09_reachNextLevel thisClass = new TheCore09_reachNextLevel();
		
		boolean answer = thisClass.reachNextLevel(10, 15, 5);
		System.out.println(answer);
	}
	
	boolean reachNextLevel(int experience, int threshold, int reward) {
	    return threshold-experience <= reward;
	}



	
	
}

/*


*/