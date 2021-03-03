package Arcade_TheCore;

public class TheCore16_MetroCard {
	public static void main(String[] args) {
		TheCore16_MetroCard thisClass = new TheCore16_MetroCard();
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
	}
	
	int[] metroCard(int lastNumberOfDays) {
	    //31 : 28, 30, 31
	    //30 : 31
	    //28 : 31
	    int[] others = {31};
	    int[] afterThirtyOne = {28, 30, 31};
	    return (lastNumberOfDays == 31)? afterThirtyOne : others;
	}


	
//	mssk's solution
	int[] metroCard_others(int lastNumberOfDays) {
	     if(lastNumberOfDays== 31)
	        return new int[]{28,30,31};
	    return new int[]{31};
	    //따로 변수설정을 해주지 않아도 된다.
	}	
	
}

/*


*/