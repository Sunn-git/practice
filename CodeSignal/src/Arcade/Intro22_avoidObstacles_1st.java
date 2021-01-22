package Arcade;

public class Intro22_avoidObstacles_1st { 
	public static void main(String[] args) {
		Intro22_avoidObstacles_1st thisClass = new Intro22_avoidObstacles_1st();
		int[] inputArray = {5, 3, 6, 7, 9};
//		int[] inputArray = {2, 3};
//		int[] inputArray = {1, 4, 10, 6, 2};
		
		System.out.println(thisClass.avoidObstacles(inputArray));
	}
	
	int avoidObstacles(int[] inputArray) {
		int num = 2;
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] % num == 0) {
				num++;
				i = -1;
			}
		}
				
		return num;
	}
}

/*

처음에 장애물이 없는 빈 구간의 길이로 답을 구하려고 했으나 실패.
어차피 등차수열이기 때문에 2부터 차례대로 나누어 모든 배열 요소가 나눠떨어지지 않는 수를 구하는 방식으로 해결

*/