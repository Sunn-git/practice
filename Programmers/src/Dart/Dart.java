package Dart;

public class Dart {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T"; // 37
//		String dartResult = "1D2S#10S"; // 9
//		String dartResult = "1D2S0T"; // 3
//		String dartResult = "1S*2T*3S"; // 23
//		String dartResult = "1D#2S*3S"; // 5
//		String dartResult = "1T2D3D#"; // -4
//		String dartResult = "1D2S3T*"; // 59
		
		int answer = 0;
		
//		for(int i = 0; i < dartResult.length(); i++) {
//			switch (dartResult.charAt(i)) {
//			case 'S': dartResult = dartResult.substring(0, i)
//								 + dartResult.substring(i+1);
//				break;
//				
//			case 'D': 
//				break;
//				
//			case 'T':
//				break;
//				
//			case '*':
//				break;
//				
//			case '#':
//				break;
//			}
//		}
		
		
		String[] array = dartResult.split("");
		
		for(int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "S": array[i] = " "; 
				break;
				
			case "D": if(i > 1) {
						if(array[i-1] == "0" && array[i-2] != "1") {
							 array[i] = " "; 
						}else if(array[i-1] == "0" && array[i-2] == "1") {
							array[i-2] = " ";
							array[i-1] = " ";
							array[i] = Integer.toString(100) + " ";
						}else {
							int temp = Integer.parseInt(array[i]);
							array[i] = Integer.toString(temp*temp) + " ";
						}
						
					}else {
						int temp = Integer.parseInt(array[i]);
						array[i] = Integer.toString(temp*temp) + " ";	
					}
				break;
				
			case "T": if(i > 1) {
						if(array[i-1] == "0" && array[i-2] != "1") {
							 array[i] = " "; 
						}else if(array[i-1] == "0" && array[i-2] == "1") {
							array[i-2] = " ";
							array[i-1] = " ";
							array[i] = Integer.toString(1000) + " ";
						}else {
							int temp = Integer.parseInt(array[i]);
							array[i] = Integer.toString(temp*temp*temp) + " ";
						}
						
					}else {
						int temp = Integer.parseInt(array[i]);
						array[i] = Integer.toString(temp*temp*temp) + " ";	
					}
				break;
				
			case "*":
				break;
				
			case "#":
				break;
			}
		}
		
		
		System.out.println(answer);
	}
	
	private static String[] score(String[] array, int t, int i) {
		String[] result = array;
		
		 if(i > 1) {
				if(result[i-1] == "0" && result[i-2] != "1") {
					result[i] = " "; 
				}else if(array[i-1] == "0" && result[i-2] == "1") {
					result[i-2] = " ";
					result[i-1] = " ";
					result[i] = Integer.toString((int) Math.pow(10, t)) + " ";
				}else {
					int temp = Integer.parseInt(result[i]);
					result[i] = Integer.toString((int)Math.pow(temp, t)) + " ";
				}
				
			}else {
				int temp = Integer.parseInt(result[i]);
				result[i] = Integer.toString((int)Math.pow(temp, t)) + " ";	
			}

		return result;
	}

	
	
}
