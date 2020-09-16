package StockPrice;

public class StockPrice_1st {
	public static void main(String[] args) {
//		int[] prices = {1,2,3,2,3}; // 4,3,1,1,0
		
		int[] prices = {1, 2, 3, 2, 3, 3, 1};
//						6, 5, 1, 3, 2, 1, 0
		
		int[] answer = new int[prices.length];
		
		for(int i = 0; i < prices.length; i++) {
			for(int j = i+1; j < prices.length; j++) {
				if(prices[i] > prices[j] || j == prices.length-1) {
					answer[i] = j-i;
					break;
				}
			}
		}
		
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
