package SecretMap;

public class SecretMap_2nd {

	public static void main(String[] args) { // 비트연산자 사용 (2.90ms, 52.4MB)
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};  
//		"#####","# # #", "### #", "# ##", "#####"
		
//		int n = 6;
//		int[] arr1 = {46, 33, 33 ,22, 31, 50};
//		int[] arr2 = {27 ,56, 19, 14, 14, 10};  
////	"######", "### #", "## ##", " #### ", " #####", "### # "

		String[] answer = new String[n];

		answer = decode(n, arr1, arr2);
		
		for(String s : answer) {
			System.out.println(s);
		}

	}

	private static String[] decode(int n, int[] arr, int[] arr2) {
		String[] result = new String[n];
		
		for(int i = 0; i < n; i++) {
			result[i] = "";
			
			String temp = Integer.toBinaryString(arr[i] | arr2[i]);
			
			if(temp.length() < n) {
				while(temp.length() < n) {
					temp = "0" + temp;
				}
			}
			
			for(int j = 0; j < n; j++) {
				result[i] += (temp.charAt(j) == '1') ? "#" :  " ";	
			}
			
		}
		return result;
	}
	
//	
//	private static String[] decode(int n, int[] arr, String[] map) {
//		String[] result = map;
//		
//		for(int i = 0; i < n; i++) {
//			String temp = Integer.toBinaryString(arr[i]);
//			
//			if(temp.length() < n) {
//				while(temp.length() < n) {
//					temp = "0" + temp;
//				}
//			}
//			
//			result[i] = temp;			
//		}
//		return result;
//	}

}
