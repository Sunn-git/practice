package Dart;

//import java.util.Arrays;

public class Dart_3rd {

	public static void main(String[] args) { // (11.74ms, 53.5MB) Stream 사용
											 // (2.24ms, 52.7MB) for문 사용
//		String dartResult = "1S2D*3T"; // 37
//		String dartResult = "1D2S#10S"; // 9
//		String dartResult = "1D2S0T"; // 3
//		String dartResult = "1S*2T*3S"; // 23
//		String dartResult = "1D#2S*3S"; // 5
//		String dartResult = "1T2D3D#"; // -4
		String dartResult = "1D2S3T*"; // 59
		
		int answer = 0;
		
//		int[] score = Arrays.stream(dartResult.split("[SDT][*#]?"))
//							.mapToInt(Integer::parseInt).toArray();
		
		String[] stringScore = dartResult.split("[SDT][*#]?");
		int[] score = new int[3];
		
		for(String s : stringScore) {
			System.out.println(s);
		}
		
		for(int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(stringScore[i]);
		}
		
//		System.out.println(score.length);
//		
//		for(int s : score) {
//			System.out.println(s);
//		}
//		
//		System.out.println("=================");
		
		int index = -1;
		
		for(int i = 0; i < dartResult.length(); i++) {	
			char c = dartResult.charAt(i);
			
			if(c >= '0' && c <= '9') {
				if(i > 0 && c == '0' 
						&& dartResult.charAt(i-1) == '1') continue;
				
				index++;
				continue;
			}
			
			int num = score[index];
			
			switch (c) {

			case 'T': score[index] *= num;			
			case 'D': score[index] *= num;
				break;

			case '#': score[index] *= (-1);
			break;
				
			case '*': if(index > 0) score[index-1] *= 2;
					  score[index] *= 2; 
				break;
			}
		}
		
		for(int s : score) {
			answer += s;
		}
		

	System.out.println(answer);
	}
}
