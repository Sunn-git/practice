package SecretMap;

public class SecretMap_1st {

	public static void main(String[] args) { //(24.97ms, 53.6MB)
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};  
//		"#####","# # #", "### #", "# ##", "#####"
		
//		int n = 6;
//		int[] arr1 = {46, 33, 33 ,22, 31, 50};
//		int[] arr2 = {27 ,56, 19, 14, 14, 10};  
////	"######", "### #", "## ##", " #### ", " #####", "### # "

		String[] answer = new String[n];

		answer = decode(n, arr1, answer);
		answer = decode(n, arr2, answer);
		
		for(String s : answer) {
			System.out.println(s);
		}

	}

	private static String[] decode(int n, int[] arr, String[] answer) {
		String[] result = answer;
		
		for(int i = 0; i < n; i++) {
			
			if(result[i] == null) {
				result[i] = "";
			}
			
			String temp = Integer.toBinaryString(arr[i]);
			
			if(temp.length() < n) {
				while(temp.length() < n) {
					temp = "0" + temp;
				}
			}
			
			for(int j = 0; j < n; j++) {
				if(result[i].length() == n) {
					if(result[i].charAt(j) == ' ' && temp.charAt(j) == '1') {
						result[i] = result[i].substring(0, j)
								  + "#"
								  + result[i].substring(j+1);
					}
					
				}else {		
					result[i] += (temp.charAt(j) == '1') ? "#" :  " ";	
				}
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
