package Dart;

public class Dart_2nd {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T"; // 37
//		String dartResult = "1D2S#10S"; // 9
//		String dartResult = "1D2S0T"; // 3
//		String dartResult = "1S*2T*3S"; // 23
//		String dartResult = "1D#2S*3S"; // 5
//		String dartResult = "1T2D3D#"; // -4
//		String dartResult = "1D2S3T*"; // 59
		
		int answer = 0;
		
		String[] array = dartResult.split("");
		
		for(int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "S": array[i] = " "; 
				break;
				
			case "D": array = score(array, 2, i);
				break;
				
			case "T": array = score(array, 3, i); 
				break;
				
			case "*": array = score(array, -2, i); 
				break;
				
			case "#": array = score(array, -1, i); 
				break;
			}
		}
		
		for(String s : array) {
			System.out.printf("%s", s);
		}
		
//		System.out.println(answer);
	}
	
	private static String[] score(String[] array, int t, int i) {
		String[] result = array;
		
		int temp = Integer.parseInt(result[i-1].replace(" ", ""));
		
		int r = 0;
		
		switch (t) {
		case 1: 
		case 2:
		case 3: r = (int)Math.pow(temp, t);
			break;

		case -1: r = temp * t;
			break;
			
		case -2: r = temp * 2;
			break;
		}
		
		 if(i > 1) {
				if(result[i-1].equals("0") && !result[i-2].equals("1")) {
					result[i] = " "; 
				}else if(array[i-1].equals("0") && result[i-2].equals("1")) {
					result[i-2] = " ";
					result[i-1] = " ";
					result[i] = Integer.toString((int) Math.pow(10, t)) + " ";
				}else {
					result[i] = Integer.toString(r) + " ";
				}
				
			}else {
				result[i] = Integer.toString(r) + " ";	
			}	

		return result;
	}
	
//	private static String[] option(String[] array, int t, int i) {
//		String[] result = array;
//
//		if(i > 1) {
//			if(result[i-1] == "0" && result[i-2] != "1") {
//				result[i] = " "; 
//			}else if(array[i-1] == "0" && result[i-2] == "1") {
//				result[i-2] = " ";
//				result[i-1] = " ";
//				result[i] = Integer.toString(10 * t) + " ";
//			}else {
//				int temp = Integer.parseInt(result[i]);
//				result[i] = Integer.toString(temp * t) + " ";
//			}
//			
//		}else {
//			int temp = Integer.parseInt(result[i]);
//			result[i] = Integer.toString(temp * t) + " ";	
//		}
//		
//		return result;
//	}

	
	
}
