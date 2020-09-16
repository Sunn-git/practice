package StockPrice;

public class StockPrice_2nd {
	//처음에 시도했다 틀린 방법.
//	if(prices[i] > prices[j]) break;
//	이 조건이 없어서 제대로 안나왔다......
	
	
	public static void main(String[] args) {
//		int[] prices = {1,2,3,2,3}; // 4,3,1,1,0
		
		int[] prices = {1, 2, 3, 2, 3, 3, 1};
//						6, 5, 1, 3, 2, 1, 0
		
		int[] answer = new int[prices.length];

		for(int i = 0; i < prices.length; i++) {
			for(int j = i+1; j < prices.length; j++) {
				answer[i]++;
				if(prices[i] > prices[j]) break;
			}
		}
		
		
	}

}
