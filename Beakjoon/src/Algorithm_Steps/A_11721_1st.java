package Algorithm_Steps;

import java.util.Scanner;

public class A_11721_1st { // 공백만 있는 입력이 다음줄이 출력될 때 같이 출력됐는데도 맞았다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}
