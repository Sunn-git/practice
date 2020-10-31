package WinterCoding;

public class One {

	public static void main(String[] args) {
//		int n = 6;
//		int[][] delivery = { {1,3,1}
//							,{3,5,0}
//							,{5,4,0}
//							,{2,5,0}}; // O?O?X?

		int n = 7;
		int[][] delivery = { {5,6,0}
							,{1,3,1}
							,{1,5,0}
							,{7,6,0}
							,{3,7,1}
							,{2,5,0}}; // O?O?X?
		
		int[] stock = new int[n+1];
		
		for(int i = 0; i < delivery.length; i++) {
			if(delivery[i][2] == 1) {
				stock[delivery[i][0]] = 1;
				stock[delivery[i][1]] = 1;
			}
			
		}
		
		for(int i = 0; i < delivery.length; i++) {
			if(delivery[i][2] == 0) {
				if( stock[delivery[i][0]] == 1) {
					stock[delivery[i][1]] = -1;
					
				} else if(stock[delivery[i][1]] == 1 ) {
					stock[delivery[i][0]] = -1;
				}		
			}
			
		}
		
		
		String answer = "";
		
		
		for(int i = 1; i < stock.length; i++) {
			if(stock[i] == 0){
				answer += "?";
			}else if(stock[i] == 1) {
				answer += "O";
			}else {
				answer += "X";
			}
		}
		
		
		
		
		System.out.println(answer);
	}

}

/*
o는 무조건 o
o랑 섞였는데 x면 무조건 x
나머지는 ?
*/