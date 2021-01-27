package Arcade;

public class Intro39_knapsackLight_1st { 
	public static void main(String[] args) {
		Intro39_knapsackLight_1st thisClass = new Intro39_knapsackLight_1st();
		
		System.out.println(thisClass.knapsackLight(10, 5, 6, 4, 8));
	}
	
	int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) { 
	    boolean carry1 = weight1 <= maxW;
	    boolean carry2 = weight2 <= maxW;
	    
	    if(carry1 && carry2){ //둘 다 각각 들 수 있는 경우
	        return (weight1+weight2 <= maxW)? value1+value2 : Math.max(value1, value2);
	    }else if(!(carry1 || carry2)){ // 둘 다 각각 못드는 경우
	        return 0;
	    }
	    
	    return carry1? value1 : value2;
	}
	
}

/*

java에서는 별로 참신한 풀이가 없는 것 같다.

*/