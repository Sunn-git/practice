package Arcade;

public class Intro14_alternatingSums_2nd_others { //jocke93's solution
	public static void main(String[] args) {
		int[] a = {50, 60, 60, 45, 70}; //180, 105
		
		int[] result = new int[2];
		for(int i = 0; i < a.length; i++) {
			result[i % 2] += a[i];
			//그냥 0부터 바로해도 되고 삼항연산자 안써도 됨 ㅋㅋㅋㅋㅋㅋㅋ
		}
		
		for(int i : result) {
			System.out.printf("%d, ", i);
		}
	}
}
