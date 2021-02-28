package Arcade_TheCore;

public class TheCore10_knapsackLight {
	public static void main(String[] args) {
		TheCore10_knapsackLight thisClass = new TheCore10_knapsackLight();
		
		int answer = thisClass.knapsackLight(10, 5, 6, 4, 8);
		System.out.println(answer);
	}
	
	int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
	    if(weight1 + weight2 <= maxW) return value1 + value2;
	    if(weight1 <= maxW && weight2 > maxW) return value1;
	    if(weight1 > maxW && weight2 <= maxW) return value2;
	    if(weight1 <= maxW && weight2 <= maxW) return Math.max(value1, value2);
	    return 0; 
	}

	int knapsackLight2(int value1, int weight1, int value2, int weight2, int maxW) {
	    boolean w1 = weight1 > maxW, w2 = weight2 > maxW;
	    if(weight1 + weight2 <= maxW) return value1 + value2;
	    if(!w1 && w2) return value1;
	    if(w1 && !w2) return value2;
	    if(!(w1 && w2)) return Math.max(value1, value2);
	    return 0; 
	}
	
	
	
//	sujil_m's solution
	int knapsackLight_others(int value1, int weight1, int value2, int weight2, int maxW) {
	    int val = 0;
	    
	    if (weight1 + weight2 <= maxW) return value1 + value2;
	    
	    if (weight1 <= maxW) {val = value1;} // 일단 v1의 무게가 가벼우면 val에 v1을 넣고
	    if (weight2 <= maxW && value2 > val) val = value2; // 여기서 v2의  무게도 가벼우면 v2와 비교한다.
	    
	    return val;
	    
	}

	
	
}

/*

Intro에도 나왔던 문제.
*/